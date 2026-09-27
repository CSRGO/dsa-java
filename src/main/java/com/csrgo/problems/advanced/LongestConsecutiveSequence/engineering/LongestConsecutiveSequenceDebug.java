// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LongestConsecutiveSequence.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequenceDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i = i + 1) {
            set.add(nums[i]);
        }

        int maxStreak = 0;
        for (int num : set) {
            if (set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 0;

                while (set.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    currentStreak = currentStreak + 1;
                }

                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }

        return maxStreak;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Consecutive Sequence (Debug) ====");
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
