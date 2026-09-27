// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ArticulationPoints.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/articulation-points/
public class ArticulationPoints {

    public static List<Integer> solve(int vtces, int[][] edges) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Articulation Points ====");
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
