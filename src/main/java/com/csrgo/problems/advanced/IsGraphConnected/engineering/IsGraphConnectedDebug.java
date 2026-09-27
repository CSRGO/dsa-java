// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IsGraphConnected.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/is-graph-connected/
public class IsGraphConnectedDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int vtces, int[][] edges) {
        if (vtces <= 1) {
            return false;
        }

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
        dfs(adj, 0, visited);

        for (int i = 0; i < vtces - 1; i = i + 1) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }

    private static void dfs(List<List<Integer>> adj, int curr, boolean[] visited) {
        visited[curr] = true;

        for (int i = 0; i < adj.get(curr).size(); i = i + 1) {
            int nbr = adj.get(curr).get(i);
            if (!visited[nbr]) {
                dfs(adj, nbr, visited);
            }
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Is Graph Connected (DEBUG) ====");
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
        System.out.println("Output      : " + result);
        System.out.println("========================");

        sc.close();
    }
}
