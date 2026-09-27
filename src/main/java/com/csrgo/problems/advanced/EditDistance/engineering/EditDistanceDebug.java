// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.EditDistance.engineering;

// Problem Link: https://csrgo.com/problems/edit-distance
public class EditDistanceDebug {
    public int solve(String word1, String word2) {
        if (word1 == null || word2 == null || word1.isEmpty() || word2.isEmpty()) {
            return 0;
        }

        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i = i + 1) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j = j + 1) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i = i + 1) {
            for (int j = 1; j <= n; j = j + 1) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int deleteCost = dp[i - 1][j];
                    int insertCost = dp[i][j - 1];
                    int replaceCost = dp[i - 1][j - 1];
                    dp[i][j] = 1 + Math.min(deleteCost, Math.max(insertCost, replaceCost));
                }
            }
        }

        return dp[m][n];
    }

    // To run tests, execute the main method below:
    public static void main(String[] args) {
        EditDistanceDebugTest.main(args);
    }
}
