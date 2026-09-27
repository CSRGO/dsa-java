// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ArticulationPoints.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/articulation-points/
public class ArticulationPointsDebug {

    private static int timer = 0;

    private static void dfs(int u, int parent, List<List<Integer>> graph, int[] disc, int[] low, boolean[] isAP) {
        disc[u] = low[u] = timer++;
        int children = 0;

        for (int v : graph.get(u)) {
            if (disc[v] != -1) {
                low[u] = Math.min(low[u], disc[v]);
            } else {
                children++;
                dfs(v, u, graph, disc, low, isAP);
                low[u] = Math.min(low[u], low[v]);
                if (parent != -1 && low[v] > disc[u]) {
                    isAP[u] = true;
                }
            }
        }
    }

    // TODO: debug this method to fix it
    public static List<Integer> solve(int vtces, int[][] edges) {
        timer = 0;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] disc = new int[vtces];
        int[] low = new int[vtces];
        boolean[] isAP = new boolean[vtces];
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        for (int i = 0; i < vtces; i++) {
            if (disc[i] == -1) {
                dfs(i, -1, graph, disc, low, isAP);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            if (isAP[i]) {
                result.add(i);
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Articulation Points (DEBUG) ====");
        System.out.print("Enter number of vertices: ");
        int vtces = scanner.nextInt();
        System.out.print("Enter number of edges: ");
        int e = scanner.nextInt();
        int[][] edges = new int[e][2];
        System.out.println("Enter " + e + " undirected edges (u v):");
        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + " (u v): ");
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        List<Integer> ap = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Vertices            : " + vtces);
        System.out.println("Articulation Points : " + ap);
        System.out.println("========================");

        scanner.close();
    }
}
