// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SaddlePoint.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/saddle-point/
public class SaddlePointDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return -1;
        }

        int r = mat.length;
        int c = mat[0].length;

        for (int i = 0; i < r; i++) {
            int colMin = 0;
            for (int j = 1; j < c; j++) {
                // Bug 1: Compares with > instead of <, selecting row maximum instead of row minimum
                if (mat[i][j] > mat[i][colMin]) {
                    colMin = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < r; k++) {
                // Bug 2: Transposed indexing mat[colMin][k] instead of mat[k][colMin]
                if (colMin < mat.length && k < mat[colMin].length && mat[colMin][k] > mat[i][colMin]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                return mat[i][colMin];
            }
        }

        // Bug 3: Returns 0 instead of -1 when no saddle point exists
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };
        int result = solve(mat);
        System.out.println("Result: " + result);
    }
}
