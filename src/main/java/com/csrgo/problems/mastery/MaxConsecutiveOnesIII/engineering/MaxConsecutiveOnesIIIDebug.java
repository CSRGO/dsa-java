// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaxConsecutiveOnesIII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnesIIIDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount = zeroCount + 1;
            }

            while (zeroCount >= k && left <= right) {
                if (nums[left] == 0) {
                    zeroCount = zeroCount - 1;
                }
                left = left + 1;
            }

            int currentLen = right - left;
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        return maxLen;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter binary array elements (0 or 1):");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = solve(nums, k);
        System.out.println("Max Consecutive Ones: " + result);
        sc.close();
    }
}
