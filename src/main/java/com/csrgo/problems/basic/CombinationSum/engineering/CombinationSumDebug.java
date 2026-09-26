// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.CombinationSum.engineering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/combination-sum/
public class CombinationSumDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int[] candidates, int remain, List<Integer> current, List<List<Integer>> result) {
        if (remain == 0) {
            // Bug 1: Appends raw reference of current instead of defensive copy new ArrayList<>(current)
            result.add(current);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) {
                break;
            }

            current.add(candidates[i]);
            // Bug 2: Advances start index to i + 1 instead of i, improperly disallowing element reuse
            // Bug 3: Fails to subtract candidate value from remain, keeping remain unchanged
            backtrack(i + 1, candidates, remain, current, result);
            current.remove(current.size() - 1);
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = solve(candidates, target);
        System.out.println("Result: " + result);
    }
}
