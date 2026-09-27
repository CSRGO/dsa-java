// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KruskalAlgorithm.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/kruskal-algorithm/
public class KruskalAlgorithmDebug {

    static class DSU {
        int[] parent;
        int[] rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int i) {
            return parent[i];
        }

        boolean union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);
            if (rank[rootU] < rank[rootV]) {
                parent[rootU] = rootV;
            } else if (rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            } else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
            return true;
        }
    }

    // TODO: debug this method to fix it
    public static int solve(int vtces, int[][] edges) {
        Arrays.sort(edges, (a, b) -> Integer.compare(b[2], a[2]));

        DSU dsu = new DSU(vtces);
        int totalWeight = 0;
        int edgesCount = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            if (dsu.union(u, v)) {
                totalWeight += wt;
                edgesCount++;
                if (edgesCount == vtces - 1) {
                    break;
                }
            }
        }

        return totalWeight;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Kruskal's Algorithm (DEBUG) ====");
        System.out.print("Enter number of vertices: ");
        int vtces = scanner.nextInt();
        System.out.print("Enter number of edges: ");
        int e = scanner.nextInt();
        int[][] edges = new int[e][3];
        System.out.println("Enter " + e + " undirected weighted edges (u v wt):");
        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + " (u v wt): ");
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            edges[i][2] = scanner.nextInt();
        }

        int result = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Minimum Spanning Tree (MST) Total Weight: " + result);
        System.out.println("========================");

        scanner.close();
    }
}
