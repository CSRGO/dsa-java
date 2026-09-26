// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SearchInSorted2DMatrix.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/search-in-sorted-2d-matrix/
public class SearchInSorted2DMatrixDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int[][] mat, int target) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return false;
        }

        int m = mat.length;
        int n = mat[0].length;

        int i = 0;
        // Bug 1: Off-by-one initialization j = n instead of n - 1
        int j = n;

        // Bug 2: Strict inequality j > 0 skips checking column 0 entirely
        while (i < m && j > 0) {
            if (mat[i][j - 1] == target) {
                return true;
            } else if (mat[i][j - 1] > target) {
                // Bug 3: Inverted navigation logic increments row instead of decrementing column
                i = i + 1;
            } else {
                j = j - 1;
            }
        }

        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        boolean result = solve(mat, 5);
        System.out.println("Result: " + result);
    }
}
