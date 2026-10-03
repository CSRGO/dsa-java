// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TopologicalSort.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/topological-sort/
public class TopologicalSort {

    public static int[] solve(int vtces, int[][] edges) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Topological Sort ====");
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
