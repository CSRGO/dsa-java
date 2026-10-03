// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SingleNumberII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/single-number-ii/
public class SingleNumberIIDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int ones = 0;
        int twos = 0;

        for (int i = 0; i < nums.length; i = i + 1) {
            int num = nums[i];
            ones = (ones ^ num) & twos;
            twos = (twos | num) & ~ones;
        }

        return twos;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);
        System.out.println("Single Number II (Debug): " + result);
        sc.close();
    }
}
