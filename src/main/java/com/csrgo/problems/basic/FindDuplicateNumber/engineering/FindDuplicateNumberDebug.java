// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FindDuplicateNumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/find-duplicate-number/
public class FindDuplicateNumberDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        return slow;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Find Duplicate Number [DEBUG] ====");
        System.out.print("Enter size of array n+1: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (range 1 to " + (n - 1) + "):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input    : nums=" + Arrays.toString(nums));
        System.out.println("Duplicate: " + result);
        System.out.println("========================");
    }
}
