// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FindPeakElement.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/find-peak-element/
public class FindPeakElementDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Find Peak Element (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input Array : " + Arrays.toString(nums));
        System.out.println("Peak Index  : " + result);
        if (result >= 0 && result < nums.length) {
            System.out.println("Peak Value  : " + nums[result]);
        }
        System.out.println("========================");

        sc.close();
    }
}
