// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.CountNegativeNumbersInSortedMatrix.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/count-negative-numbers-in-sorted-matrix/
public class CountNegativeNumbersInSortedMatrixDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int r = m - 1;
        int c = 0;
        int count = 0;

        while (r >= 0 && c < n) {
            // Bug 1: Treats zero as negative (grid[r][c] <= 0 instead of < 0)
            if (grid[r][c] <= 0) {
                // Bug 2: Adds 1 instead of (n - c), failing to count all subsequent negative numbers in the row
                count = count + 1;
                r = r - 1;
            } else {
                // Bug 3: Decrements row instead of incrementing column when encountering positive numbers
                r = r - 1;
            }
        }

        return count;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        int result = solve(grid);
        System.out.println("Result: " + result);
    }
}
