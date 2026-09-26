// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RotateMatrix.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/rotate-matrix/
public class RotateMatrixDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] mat) {
        if (mat == null || mat.length <= 1) {
            return mat;
        }

        int n = mat.length;

        // Step 1: Transpose matrix
        for (int i = 0; i < n; i++) {
            // Bug 1: j starts from 0 instead of i + 1, swapping every pair twice and reverting transposition
            for (int j = 0; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            // Bug 2: Off-by-one bound right = n instead of n - 1
            int right = n;
            while (left < right) {
                // Bug 3: Swaps across columns mat[left][i] instead of across row elements mat[i][left]
                int temp = mat[left][i];
                mat[left][i] = mat[right][i];
                mat[right][i] = temp;
                left++;
                right--;
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
