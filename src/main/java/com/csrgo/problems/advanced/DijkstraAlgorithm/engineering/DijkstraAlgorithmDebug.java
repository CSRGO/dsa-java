// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DijkstraAlgorithm.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/dijkstra-algorithm/
public class DijkstraAlgorithmDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int vtces, int[][] edges, int src) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < vtces; i = i + 1) {
            adj.add(new ArrayList<>());
        }

        if (edges != null) {
            for (int i = 0; i < edges.length; i = i + 1) {
                int u = edges[i][0];
                int v = edges[i][1];
                int wt = edges[i][2];
                adj.get(u).add(new int[]{v, wt});
            }
        }

        int[] dist = new int[vtces];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.wsf, a.wsf));
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair rem = pq.poll();

            if (rem.wsf > dist[rem.v]) {
                continue;
            }

            for (int i = 0; i < adj.get(rem.v).size(); i = i + 1) {
                int[] edge = adj.get(rem.v).get(i);
                int nbr = edge[0];
                int wt = edge[1];

                if (rem.wsf + wt < dist[nbr]) {
                    dist[nbr] = rem.wsf + wt;
                    pq.add(new Pair(nbr, dist[nbr]));
                }
            }
        }

        return dist;
    }

    static class Pair {
        int v;
        int wsf;

        Pair(int v, int wsf) {
            this.v = v;
            this.wsf = wsf;
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Dijkstra Algorithm (DEBUG) ====");
        System.out.print("Enter number of vertices: ");
        int vtces = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int numEdges = sc.nextInt();
        int[][] edges = new int[numEdges][3];
        for (int i = 0; i < numEdges; i = i + 1) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();

        int[] result = solve(vtces, edges, src);

        System.out.println("------------------------");
        System.out.println("Shortest Distances: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
