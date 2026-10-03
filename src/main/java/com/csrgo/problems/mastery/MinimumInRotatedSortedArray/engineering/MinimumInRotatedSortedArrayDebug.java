// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumInRotatedSortedArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-in-rotated-sorted-array/
public class MinimumInRotatedSortedArrayDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return nums[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum in Rotated Sorted Array (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input Array   : " + Arrays.toString(nums));
        System.out.println("Minimum Value : " + result);
        System.out.println("========================");

        sc.close();
    }
}
