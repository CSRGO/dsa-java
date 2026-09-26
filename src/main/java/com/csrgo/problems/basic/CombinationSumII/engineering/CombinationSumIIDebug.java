// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.CombinationSumII.engineering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/combination-sum-ii/
public class CombinationSumIIDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        // Bug 1: Missing Arrays.sort(candidates); unsorted array prevents both duplicate clustering and early break
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int[] candidates, int remain, List<Integer> current, List<List<Integer>> result) {
        if (remain == 0) {
            // Bug 2: Appends raw reference of current instead of defensive copy new ArrayList<>(current)
            result.add(current);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) {
                break;
            }
            // Bug 3: Compares i > 0 instead of i > start, erroneously skipping duplicate numbers across call depths
            if (i > 0 && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);
            backtrack(i + 1, candidates, remain - candidates[i], current, result);
            current.remove(current.size() - 1);
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = solve(candidates, target);
        System.out.println("Result: " + result);
    }
}
