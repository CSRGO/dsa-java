// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ShortestPathInBinaryMatrix.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/shortest-path-in-binary-matrix/
public class ShortestPathInBinaryMatrix {

    public static int solve(int[][] grid) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grid size n: ");
        int n = sc.nextInt();

        int[][] grid = new int[n][n];
        System.out.println("Enter binary matrix row by row (0 or 1):");
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);
        System.out.println("Shortest Clear Path Length: " + result);
        sc.close();
    }
}
