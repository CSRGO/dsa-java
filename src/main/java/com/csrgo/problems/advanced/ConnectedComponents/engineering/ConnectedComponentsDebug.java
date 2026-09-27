// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ConnectedComponents.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/connected-components/
public class ConnectedComponentsDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int vtces, int[][] edges) {
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

        List<List<Integer>> components = new ArrayList<>();
        boolean[] visited = new boolean[vtces];

        for (int i = 0; i < vtces - 1; i = i + 1) {
            if (!visited[i]) {
                List<Integer> comp = new ArrayList<>();
                dfs(adj, i, visited, comp);
                Collections.sort(comp);
                components.add(comp);
            }
        }

        return components;
    }

    private static void dfs(List<List<Integer>> adj, int curr, boolean[] visited, List<Integer> comp) {
        comp.add(curr);

        for (int i = 0; i < adj.get(curr).size(); i = i + 1) {
            int nbr = adj.get(curr).get(i);
            if (!visited[nbr]) {
                dfs(adj, nbr, visited, comp);
            }
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Connected Components (DEBUG) ====");
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

        List<List<Integer>> result = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Total Components : " + result.size());
        for (List<Integer> comp : result) {
            System.out.println(comp);
        }
        System.out.println("========================");

        sc.close();
    }
}
