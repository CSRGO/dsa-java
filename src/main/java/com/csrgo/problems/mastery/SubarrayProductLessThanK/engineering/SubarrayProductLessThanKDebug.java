// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubarrayProductLessThanK.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subarray-product-less-than-k/
public class SubarrayProductLessThanKDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int product = 1;
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right = right + 1) {
            product = product * nums[right];

            while (product > k && left <= right) {
                if (nums[left] != 0) {
                    product = product / nums[left];
                }
                left = left + 1;
            }

            if (product < k) {
                count = count + 1;
            }
        }

        return count;
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
        System.out.println("Count of Subarrays (Debug): " + result);
        sc.close();
    }
}
