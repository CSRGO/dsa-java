// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubsetsUsingBitmask.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subsets-using-bitmask/
public class SubsetsUsingBitmaskDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }

        int n = nums.length;
        if (n == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        int totalSubsets = 1 << (n - 1);

        for (int mask = 1; mask < totalSubsets; mask = mask + 1) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i = i + 1) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(i);
                }
            }
            result.add(subset);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = solve(nums);
        System.out.println("Subsets (Debug): " + result);
        sc.close();
    }
}
