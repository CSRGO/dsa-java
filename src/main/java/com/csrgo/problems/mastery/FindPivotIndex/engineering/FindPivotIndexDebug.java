// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FindPivotIndex.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/find-pivot-index/
public class FindPivotIndexDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int totalSum = 0;
        for (int i = 0; i < nums.length; i = i + 1) {
            totalSum = totalSum + nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i = i + 1) {
            leftSum = leftSum + nums[i];
            if (leftSum == totalSum - leftSum) {
                return i;
            }
        }

        return 0;
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
        System.out.println("Pivot Index: " + result);
        sc.close();
    }
}
