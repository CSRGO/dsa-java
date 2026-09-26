// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MaxOfArray.engineering;

// Problem Link: https://dsa.csrgo.com/problems/max-of-array/
public class MaxOfArrayDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return maxOfArray(arr, 0);
    }

    private static int maxOfArray(int[] arr, int idx) {
        // Bug 1: Base condition 'idx == arr.length' triggers ArrayIndexOutOfBoundsException when indexing arr[idx]
        if (idx == arr.length) {
            // Bug 2: Returns 0 instead of element value, which fails for strictly negative arrays
            return 0;
        }

        int restMax = maxOfArray(arr, idx + 1);

        // Bug 3: Invokes Math.min instead of Math.max, computing minimum element
        return Math.min(arr[idx], restMax);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 40};
        int result = solve(arr);
        System.out.println("Result: " + result);
    }
}
