// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MatrixChainMultiplication.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/matrix-chain-multiplication/
public class MatrixChainMultiplicationDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length <= 2) {
            return -1;
        }

        int n = arr.length;
        int[][] dp = new int[n][n];

        for (int len = 2; len < n; len = len + 1) {
            for (int i = 1; i <= n - len; i = i + 1) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k = k + 1) {
                    int cost = dp[i][k] + dp[k + 1][j] + arr[i] * arr[k] * arr[j];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }

        return dp[1][n - 1];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Matrix Chain Multiplication (DEBUG) ====");
        System.out.print("Enter size of dimension array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
