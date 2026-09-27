// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.LongestIncreasingSubsequence.engineering;

// Problem Link: https://csrgo.com/problems/longest-increasing-subsequence
public class LongestIncreasingSubsequenceDebug {
    public int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        int n = nums.length;
        int[] dp = new int[n];
        int overallMax = 1;

        for (int i = 0; i < n; i = i + 1) {
            dp[i] = 1;
            for (int j = 0; j < i; j = j + 1) {
                if (nums[j] <= nums[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            if (dp[i] > overallMax) {
                overallMax = dp[i];
            }
        }

        return dp[n - 1];
    }

    // To run tests, execute the main method below:
    public static void main(String[] args) {
        LongestIncreasingSubsequenceDebugTest.main(args);
    }
}
