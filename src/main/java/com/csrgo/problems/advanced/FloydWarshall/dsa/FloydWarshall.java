// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FloydWarshall.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/floyd-warshall/
public class FloydWarshall {

    public static int[][] solve(int[][] matrix) {
        // TODO: write your logic here
        return new int[0][0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Floyd-Warshall Algorithm ====");
        System.out.print("Enter number of vertices n: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter adjacency matrix (" + n + " x " + n + ", use -1 for no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] result = solve(matrix);

        System.out.println("------------------------");
        System.out.println("All-Pairs Shortest Paths Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("========================");

        scanner.close();
    }
}
