// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.AllIndices.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/all-indices/
public class AllIndicesDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        return allIndices(arr, target, 0, 0);
    }

    private static int[] allIndices(int[] arr, int target, int idx, int count) {
        // Bug 1: Base case allocates new int[arr.length] instead of new int[count], padding trailing zeros
        if (idx == arr.length) {
            return new int[arr.length];
        }

        if (arr[idx] == target) {
            // Bug 2: Fails to increment count parameter on match
            int[] res = allIndices(arr, target, idx + 1, count);
            // Bug 3: Swaps index and value, writing count into slot idx instead of idx into slot count
            res[idx] = count;
            return res;
        } else {
            return allIndices(arr, target, idx + 1, count);
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50, 20};
        int target = 20;
        int[] result = solve(arr, target);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
