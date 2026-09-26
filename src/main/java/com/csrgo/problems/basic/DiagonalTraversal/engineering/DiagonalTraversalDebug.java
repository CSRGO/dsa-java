// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.DiagonalTraversal.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/diagonal-traversal/
public class DiagonalTraversalDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        // Bug 1: Loop condition d <= m + n - 1 instead of < m + n - 1 tries an extra diagonal
        int totalDiagonals = m + n;

        for (int d = 0; d < totalDiagonals; d++) {
            // Bug 2: Inverted parity condition swaps upward and downward traversals
            if (d % 2 != 0) {
                int rStart = Math.min(d, m - 1);
                // Bug 3: Off-by-one d - n causes column index d - r to exceed column boundary n - 1
                int rEnd = Math.max(0, d - n);
                for (int r = rStart; r >= rEnd; r--) {
                    if (idx < result.length && d - r < n) {
                        result[idx++] = mat[r][d - r];
                    }
                }
            } else {
                int rStart = Math.max(0, d - n);
                int rEnd = Math.min(d, m - 1);
                for (int r = rStart; r <= rEnd; r++) {
                    if (idx < result.length && d - r < n) {
                        result[idx++] = mat[r][d - r];
                    }
                }
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
