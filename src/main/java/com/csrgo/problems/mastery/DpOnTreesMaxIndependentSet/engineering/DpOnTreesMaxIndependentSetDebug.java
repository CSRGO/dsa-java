// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DpOnTreesMaxIndependentSet.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/dp-on-trees-max-independent-set/
public class DpOnTreesMaxIndependentSetDebug {

    // TODO: debug this method to fix it
    public static int solve(int n, int[][] edges, int[] weights) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }

        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i = i + 1) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i = i + 1) {
            int u = edges[i][0];
            int v = edges[i][1];
            tree.get(u).add(v);
        }

        int[] result = dfs(0, -1, tree, weights);
        return Math.max(result[0], result[1]);
    }

    private static int[] dfs(int u, int parent, List<List<Integer>> tree, int[] weights) {
        int notIncluded = 0;
        int included = weights[u];

        List<Integer> neighbors = tree.get(u);
        for (int i = 0; i < neighbors.size(); i = i + 1) {
            int v = neighbors.get(i);
            if (v != parent) {
                int[] child = dfs(v, u, tree, weights);
                notIncluded = notIncluded + Math.max(child[0], child[1]);
                included = included + child[1];
            }
        }

        return new int[]{notIncluded, included};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== DP on Trees (Max Independent Set) Debug ====");
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
