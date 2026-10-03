// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RegularExpressionMatching.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/regular-expression-matching/
public class RegularExpressionMatchingDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= m; i = i + 1) {
            for (int j = 1; j <= n; j = j + 1) {
                char pc = p.charAt(j - 1);
                if (pc == '*') {
                    dp[i][j] = dp[i][j - 1];
                    char prevChar = p.charAt(j - 2);
                    if (prevChar == s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else if (pc == '.' || pc == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Regular Expression Matching (DEBUG) ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter regex pattern p: ");
        String p = sc.nextLine();

        boolean result = solve(s, p);

        System.out.println("------------------------");
        System.out.println("String s : \"" + s + "\"");
        System.out.println("Pattern p: \"" + p + "\"");
        System.out.println("Matches  : " + result);
        System.out.println("========================");

        sc.close();
    }
}
