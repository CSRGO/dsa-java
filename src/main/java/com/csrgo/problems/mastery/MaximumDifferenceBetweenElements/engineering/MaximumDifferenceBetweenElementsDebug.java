// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumDifferenceBetweenElements.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/maximum-difference-between-elements/
public class MaximumDifferenceBetweenElementsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int minVal = nums[0];
        int maxDiff = 0;

        for (int j = 1; j < nums.length; j = j + 1) {
            if (nums[j] < minVal) {
                minVal = nums[j];
            }

            if (nums[j] >= minVal) {
                maxDiff = Math.max(maxDiff, nums[j] - minVal);
            }
        }

        return maxDiff;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Maximum Difference Between Elements (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input Array        : " + Arrays.toString(nums));
        System.out.println("Maximum Difference : " + result);
        System.out.println("========================");

        sc.close();
    }
}
