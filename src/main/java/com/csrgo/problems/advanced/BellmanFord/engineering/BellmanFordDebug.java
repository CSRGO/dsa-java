// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BellmanFord.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/bellman-ford/
public class BellmanFordDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int vtces, int[][] edges, int src) {
        int[] dist = new int[vtces];
        int INF = 100000000;
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int i = 1; i < vtces - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            if (dist[u] != INF && dist[u] + wt < dist[v]) {
                dist[v] = -1;
            }
        }

        return dist;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Bellman-Ford Algorithm (DEBUG) ====");
        System.out.print("Enter number of vertices: ");
        int vtces = scanner.nextInt();
        System.out.print("Enter number of directed edges: ");
        int e = scanner.nextInt();
        int[][] edges = new int[e][3];
        System.out.println("Enter " + e + " directed edges (u v wt):");
        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + " (u v wt): ");
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            edges[i][2] = scanner.nextInt();
        }
        System.out.print("Enter source vertex: ");
        int src = scanner.nextInt();

        int[] result = solve(vtces, edges, src);

        System.out.println("------------------------");
        System.out.println("Source Vertex     : " + src);
        System.out.println("Shortest Distances: " + Arrays.toString(result));
        System.out.println("========================");

        scanner.close();
    }
}
