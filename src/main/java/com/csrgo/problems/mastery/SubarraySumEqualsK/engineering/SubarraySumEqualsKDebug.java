// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubarraySumEqualsK.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsKDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums, int k) {
        Map<Integer, Integer> prefixCounts = new HashMap<>();

        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i = i + 1) {
            currentSum = currentSum + nums[i];

            prefixCounts.put(currentSum, prefixCounts.getOrDefault(currentSum, 0) + 1);

            if (prefixCounts.containsKey(currentSum - k)) {
                count = count + 1;
            }
        }

        return count;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Subarray Sum Equals K (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        int result = solve(nums, k);

        System.out.println("------------------------");
        System.out.println("Input Array : " + Arrays.toString(nums));
        System.out.println("Target k    : " + k);
        System.out.println("Subarrays   : " + result);
        System.out.println("========================");

        sc.close();
    }
}
