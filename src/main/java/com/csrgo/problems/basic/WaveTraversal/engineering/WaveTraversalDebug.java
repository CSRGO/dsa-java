// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.WaveTraversal.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/wave-traversal/
public class WaveTraversalDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int r = mat.length;
        int c = mat[0].length;
        int[] result = new int[r * c];
        int idx = 0;

        for (int j = 0; j < c; j++) {
            // Bug 1: Inverted parity condition for wave direction
            if (j % 2 != 0) {
                for (int i = 0; i < r; i++) {
                    // Bug 2: Transposed indexing mat[j][i] instead of mat[i][j]
                    result[idx++] = mat[j][i];
                }
            } else {
                // Bug 3: Loop termination i > 0 instead of i >= 0 skips the top row
                for (int i = r - 1; i > 0; i--) {
                    result[idx++] = mat[i][j];
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
