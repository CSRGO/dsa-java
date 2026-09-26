// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MatrixMultiplication.engineering;

import java.util.Arrays;

public class MatrixMultiplicationDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int[][] expected(int[][] mat1, int[][] mat2) {
        if (mat1 == null || mat2 == null || mat1.length == 0 || mat2.length == 0) {
            return new int[0][0];
        }
        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int r2 = mat2.length;
        int c2 = mat2[0].length;

        if (c1 != r2) {
            return new int[0][0];
        }

        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    private static void runTestCase(int testNumber, int[][] mat1, int[][] mat2) {
        int[][] expectedResult = expected(mat1, mat2);
        int[][] actualResult = null;
        try {
            actualResult = MatrixMultiplicationDebug.solve(mat1, mat2);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Arrays.deepEquals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: result=" + Arrays.deepToString(actualResult));
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + Arrays.deepToString(expectedResult) + ", actual=" + Arrays.deepToString(actualResult));
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running MatrixMultiplicationDebug tests...");

        runTestCase(1, new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 0}, {0, 1}});
        runTestCase(2, new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{7, 8}, {9, 1}, {2, 3}});
        runTestCase(3, new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 2, 3}});
        runTestCase(4, new int[][]{{3}}, new int[][]{{4}});
        runTestCase(5, new int[][]{{1, 2, 3}}, new int[][]{{4}, {5}, {6}});
        runTestCase(6, new int[][]{{1}, {2}, {3}}, new int[][]{{4, 5, 6}});
        runTestCase(7, new int[][]{{0, 0}, {0, 0}}, new int[][]{{5, 6}, {7, 8}});
        runTestCase(8, new int[][]{{-1, 2}, {3, -4}}, new int[][]{{2, -1}, {-3, 4}});
        runTestCase(9, new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 1, 1}, {2, 2, 2}});
        runTestCase(10, new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{1, 2, 3}, {4, 5, 6}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
