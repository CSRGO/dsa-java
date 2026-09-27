// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrimsAlgorithm.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/prims-algorithm/
public class PrimsAlgorithm {

    public static int solve(int vtces, int[][] edges) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Prim's Algorithm ====");
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
