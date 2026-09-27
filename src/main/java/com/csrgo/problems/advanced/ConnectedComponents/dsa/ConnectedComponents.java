// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ConnectedComponents.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/connected-components/
public class ConnectedComponents {

    public static List<List<Integer>> solve(int vtces, int[][] edges) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Connected Components ====");
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

        List<List<Integer>> result = solve(vtces, edges);

        System.out.println("------------------------");
        System.out.println("Total Components : " + result.size());
        for (List<Integer> comp : result) {
            System.out.println(comp);
        }
        System.out.println("========================");

        sc.close();
    }
}
