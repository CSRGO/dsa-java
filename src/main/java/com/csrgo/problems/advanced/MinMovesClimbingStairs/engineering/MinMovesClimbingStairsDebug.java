// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinMovesClimbingStairs.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/min-moves-climbing-stairs/
public class MinMovesClimbingStairsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i = i + 1) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i = i - 1) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j < arr[i] && i + j <= n; j = j + 1) {
                    if (dp[i + j] < min) {
                        min = dp[i + j];
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min;
                }
            }
        }

        if (dp[0] == Integer.MAX_VALUE) {
            return 0;
        }
        return dp[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Min Moves Climbing Stairs (DEBUG) ====");
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter max jump for each stair: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
