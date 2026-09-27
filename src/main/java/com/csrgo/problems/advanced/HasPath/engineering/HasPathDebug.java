// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HasPath.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/has-path/
public class HasPathDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int vtces, int[][] edges, int src, int dest) {
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
        return dfs(adj, src, dest, visited);
    }

    private static boolean dfs(List<List<Integer>> adj, int curr, int dest, boolean[] visited) {
        if (curr == dest) {
            return true;
        }

        visited[curr] = true;

        for (int i = 0; i < adj.get(curr).size() - 1; i = i + 1) {
            int nbr = adj.get(curr).get(i);
            if (!visited[nbr]) {
                boolean hasPath = dfs(adj, nbr, dest, visited);
                if (hasPath) {
                    return true;
                }
            }
        }

        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Has Path (DFS) (DEBUG) ====");
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
