// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DijkstraAlgorithm.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/dijkstra-algorithm/
public class DijkstraAlgorithm {

    public static int[] solve(int vtces, int[][] edges, int src) {
        // TODO: write your logic here
        return new int[vtces];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Dijkstra Algorithm ====");
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
