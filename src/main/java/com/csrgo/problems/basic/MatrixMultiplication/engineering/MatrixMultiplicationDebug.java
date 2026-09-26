// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MatrixMultiplication.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/matrix-multiplication/
public class MatrixMultiplicationDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] mat1, int[][] mat2) {
        if (mat1 == null || mat2 == null || mat1.length == 0 || mat2.length == 0) {
            return new int[0][0];
        }

        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int r2 = mat2.length;
        int c2 = mat2[0].length;

        // Bug 1: Checks outer dimensions (r1 != c2) instead of inner dimensions (c1 != r2)
        if (r1 != c2) {
            return new int[0][0];
        }

        // Bug 2: Allocates product matrix with dimensions r1 x r2 instead of r1 x c2
        int[][] result = new int[r1][r2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    // Bug 3: Transposed indexing in mat2 (mat2[j][k] instead of mat2[k][j])
                    result[i][j] += mat1[i][k] * mat2[j][k];
                }
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{1, 0}, {0, 1}};
        int[][] result = solve(mat1, mat2);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
