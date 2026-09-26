// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MissingNumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/missing-number/
public class MissingNumberDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int n = nums.length - 1;
        int xor = n;

        for (int i = 0; i <= nums.length; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Missing Number [DEBUG] ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input  : nums=" + Arrays.toString(nums));
        System.out.println("Missing: " + result);
        System.out.println("========================");
    }
}
