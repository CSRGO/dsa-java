// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.LastIndex.engineering;

// Problem Link: https://dsa.csrgo.com/problems/last-index/
public class LastIndexDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        return lastIndex(arr, target, 0);
    }

    private static int lastIndex(int[] arr, int target, int idx) {
        // Bug 1: Base case returns 0 instead of -1 when index reaches array boundary
        if (idx == arr.length) {
            return 0;
        }

        // Bug 2: Checks arr[idx] == target in pre-order, incorrectly returning first occurrence instead of last
        if (arr[idx] == target) {
            return idx;
        }

        int lastInRest = lastIndex(arr, target, idx + 1);

        // Bug 3: Inverts condition, ignoring found match from remaining suffix
        if (lastInRest == -1) {
            return lastInRest;
        }

        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50};
        int target = 20;
        int result = solve(arr, target);
        System.out.println("Result: " + result);
    }
}
