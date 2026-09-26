// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.LongestConsecutiveSequence.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequenceDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longestStreak = 1;

        for (int num : set) {
            if (set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum = currentNum + 2;
                    currentStreak = currentStreak + 1;
                }

                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            }
        }

        return longestStreak;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Consecutive Sequence [DEBUG] ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input : nums=" + Arrays.toString(nums));
        System.out.println("Streak: " + result);
        System.out.println("========================");
    }
}
