// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.EquilibriumIndex.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/equilibrium-index/
public class EquilibriumIndexDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int totalSum = 0;
        // Bug 1: Loop condition excludes the last element in array summation
        for (int i = 0; i < nums.length - 1; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Bug 2: Fails to subtract nums[i] from right sum calculation
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        // Bug 3: Returns 0 instead of -1 when no equilibrium index exists
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = solve(nums);
        System.out.println("Result: " + result);
    }
}
