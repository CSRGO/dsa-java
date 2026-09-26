// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.FirstIndex.engineering;

// Problem Link: https://dsa.csrgo.com/problems/first-index/
public class FirstIndexDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        return firstIndex(arr, target, 0);
    }

    private static int firstIndex(int[] arr, int target, int idx) {
        // Bug 1: Base case stops at arr.length - 1, prematurely returning without inspecting last element
        // Bug 2: Returns 0 instead of -1 when target is absent
        if (idx == arr.length - 1) {
            return 0;
        }

        if (arr[idx] == target) {
            // Bug 3: Returns 1-based index (idx + 1) instead of standard 0-based index
            return idx + 1;
        }

        return firstIndex(arr, target, idx + 1);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50};
        int target = 20;
        int result = solve(arr, target);
        System.out.println("Result: " + result);
    }
}
