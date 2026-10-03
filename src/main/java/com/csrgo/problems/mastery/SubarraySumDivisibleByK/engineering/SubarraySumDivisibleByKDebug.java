// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubarraySumDivisibleByK.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subarray-sum-divisible-by-k/
public class SubarraySumDivisibleByKDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }

        int[] count = new int[k];
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i = i + 1) {
            sum = sum + nums[i];
            int rem = Math.abs(sum % k);
            count[rem] = count[rem] + 1;
            ans = ans + count[rem];
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = solve(nums, k);
        System.out.println("Subarrays Divisible by K: " + result);
        sc.close();
    }
}
