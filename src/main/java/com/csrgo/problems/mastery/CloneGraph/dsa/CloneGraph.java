// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CloneGraph.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/clone-graph/
public class CloneGraph {

    public static int[][] solve(int[][] adjList) {
        // TODO: write your logic here
        return new int[0][0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Clone Graph ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[][] adjList = new int[n][];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter number of neighbors for node " + (i + 1) + ": ");
            int degree = sc.nextInt();
            adjList[i] = new int[degree];
            for (int j = 0; j < degree; j = j + 1) {
                System.out.print("Enter neighbor " + (j + 1) + " of node " + (i + 1) + ": ");
                adjList[i][j] = sc.nextInt();
            }
        }

        int[][] result = solve(adjList);

        System.out.println("------------------------");
        System.out.println("Input Graph  : " + Arrays.deepToString(adjList));
        System.out.println("Cloned Graph : " + Arrays.deepToString(result));
        System.out.println("========================");

        sc.close();
    }
}
