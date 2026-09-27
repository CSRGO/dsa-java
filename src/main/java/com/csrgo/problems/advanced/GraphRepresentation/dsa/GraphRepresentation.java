// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GraphRepresentation.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/graph-representation/
public class GraphRepresentation {

    public static List<List<int[]>> solve(int vtces, int[][] edges) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Graph Representation ====");
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

        List<List<int[]>> result = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Adjacency List Size : " + result.size());
        for (int i = 0; i < result.size(); i = i + 1) {
            System.out.print("Vertex " + i + ": ");
            for (int[] edge : result.get(i)) {
                System.out.print("[" + edge[0] + ", wt=" + edge[1] + "] ");
            }
            System.out.println();
        }
        System.out.println("========================");

        sc.close();
    }
}
