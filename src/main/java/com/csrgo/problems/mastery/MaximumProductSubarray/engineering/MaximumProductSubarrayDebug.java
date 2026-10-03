// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumProductSubarray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/maximum-product-subarray/
public class MaximumProductSubarrayDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int globalMax = 0;

        for (int i = 1; i < nums.length; i = i + 1) {
            maxProd = maxProd * nums[i];
            minProd = minProd * nums[i];

            if (maxProd > globalMax) {
                globalMax = maxProd;
            }
        }

        return globalMax;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Maximum Product Subarray (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input Array     : " + Arrays.toString(nums));
        System.out.println("Maximum Product : " + result);
        System.out.println("========================");

        sc.close();
    }
}
