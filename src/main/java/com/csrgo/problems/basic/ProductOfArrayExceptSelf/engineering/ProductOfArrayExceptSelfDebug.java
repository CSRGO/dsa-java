// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ProductOfArrayExceptSelf.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelfDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i];
        }

        int right = 1;
        for (int i = n - 2; i > 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Product of Array Except Self [DEBUG] ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input : nums=" + Arrays.toString(nums));
        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("========================");
    }
}
