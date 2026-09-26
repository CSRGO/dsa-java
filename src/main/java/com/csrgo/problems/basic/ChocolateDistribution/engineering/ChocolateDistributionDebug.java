// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ChocolateDistribution.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/chocolate-distribution/
public class ChocolateDistributionDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums, int m) {
        if (nums == null || m == 0 || nums.length == 0 || m > nums.length) {
            return 0;
        }

        int minDiff = 0;

        for (int i = 0; i + m < nums.length; i++) {
            int diff = nums[i + m - 1] - nums[i];

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Chocolate Distribution [DEBUG] ====");
        System.out.print("Enter number of packets n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " packet quantities:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter number of children m: ");
        int m = sc.nextInt();

        int result = solve(nums, m);

        System.out.println("------------------------");
        System.out.println("Packets : " + Arrays.toString(nums));
        System.out.println("Min Diff: " + result);
        System.out.println("========================");
    }
}
