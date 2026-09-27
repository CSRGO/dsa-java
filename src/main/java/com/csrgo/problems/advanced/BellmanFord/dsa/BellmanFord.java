// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BellmanFord.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/bellman-ford/
public class BellmanFord {

    public static int[] solve(int vtces, int[][] edges, int src) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Bellman-Ford Algorithm ====");
        System.out.print("Enter number of vertices: ");
        int vtces = scanner.nextInt();
        System.out.print("Enter number of directed edges: ");
        int e = scanner.nextInt();
        int[][] edges = new int[e][3];
        System.out.println("Enter " + e + " directed edges (u v wt):");
        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + " (u v wt): ");
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            edges[i][2] = scanner.nextInt();
        }
        System.out.print("Enter source vertex: ");
        int src = scanner.nextInt();

        int[] result = solve(vtces, edges, src);

        System.out.println("------------------------");
        System.out.println("Source Vertex     : " + src);
        System.out.println("Shortest Distances: " + Arrays.toString(result));
        System.out.println("========================");

        scanner.close();
    }
}
