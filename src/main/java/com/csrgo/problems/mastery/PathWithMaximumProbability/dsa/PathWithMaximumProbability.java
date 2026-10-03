// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PathWithMaximumProbability.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/path-with-maximum-probability/
public class PathWithMaximumProbability {

    public static double solve(int n, int[][] edges, double[] succProb, int startNode, int endNode) {
        // TODO: write your logic here
        return 0.0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Path with Maximum Probability ====");
        System.out.print("Enter number of nodes n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter number of edges m: ");
        int m = Integer.parseInt(sc.nextLine().trim());

        int[][] edges = new int[m][2];
        double[] succProb = new double[m];

        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter source node for edge " + (i + 1) + ": ");
            edges[i][0] = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter destination node for edge " + (i + 1) + ": ");
            edges[i][1] = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter probability for edge " + (i + 1) + ": ");
            succProb[i] = Double.parseDouble(sc.nextLine().trim());
        }

        System.out.print("Enter start node: ");
        int startNode = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter end node: ");
        int endNode = Integer.parseInt(sc.nextLine().trim());

        double result = solve(n, edges, succProb, startNode, endNode);
        System.out.println("Maximum Probability: " + result);
    }
}
