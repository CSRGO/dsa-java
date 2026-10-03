// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumSumCircularSubarray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/maximum-sum-circular-subarray/
public class MaximumSumCircularSubarrayDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int totalSum = 0;
        int currMax = 0;
        int maxKadane = nums[0];
        int currMin = 0;
        int minKadane = nums[0];

        for (int i = 0; i < nums.length; i = i + 1) {
            int x = nums[i];
            totalSum = totalSum + x;

            currMax = Math.max(x, currMax + x);
            maxKadane = Math.max(maxKadane, currMax);

            currMin = Math.min(x, currMin + x);
            minKadane = Math.min(minKadane, currMin);
        }

        return Math.max(maxKadane, totalSum - minKadane);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Maximum Sum Circular Subarray (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input Array : " + Arrays.toString(nums));
        System.out.println("Maximum Sum : " + result);
        System.out.println("========================");

        sc.close();
    }
}
