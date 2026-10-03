// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumSizeSubarraySum.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubarraySum {

    public static int solve(int target, int[] nums) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        int result = solve(target, nums);
        System.out.println("Minimum Subarray Length: " + result);
        sc.close();
    }
}
