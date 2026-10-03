// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PalindromePartitioningII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/palindrome-partitioning-ii/
public class PalindromePartitioningIIDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        if (s == null || s.length() <= 1) {
            return 1;
        }

        int n = s.length();
        int[] dp = new int[n];
        boolean[][] isPal = new boolean[n][n];

        for (int i = 0; i < n; i = i + 1) {
            int minCuts = i;
            for (int j = 0; j <= i; j = j + 1) {
                if (s.charAt(i) == s.charAt(j) && (i - j < 2 || isPal[j + 1][i - 1])) {
                    isPal[j][i] = true;
                    if (j == 0) {
                        minCuts = 1;
                    } else {
                        minCuts = Math.min(minCuts, dp[j - 1] + 1);
                    }
                }
            }
            dp[i] = minCuts;
        }

        return dp[n - 1];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Palindrome Partitioning II Debug ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine().trim();

        int cuts = solve(s);
        System.out.println("Minimum Cuts: " + cuts);
    }
}
