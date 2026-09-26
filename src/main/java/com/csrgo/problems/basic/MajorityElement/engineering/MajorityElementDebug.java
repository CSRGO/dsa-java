// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MajorityElement.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/majority-element/
public class MajorityElementDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
            }

            if (nums[i] == candidate) {
                count = count - 1;
            } else {
                count = count + 1;
            }
        }

        return candidate;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Majority Element [DEBUG] ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input   : nums=" + Arrays.toString(nums));
        System.out.println("Majority: " + result);
        System.out.println("========================");
    }
}
