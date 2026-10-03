// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DpOnTreesMaxIndependentSet.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/dp-on-trees-max-independent-set/
public class DpOnTreesMaxIndependentSet {

    public static int solve(int n, int[][] edges, int[] weights) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== DP on Trees (Max Independent Set) ====");
        System.out.print("Enter number of nodes n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[][] edges = new int[n - 1][2];
        for (int i = 0; i < n - 1; i = i + 1) {
            System.out.print("Enter node 1 for edge " + (i + 1) + ": ");
            edges[i][0] = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter node 2 for edge " + (i + 1) + ": ");
            edges[i][1] = Integer.parseInt(sc.nextLine().trim());
        }

        int[] weights = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter weight for node " + i + ": ");
            weights[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int result = solve(n, edges, weights);
        System.out.println("Maximum Independent Set Weight: " + result);
    }
}
