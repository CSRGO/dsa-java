// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RedundantConnection.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/redundant-connection/
public class RedundantConnection {

    public static int[] solve(int[][] edges) {
        // TODO: write your logic here
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
