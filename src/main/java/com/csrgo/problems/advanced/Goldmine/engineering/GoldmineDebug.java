// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Goldmine.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/goldmine/
public class GoldmineDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        if (grid[0].length <= 1) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i = i + 1) {
            dp[i][n - 1] = grid[i][n - 1];
        }

        for (int j = n - 2; j > 0; j = j - 1) {
            for (int i = 0; i < m; i = i + 1) {
                int maxNext = dp[i][j + 1];
                if (i > 0) {
                    maxNext = Math.min(maxNext, dp[i - 1][j + 1]);
                }
                if (i < m - 1) {
                    maxNext = Math.min(maxNext, dp[i + 1][j + 1]);
                }
                dp[i][j] = grid[i][j] + maxNext;
            }
        }

        int maxGold = dp[0][0];
        for (int i = 1; i < m; i = i + 1) {
            maxGold = Math.max(maxGold, dp[i][0]);
        }

        return maxGold;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Goldmine (DEBUG) ====");
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter gold amounts row by row:");
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
