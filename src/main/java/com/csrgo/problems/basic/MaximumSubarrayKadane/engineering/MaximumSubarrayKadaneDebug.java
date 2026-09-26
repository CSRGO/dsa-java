// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MaximumSubarrayKadane.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/maximum-subarray-kadane/
public class MaximumSubarrayKadaneDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i <= nums.length; i++) {
            currentSum = currentSum + nums[i];

            if (currentSum < 0) {
                currentSum = 0;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Maximum Subarray (Kadane) [DEBUG] ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input  : nums=" + Arrays.toString(nums));
        System.out.println("Max Sum: " + result);
        System.out.println("========================");
    }
}
