// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinimumCostPath.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-cost-path/
public class MinimumCostPathDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        if (grid.length == 1 && grid[0].length == 1) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        for (int j = 1; j < n; j = j + 1) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < m; i = i + 1) {
            dp[i][0] = dp[0][0] + grid[i][0];
        }

        for (int i = 1; i < m; i = i + 1) {
            for (int j = 1; j < n; j = j + 1) {
                int smaller = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = grid[i][j] + smaller;
            }
        }

        return dp[m - 1][n - 1];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Cost Path (DEBUG) ====");
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter grid elements row by row:");
        for (int i = 0; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solve(grid);

        System.out.println("------------------------");
        System.out.println("Input  : " + m + "x" + n + " grid");
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
