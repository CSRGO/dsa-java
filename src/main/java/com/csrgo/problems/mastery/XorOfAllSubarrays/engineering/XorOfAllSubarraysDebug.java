// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.XorOfAllSubarrays.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/xor-of-all-subarrays/
public class XorOfAllSubarraysDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        if (n % 2 != 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < n; i = i + 1) {
            result = result | nums[i];
        }

        return result;
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

        int result = solve(nums);
        System.out.println("XOR of All Subarrays (Debug): " + result);
        sc.close();
    }
}
