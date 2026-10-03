// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SearchInRotatedSortedArray.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public static int solve(int[] nums, int target) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Search in Rotated Sorted Array ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        int result = solve(nums, target);

        System.out.println("------------------------");
        System.out.println("Input Array  : " + Arrays.toString(nums));
        System.out.println("Target       : " + target);
        System.out.println("Result Index : " + result);
        System.out.println("========================");

        sc.close();
    }
}
