// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumPathSum.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-path-sum/
public class MinimumPathSumDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int[] dp = new int[n];
        dp[0] = grid[0][0];

        for (int j = 1; j < n; j = j + 1) {
            dp[j] = grid[0][j];
        }

        for (int i = 1; i < m; i = i + 1) {
            dp[0] = grid[i][0];
            for (int j = 1; j < n; j = j + 1) {
                dp[j] = grid[i][j] + Math.max(dp[j], dp[j - 1]);
            }
        }

        return dp[n - 1];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Path Sum Debug ====");
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
