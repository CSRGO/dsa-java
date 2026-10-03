// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumHeightTrees.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-height-trees/
public class MinimumHeightTreesDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int n, int[][] edges) {
        if (n <= 0) {
            return new int[0];
        }
        if (n <= 2) {
            return new int[]{0};
        }

        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i = i + 1) {
            adj.add(new HashSet<>());
        }

        int[] degrees = new int[n];
        for (int i = 0; i < edges.length; i = i + 1) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            degrees[u] = degrees[u] + 1;
            degrees[v] = degrees[v] + 1;
        }

        Queue<Integer> leaves = new ArrayDeque<>();
        for (int i = 0; i < n; i = i + 1) {
            if (degrees[i] == 1) {
                leaves.offer(i);
            }
        }

        int remaining = n;
        while (remaining > 2 && !leaves.isEmpty()) {
            int size = leaves.size();
            remaining = remaining - size;
            for (int s = 0; s < size; s = s + 1) {
                int leaf = leaves.poll();
                for (int nbr : adj.get(leaf)) {
                    adj.get(nbr).remove(leaf);
                    degrees[nbr] = degrees[nbr] - 1;
                    if (degrees[nbr] == 1) {
                        leaves.offer(nbr);
                    }
                }
            }
        }

        int[] result = new int[leaves.size()];
        int idx = 0;
        while (!leaves.isEmpty()) {
            result[idx] = leaves.poll();
            idx = idx + 1;
        }
        Arrays.sort(result);
        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Height Trees (Debug) ====");
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
