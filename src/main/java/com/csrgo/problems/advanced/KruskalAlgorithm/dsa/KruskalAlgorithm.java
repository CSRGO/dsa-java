// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KruskalAlgorithm.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/kruskal-algorithm/
public class KruskalAlgorithm {

    public static int solve(int vtces, int[][] edges) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Kruskal's Algorithm ====");
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
