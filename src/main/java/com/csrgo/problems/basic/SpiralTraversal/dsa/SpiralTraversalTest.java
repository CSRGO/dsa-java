// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SpiralTraversal.dsa;

import java.util.Arrays;

public class SpiralTraversalTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int[] expected(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int idx = 0;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int c = left; c <= right; c++) {
                res[idx++] = mat[top][c];
            }
            top++;

            for (int r = top; r <= bottom; r++) {
                res[idx++] = mat[r][right];
            }
            right--;

            if (top <= bottom) {
                for (int c = right; c >= left; c--) {
                    res[idx++] = mat[bottom][c];
                }
                bottom--;
            }

            if (left <= right) {
                for (int r = bottom; r >= top; r--) {
                    res[idx++] = mat[r][left];
                }
                left++;
            }
        }
        return res;
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int[] expectedResult = expected(mat);
        int[] actualResult = SpiralTraversal.solve(mat);

        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: result=" + Arrays.toString(actualResult));
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + Arrays.toString(expectedResult) + ", actual=" + Arrays.toString(actualResult));
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running SpiralTraversal tests...");

        runTestCase(1, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        runTestCase(2, new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        runTestCase(3, new int[][]{{10}});
        runTestCase(4, new int[][]{{1, 2, 3, 4, 5}});
        runTestCase(5, new int[][]{{1}, {2}, {3}, {4}, {5}});
        runTestCase(6, new int[][]{{1, 2}, {3, 4}});
        runTestCase(7, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}});
        runTestCase(8, new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}});
        runTestCase(9, new int[][]{{-1, -2}, {-3, -4}});
        runTestCase(10, new int[][]{{0, 0}, {0, 0}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
