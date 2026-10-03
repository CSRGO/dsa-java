// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumHeightTrees.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-height-trees/
public class MinimumHeightTrees {

    public static int[] solve(int n, int[][] edges) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Height Trees ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[][] edges = new int[n - 1][2];

        for (int i = 0; i < n - 1; i = i + 1) {
            System.out.print("Enter edge " + (i + 1) + " (u v): ");
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        int[] result = solve(n, edges);

        System.out.println("------------------------");
        System.out.println("Nodes count : " + n);
        System.out.println("Edges       : " + Arrays.deepToString(edges));
        System.out.println("MHT Roots   : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
