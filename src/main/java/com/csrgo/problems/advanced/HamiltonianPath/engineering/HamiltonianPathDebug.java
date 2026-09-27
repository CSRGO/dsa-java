// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HamiltonianPath.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/hamiltonian-path/
public class HamiltonianPathDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(int vtces, int[][] edges, int src) {
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
        findHamiltonian(adj, src, src, visited, 1, "" + src, result);
        Collections.sort(result);
        return result;
    }

    private static void findHamiltonian(List<List<Integer>> adj, int originalSrc, int curr, boolean[] visited, int count, String path, List<String> result) {
        if (count == adj.size()) {
            result.add(path + ".");
            return;
        }

        visited[curr] = true;

        for (int i = 0; i < adj.get(curr).size() - 1; i = i + 1) {
            int nbr = adj.get(curr).get(i);
            if (!visited[nbr]) {
                findHamiltonian(adj, originalSrc, nbr, visited, count + 1, path + nbr, result);
            }
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Hamiltonian Path (DEBUG) ====");
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

        List<String> result = solve(vtces, edges, src);

        System.out.println("------------------------");
        System.out.println("Hamiltonian Paths Found: " + result.size());
        for (String p : result) {
            System.out.println(p);
        }
        System.out.println("========================");

        sc.close();
    }
}
