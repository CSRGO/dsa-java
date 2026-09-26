// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SearchIn2DMatrix.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/search-in-2d-matrix/
public class SearchIn2DMatrixDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int[][] mat, int target) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return false;
        }

        int m = mat.length;
        int n = mat[0].length;

        int left = 0;
        // Bug 1: Off-by-one right boundary initialization (m * n instead of m * n - 1)
        int right = m * n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            // Bug 2: Coordinate projection maps using row count m instead of column count n
            int row = mid / m;
            int col = mid % m;

            if (row < m && col < n) {
                int midVal = mat[row][col];
                if (midVal == target) {
                    return true;
                } else if (midVal < target) {
                    // Bug 3: Sets left = mid instead of mid + 1, leading to potential stagnation
                    left = mid;
                } else {
                    right = mid - 1;
                }
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        boolean result = solve(mat, 3);
        System.out.println("Result: " + result);
    }
}
