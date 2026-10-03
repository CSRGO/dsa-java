// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UniquePaths.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/unique-paths/
public class UniquePathsDebug {

    // TODO: debug this method to fix it
    public static int solve(int m, int n) {
        if (m == 1 && n == 1) {
            return 0;
        }

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i = i + 1) {
            dp[0] = 0;
            for (int j = 1; j < n; j = j + 1) {
                dp[j] = dp[j] - dp[j - 1];
            }
        }

        return dp[n - 1];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Unique Paths Debug ====");
        System.out.print("Enter number of rows m: ");
        int m = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter number of columns n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int paths = solve(m, n);
        System.out.println("Total Unique Paths: " + paths);
    }
}
