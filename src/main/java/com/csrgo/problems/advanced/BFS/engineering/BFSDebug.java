// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BFS.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/bfs/
public class BFSDebug {

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
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, "" + src));

        while (!queue.isEmpty()) {
            Pair rem = queue.poll();

            visited[rem.v] = true;
            result.add(rem.v + "@" + rem.v);

            for (int i = 0; i < adj.get(rem.v).size(); i = i + 1) {
                int nbr = adj.get(rem.v).get(i);
                if (!visited[nbr]) {
                    queue.add(new Pair(nbr, rem.psf + nbr));
                }
            }
        }

        return result;
    }

    static class Pair {
        int v;
        String psf;

        Pair(int v, String psf) {
            this.v = v;
            this.psf = psf;
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== BFS (DEBUG) ====");
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
        System.out.println("BFS Traversal Order:");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("========================");

        sc.close();
    }
}
