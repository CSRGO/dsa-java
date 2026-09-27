// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.EggDroppingProblem.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/egg-dropping-problem/
public class EggDroppingProblemDebug {

    // TODO: debug this method to fix it
    public static int solve(int k, int n) {
        if (k <= 0 || n <= 0) {
            return 1;
        }
        if (k == 1) {
            return n;
        }
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[k + 1];
        int moves = 0;

        while (dp[k] < n) {
            moves = moves + 1;
            for (int e = 1; e <= k; e = e + 1) {
                dp[e] = dp[e - 1] + dp[e];
            }
        }

        return moves;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Egg Dropping Problem (DEBUG) ====");
        System.out.print("Enter number of eggs (k): ");
        int k = sc.nextInt();
        System.out.print("Enter number of floors (n): ");
        int n = sc.nextInt();

        int result = solve(k, n);

        System.out.println("------------------------");
        System.out.println("Input  : k=" + k + ", n=" + n);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
