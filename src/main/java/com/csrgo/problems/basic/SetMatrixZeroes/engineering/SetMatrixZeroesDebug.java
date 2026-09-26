// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SetMatrixZeroes.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/set-matrix-zeroes/
public class SetMatrixZeroesDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return mat;
        }

        int m = mat.length;
        int n = mat[0].length;

        // Bug 1: Missing checks for original first row/column zero status

        // Use first row and column as marker storage
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        // Bug 2: Starts from index 0, overwriting marker headers prematurely
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Bug 3: Uses AND (&&) instead of OR (||), missing single-axis zero propagation
                if (mat[i][0] == 0 && mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        return mat;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int[][] result = solve(mat);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
