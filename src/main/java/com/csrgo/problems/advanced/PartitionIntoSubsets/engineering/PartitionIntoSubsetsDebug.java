// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PartitionIntoSubsets.engineering;

// Problem Link: https://csrgo.com/problems/partition-into-subsets
public class PartitionIntoSubsetsDebug {
    public long solve(int n, int k) {
        if (n == 0 || k == 0) {
            return 0L;
        }
        if (k > n) {
            return 1L;
        }

        long[] dp = new long[k + 1];
        dp[1] = 1L;

        for (int i = 2; i <= n; i = i + 1) {
            for (int j = 1; j <= Math.min(i, k); j = j + 1) {
                dp[j] = (long) i * dp[j] + dp[j - 1];
            }
        }

        return dp[k];
    }

    // To run tests, execute the main method below:
    public static void main(String[] args) {
        PartitionIntoSubsetsDebugTest.main(args);
    }
}
