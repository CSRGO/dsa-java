// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SpreadInfection.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/spread-infection/
public class SpreadInfectionDebug {

    // TODO: debug this method to fix it
    public static int solve(int vtces, int[][] edges, int src, int t) {
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

        int[] visited = new int[vtces];
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, 0));
        int count = 0;

        while (!queue.isEmpty()) {
            Pair rem = queue.poll();

            if (visited[rem.v] > 0) {
                continue;
            }

            visited[rem.v] = rem.time;
            count = count + 1;

            for (int i = 0; i < adj.get(rem.v).size(); i = i + 1) {
                int nbr = adj.get(rem.v).get(i);
                if (visited[nbr] == 0) {
                    queue.add(new Pair(nbr, rem.time + 1));
                }
            }
        }

        return count;
    }

    static class Pair {
        int v;
        int time;

        Pair(int v, int time) {
            this.v = v;
            this.time = time;
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Spread Infection (DEBUG) ====");
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
        System.out.print("Enter patient zero (src): ");
        int src = sc.nextInt();
        System.out.print("Enter time limit (t): ");
        int t = sc.nextInt();

        int result = solve(vtces, edges, src, t);

        System.out.println("------------------------");
        System.out.println("Infected Count: " + result);
        System.out.println("========================");

        sc.close();
    }
}
