// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LongestCommonSubsequence.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-common-subsequence/
public class LongestCommonSubsequenceDebug {

    // TODO: debug this method to fix it
    public static int solve(String text1, String text2) {
        if (text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty()) {
            return 1;
        }

        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i = i + 1) {
            for (int j = 1; j < n; j = j + 1) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Common Subsequence (DEBUG) ====");
        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();

        int result = solve(text1, text2);

        System.out.println("------------------------");
        System.out.println("Input  : text1=" + text1 + ", text2=" + text2);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
