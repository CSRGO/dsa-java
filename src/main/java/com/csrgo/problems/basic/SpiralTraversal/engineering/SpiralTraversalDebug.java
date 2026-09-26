// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SpiralTraversal.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/spiral-traversal/
public class SpiralTraversalDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int c = left; c <= right; c++) {
                result[idx++] = mat[top][c];
            }
            top++;

            for (int r = top; r <= bottom; r++) {
                result[idx++] = mat[r][right];
            }
            right--;

            // Bug 1: Missing 'if (top <= bottom)' guard causes duplicate traversal on single remaining row
            for (int c = right; c >= left; c--) {
                result[idx++] = mat[bottom][c];
            }
            // Bug 2: Increments bottom boundary instead of decrementing
            bottom++;

            if (left <= right) {
                // Bug 3: Strict inequality r > top skips the corner cell at top
                for (int r = bottom; r > top; r--) {
                    result[idx++] = mat[r][left];
                }
                left++;
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] result = solve(mat);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
