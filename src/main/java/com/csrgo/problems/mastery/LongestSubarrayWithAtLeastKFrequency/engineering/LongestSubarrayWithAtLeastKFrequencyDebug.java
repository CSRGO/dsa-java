// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestSubarrayWithAtLeastKFrequency.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-subarray-with-at-least-k-frequency/
public class LongestSubarrayWithAtLeastKFrequencyDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums, int k) {
        if (nums == null || nums.length < k || k <= 0) {
            return 0;
        }

        return helper(nums, 0, nums.length, k);
    }

    private static int helper(int[] nums, int start, int end, int k) {
        if (end - start <= k) {
            return 0;
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = start; i < end; i = i + 1) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        for (int mid = start; mid < end; mid = mid + 1) {
            if (counts.get(nums[mid]) < k) {
                int midNext = Math.min(end, mid + 2);
                while (midNext < end && counts.get(nums[midNext]) < k) {
                    midNext = midNext + 1;
                }

                int leftMax = helper(nums, start, mid, k);
                int rightMax = helper(nums, midNext, end, k);

                return leftMax + rightMax;
            }
        }

        return end - start;
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

        System.out.print("Enter minimum frequency (k): ");
        int k = sc.nextInt();

        int result = solve(nums, k);
        System.out.println("Longest Subarray Length (Debug): " + result);
        sc.close();
    }
}
