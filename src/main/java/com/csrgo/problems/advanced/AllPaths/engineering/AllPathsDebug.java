// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AllPaths.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/all-paths/
public class AllPathsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(int vtces, int[][] edges, int src, int dest) {
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

        List<String> result = new ArrayList<>();
        boolean[] visited = new boolean[vtces];
        findPaths(adj, src, dest, visited, "" + src, result);
        Collections.sort(result);
        return result;
    }

    private static void findPaths(List<List<Integer>> adj, int curr, int dest, boolean[] visited, String path, List<String> result) {
        if (curr == dest) {
            result.add(path);
        }

        visited[curr] = true;

        for (int i = 0; i < adj.get(curr).size(); i = i + 1) {
            int nbr = adj.get(curr).get(i);
            if (!visited[nbr]) {
                findPaths(adj, nbr, dest, visited, path + "-" + nbr, result);
            }
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== All Paths (DEBUG) ====");
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

        List<String> result = solve(vtces, edges, src, dest);

        System.out.println("------------------------");
        System.out.println("Total Paths : " + result.size());
        for (String p : result) {
            System.out.println(p);
        }
        System.out.println("========================");

        sc.close();
    }
}
