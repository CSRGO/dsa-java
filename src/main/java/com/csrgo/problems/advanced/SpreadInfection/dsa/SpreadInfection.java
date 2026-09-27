// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SpreadInfection.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/spread-infection/
public class SpreadInfection {

    public static int solve(int vtces, int[][] edges, int src, int t) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Spread Infection ====");
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
        System.out.print("Enter patient zero (src): ");
        int src = sc.nextInt();
        System.out.print("Enter time limit (t): ");
        int t = sc.nextInt();

        int result = solve(vtces, edges, src, t);

        System.out.println("------------------------");
        System.out.println("Infected Count: " + result);
        System.out.println("========================");

        sc.close();
    }
}
