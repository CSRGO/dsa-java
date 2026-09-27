// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.LISBinarySearch.engineering;

// Problem Link: https://csrgo.com/problems/lis-binary-search
public class LISBinarySearchDebug {
    public int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        int[] tails = new int[nums.length];
        int len = 0;

        for (int i = 0; i < nums.length; i = i + 1) {
            int x = nums[i];
            int left = 0;
            int right = len;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] <= x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            tails[left] = x;
            len = len + 1;
        }

        return len;
    }

    // To run tests, execute the main method below:
    public static void main(String[] args) {
        LISBinarySearchDebugTest.main(args);
    }
}
