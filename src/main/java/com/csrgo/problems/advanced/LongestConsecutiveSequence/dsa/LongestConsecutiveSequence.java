// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LongestConsecutiveSequence.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {

    public static int solve(int[] nums) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Consecutive Sequence ====");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Longest Streak Length: " + result);
        System.out.println("========================");

        sc.close();
    }
}
