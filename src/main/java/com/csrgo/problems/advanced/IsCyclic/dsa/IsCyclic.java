// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IsCyclic.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/is-cyclic/
public class IsCyclic {

    public static boolean solve(int vtces, int[][] edges) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Is Cyclic ====");
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

        boolean result = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Input vtces : " + vtces);
        System.out.println("Contains Cycle: " + result);
        System.out.println("========================");

        sc.close();
    }
}
