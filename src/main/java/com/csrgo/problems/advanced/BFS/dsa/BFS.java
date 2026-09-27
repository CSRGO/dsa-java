// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BFS.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/bfs/
public class BFS {

    public static List<String> solve(int vtces, int[][] edges, int src) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== BFS ====");
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
