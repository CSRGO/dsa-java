// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HasPath.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/has-path/
public class HasPath {

    public static boolean solve(int vtces, int[][] edges, int src, int dest) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Has Path (DFS) ====");
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
        System.out.print("Enter destination vertex: ");
        int dest = sc.nextInt();

        boolean result = solve(vtces, edges, src, dest);

        System.out.println("------------------------");
        System.out.println("Input  : src=" + src + ", dest=" + dest);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
