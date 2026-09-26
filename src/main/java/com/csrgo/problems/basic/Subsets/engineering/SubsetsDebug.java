// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.Subsets.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/subsets/
public class SubsetsDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Bug 1: Appends raw reference of current rather than copy new ArrayList<>(current)
        result.add(current);

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            // Bug 2: Passes start + 1 instead of i + 1 into recursive call, producing duplicate elements
            backtrack(start + 1, nums, current, result);
            // Bug 3: Omits current.remove(current.size() - 1) backtracking step
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solve(nums);
        System.out.println("Result: " + result);
    }
}
