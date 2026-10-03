// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumPathSum.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-path-sum/
public class MinimumPathSum {

    public static int solve(int[][] grid) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Path Sum ====");
        System.out.print("Enter number of rows m: ");
        int m = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter number of columns n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter space-separated values for row " + (i + 1) + ": ");
            String[] tokens = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        int minSum = solve(grid);
        System.out.println("Minimum Path Sum: " + minSum);
    }
}
