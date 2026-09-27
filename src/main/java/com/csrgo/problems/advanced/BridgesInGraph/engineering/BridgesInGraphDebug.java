// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BridgesInGraph.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/bridges-in-graph/
public class BridgesInGraphDebug {

    private static int timer = 0;

    private static void dfs(int u, int parent, List<List<Integer>> graph, int[] disc, int[] low, List<List<Integer>> bridges) {
        disc[u] = low[u] = timer++;

        for (int v : graph.get(u)) {
            if (disc[v] != -1) {
                low[u] = Math.min(low[u], low[v]);
            } else {
                dfs(v, u, graph, disc, low, bridges);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] >= disc[u]) {
                    List<Integer> bridge = new ArrayList<>();
                    bridge.add(Math.min(u, v));
                    bridge.add(Math.max(u, v));
                    bridges.add(bridge);
                }
            }
        }
    }

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int vtces, int[][] edges) {
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
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        List<List<Integer>> bridges = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            if (disc[i] == -1) {
                dfs(i, -1, graph, disc, low, bridges);
            }
        }

        bridges.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return Integer.compare(a.get(0), b.get(0));
            }
            return Integer.compare(a.get(1), b.get(1));
        });

        return bridges;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Bridges In Graph (DEBUG) ====");
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

        List<List<Integer>> bridges = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Vertices       : " + vtces);
        System.out.println("Bridges (Cut)  : " + bridges);
        System.out.println("========================");

        scanner.close();
    }
}
