// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SubsetsII.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/subsets-ii/
public class SubsetsIIDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }

        // Bug 1: Missing Arrays.sort(nums); duplicates are scattered non-consecutively, bypassing adjacency checks
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Bug 2: Adds raw reference of current instead of defensive copy new ArrayList<>(current)
        result.add(current);

        for (int i = start; i < nums.length; i++) {
            // Bug 3: Checks i > 0 instead of i > start, erroneously pruning valid multiple occurrences of duplicate values
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);
            backtrack(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = solve(nums);
        System.out.println("Result: " + result);
    }
}
