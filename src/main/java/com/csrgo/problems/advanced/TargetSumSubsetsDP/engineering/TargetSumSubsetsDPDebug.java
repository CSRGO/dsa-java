// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TargetSumSubsetsDP.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/target-sum-subsets-dp/
public class TargetSumSubsetsDPDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int[] arr, int target) {
        if (arr == null || arr.length == 0 || target < 0) {
            return false;
        }

        if (arr.length == 1) {
            return false;
        }

        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i = i + 1) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i = i + 1) {
            int val = arr[i - 1];
            for (int j = 1; j < target; j = j + 1) {
                if (j >= val) {
                    dp[i][j] = dp[i - 1][j - val];
                }
            }
        }

        return dp[n][target];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Target Sum Subsets (DP) (DEBUG) ====");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean result = solve(arr, target);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", target=" + target);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
