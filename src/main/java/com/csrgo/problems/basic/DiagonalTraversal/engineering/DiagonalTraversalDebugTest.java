// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.DiagonalTraversal.engineering;

import java.util.Arrays;

public class DiagonalTraversalDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int[] expected(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;
        int totalDiagonals = m + n - 1;

        for (int d = 0; d < totalDiagonals; d++) {
            if (d % 2 == 0) {
                int rStart = Math.min(d, m - 1);
                int rEnd = Math.max(0, d - n + 1);
                for (int r = rStart; r >= rEnd; r--) {
                    result[idx++] = mat[r][d - r];
                }
            } else {
                int rStart = Math.max(0, d - n + 1);
                int rEnd = Math.min(d, m - 1);
                for (int r = rStart; r <= rEnd; r++) {
                    result[idx++] = mat[r][d - r];
                }
            }
        }
        return result;
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int[] expectedResult = expected(mat);
        int[] actualResult = null;
        try {
            actualResult = DiagonalTraversalDebug.solve(mat);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: result=" + Arrays.toString(actualResult));
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + Arrays.toString(expectedResult) + ", actual=" + Arrays.toString(actualResult));
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running DiagonalTraversalDebug tests...");

        runTestCase(1, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        runTestCase(2, new int[][]{{1, 2}, {3, 4}});
        runTestCase(3, new int[][]{{42}});
        runTestCase(4, new int[][]{{1, 2, 3, 4}});
        runTestCase(5, new int[][]{{1}, {2}, {3}, {4}});
        runTestCase(6, new int[][]{{1, 2, 3}, {4, 5, 6}});
        runTestCase(7, new int[][]{{1, 2}, {3, 4}, {5, 6}});
        runTestCase(8, new int[][]{{-1, -2}, {-3, -4}});
        runTestCase(9, new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        runTestCase(10, new int[][]{{0, 0}, {0, 0}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
