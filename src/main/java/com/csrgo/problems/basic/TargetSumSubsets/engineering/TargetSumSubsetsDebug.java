// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.TargetSumSubsets.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/target-sum-subsets/
public class TargetSumSubsetsDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }
        findSubsets(arr, 0, 0, target, new ArrayList<>(), result);
        return result;
    }

    private static void findSubsets(int[] arr, int idx, int sum, int target, List<Integer> current, List<List<Integer>> result) {
        if (sum > target) {
            return;
        }

        if (idx == arr.length) {
            if (sum == target) {
                // Bug 1: Appends raw reference of mutable 'current' instead of defensive copy new ArrayList<>(current)
                result.add(current);
            }
            return;
        }

        // Include choice
        current.add(arr[idx]);
        // Bug 2: Fails to add arr[idx] to running sum argument in recursive call
        findSubsets(arr, idx + 1, sum, target, current, result);
        // Bug 3: Omits current.remove(current.size() - 1) backtracking step, polluting subsequent recursive branches

        // Exclude choice
        findSubsets(arr, idx + 1, sum, target, current, result);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;
        List<List<Integer>> result = solve(arr, target);
        System.out.println("Result: " + result);
    }
}
