// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumSumCircularSubarray.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/maximum-sum-circular-subarray/
public class MaximumSumCircularSubarray {

    public static int solve(int[] nums) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Maximum Sum Circular Subarray ====");
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
