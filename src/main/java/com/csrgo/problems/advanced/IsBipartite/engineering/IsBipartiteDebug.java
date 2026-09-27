// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IsBipartite.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/is-bipartite/
public class IsBipartiteDebug {

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
                adj.get(v).add(u);
            }
        }

        int[] color = new int[vtces];
        Arrays.fill(color, -1);

        for (int i = 0; i < vtces - 1; i = i + 1) {
            if (color[i] == -1) {
                boolean isBipartite = checkComponent(adj, i, color);
                if (!isBipartite) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean checkComponent(List<List<Integer>> adj, int src, int[] color) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(src);
        color[src] = 0;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int i = 0; i < adj.get(curr).size(); i = i + 1) {
                int nbr = adj.get(curr).get(i);
                if (color[nbr] == -1) {
                    color[nbr] = color[curr];
                    queue.add(nbr);
                } else if (color[nbr] == color[curr]) {
                    return false;
                }
            }
        }

        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Is Bipartite (DEBUG) ====");
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
        System.out.println("Is Bipartite: " + result);
        System.out.println("========================");

        sc.close();
    }
}
