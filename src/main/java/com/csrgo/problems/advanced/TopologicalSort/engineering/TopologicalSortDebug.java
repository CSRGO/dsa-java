// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TopologicalSort.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/topological-sort/
public class TopologicalSortDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int vtces, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[vtces];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            inDegree[u]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < vtces; i++) {
            if (inDegree[i] == 0) {
                pq.add(i);
            }
        }

        int[] result = new int[vtces];
        int idx = 1;

        while (!pq.isEmpty()) {
            int curr = pq.poll();
            if (idx < vtces) {
                result[idx++] = curr;
            }

            for (int neighbor : graph.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] <= 1) {
                    pq.add(neighbor);
                }
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Topological Sort (DEBUG) ====");
        System.out.print("Enter number of vertices: ");
        int vtces = scanner.nextInt();
        System.out.print("Enter number of directed edges: ");
        int e = scanner.nextInt();
        int[][] edges = new int[e][2];
        System.out.println("Enter " + e + " directed edges (u v):");
        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + " (u v): ");
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        int[] order = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Topological Order: " + Arrays.toString(order));
        System.out.println("========================");

        scanner.close();
    }
}
