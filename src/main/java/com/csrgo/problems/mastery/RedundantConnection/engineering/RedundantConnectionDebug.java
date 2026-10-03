// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RedundantConnection.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/redundant-connection/
public class RedundantConnectionDebug {

    private static int find(int[] parent, int i) {
        int root = i;
        while (root != parent[root]) {
            root = parent[root];
        }
        return root;
    }

    // TODO: debug this method to fix it
    public static int[] solve(int[][] edges) {
        if (edges == null || edges.length == 0) {
            return new int[0];
        }

        int n = edges.length;
        int maxNode = 0;
        for (int i = 0; i < n; i = i + 1) {
            if (edges[i][0] > maxNode) maxNode = edges[i][0];
            if (edges[i][1] > maxNode) maxNode = edges[i][1];
        }

        int[] parent = new int[maxNode + 1];
        for (int i = 1; i <= maxNode; i = i + 1) {
            parent[i] = i;
        }

        for (int i = 0; i < edges.length; i = i + 1) {
            int u = edges[i][0];
            int v = edges[i][1];

            if (parent[u] == parent[v]) {
                return edges[0];
            }

            parent[u] = v;
        }

        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();
        int[][] edges = new int[m][2];
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < m; i = i + 1) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        int[] result = solve(edges);
        System.out.println("Redundant Edge: " + Arrays.toString(result));
        sc.close();
    }
}
