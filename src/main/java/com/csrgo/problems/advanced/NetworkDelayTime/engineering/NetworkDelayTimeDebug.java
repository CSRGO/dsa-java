// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NetworkDelayTime.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/network-delay-time/
public class NetworkDelayTimeDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[]{v, w});
        }

        int[] dist = new int[n + 1];
        int INF = Integer.MAX_VALUE;
        Arrays.fill(dist, INF);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        pq.add(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int d = curr[1];

            if (d > dist[u]) {
                continue;
            }

            for (int[] edge : graph.get(u)) {
                int v = edge[0];
                int wt = edge[1];

                if (wt < dist[v]) {
                    dist[v] = wt;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }

        int maxTime = 0;
        for (int i = 0; i < n; i++) {
            if (dist[i] == INF) {
                return -1;
            }
            maxTime = Math.max(maxTime, dist[i]);
        }

        return maxTime;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Network Delay Time (DEBUG) ====");
        System.out.print("Enter total number of nodes n: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of directed edges: ");
        int e = scanner.nextInt();
        int[][] times = new int[e][3];
        System.out.println("Enter " + e + " directed edges (u v time):");
        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + " (u v time): ");
            times[i][0] = scanner.nextInt();
            times[i][1] = scanner.nextInt();
            times[i][2] = scanner.nextInt();
        }
        System.out.print("Enter source signal node k: ");
        int k = scanner.nextInt();

        int result = solve(times, n, k);

        System.out.println("------------------------");
        System.out.println("Minimum Time For All Nodes: " + result);
        System.out.println("========================");

        scanner.close();
    }
}
