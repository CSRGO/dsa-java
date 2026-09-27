// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrimsAlgorithm.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/prims-algorithm/
public class PrimsAlgorithmDebug {

    // TODO: debug this method to fix it
    public static int solve(int vtces, int[][] edges) {
        if (vtces <= 1) {
            return 0;
        }

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

        boolean[] visited = new boolean[vtces];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.wt, a.wt));
        pq.add(new Pair(0, 0));

        int totalWeight = 0;

        while (!pq.isEmpty()) {
            Pair rem = pq.poll();

            if (visited[rem.v]) {
                continue;
            }

            visited[rem.v] = true;
            totalWeight = totalWeight + rem.wt;

            for (int i = 0; i < adj.get(rem.v).size(); i = i + 1) {
                int[] edge = adj.get(rem.v).get(i);
                int nbr = edge[0];
                int wt = edge[1];

                if (!visited[nbr]) {
                    pq.add(new Pair(nbr, wt));
                }
            }
        }

        return totalWeight;
    }

    static class Pair {
        int v;
        int wt;

        Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Prim's Algorithm (DEBUG) ====");
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

        int result = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("MST Total Weight: " + result);
        System.out.println("========================");

        sc.close();
    }
}
