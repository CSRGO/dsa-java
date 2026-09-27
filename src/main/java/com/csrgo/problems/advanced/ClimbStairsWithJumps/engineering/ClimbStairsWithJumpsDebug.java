// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ClimbStairsWithJumps.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/climb-stairs-with-jumps/
public class ClimbStairsWithJumpsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int n = arr.length;
        int[] dp = new int[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i = i - 1) {
            for (int j = 1; j < arr[i] && i + j <= n; j = j + 1) {
                dp[i] = dp[i] + dp[j];
            }
        }

        return dp[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Climb Stairs with Jumps (DEBUG) ====");
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
