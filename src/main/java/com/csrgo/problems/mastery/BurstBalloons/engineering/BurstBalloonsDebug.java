// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.BurstBalloons.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/burst-balloons/
public class BurstBalloonsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] val = new int[n + 2];
        val[0] = 0;
        val[n + 1] = 0;
        for (int i = 0; i < n; i = i + 1) {
            val[i + 1] = nums[i];
        }

        int[][] dp = new int[n + 2][n + 2];

        for (int len = 1; len < n; len = len + 1) {
            for (int left = 1; left <= n - len + 1; left = left + 1) {
                int right = left + len - 1;
                for (int k = left; k <= right; k = k + 1) {
                    int coins = dp[left][k - 1] + val[left - 1] + val[k] + val[right + 1] + dp[k + 1][right];
                    dp[left][right] = Math.max(dp[left][right], coins);
                }
            }
        }

        return dp[1][n];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Burst Balloons Debug ====");
        System.out.print("Enter number of balloons n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter coin value for balloon " + (i + 1) + ": ");
            nums[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int maxCoins = solve(nums);
        System.out.println("Maximum Coins Collected: " + maxCoins);
    }
}
