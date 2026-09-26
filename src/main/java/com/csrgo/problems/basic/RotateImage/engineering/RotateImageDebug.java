// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RotateImage.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/rotate-image/
public class RotateImageDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] mat) {
        if (mat == null || mat.length <= 1) {
            return mat;
        }

        int n = mat.length;

        // Step 1: Transpose matrix
        for (int i = 0; i < n; i++) {
            // Bug 1: j begins from 0 instead of i + 1, swapping every pair twice
            for (int j = 0; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each column vertically
        for (int j = 0; j < n; j++) {
            int top = 0;
            int bottom = n - 1;
            while (top < bottom) {
                // Bug 2: Inverted row/col indices mat[j][top] instead of mat[top][j]
                int temp = mat[j][top];
                mat[j][top] = mat[j][bottom];
                mat[j][bottom] = temp;
                top++;
                // Bug 3: Increments bottom instead of decrementing
                bottom++;
            }
        }

        return mat;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = solve(mat);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
