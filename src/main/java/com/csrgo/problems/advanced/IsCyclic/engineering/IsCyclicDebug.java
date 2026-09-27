// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IsCyclic.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/is-cyclic/
public class IsCyclicDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int vtces, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < vtces; i = i + 1) {
            adj.add(new ArrayList<>());
        }

        if (edges != null) {
            for (int i = 0; i < edges.length; i = i + 1) {
                int u = edges[i][0];
                int v = edges[i][1];
                adj.get(u).add(v);
            }
        }

        boolean[] visited = new boolean[vtces];

        if (vtces > 0) {
            return isCyclicBFS(adj, 0, visited);
        }

        return false;
    }

    private static boolean isCyclicBFS(List<List<Integer>> adj, int src, boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(src);

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            if (visited[curr]) {
                return true;
            }

            for (int i = 0; i < adj.get(curr).size(); i = i + 1) {
                int nbr = adj.get(curr).get(i);
                if (!visited[nbr]) {
                    visited[nbr] = true;
                    queue.add(nbr);
                }
            }
        }

        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Is Cyclic (DEBUG) ====");
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
