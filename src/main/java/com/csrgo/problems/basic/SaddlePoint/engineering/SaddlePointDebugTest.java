// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SaddlePoint.engineering;

import java.util.Arrays;
import java.util.Objects;

public class SaddlePointDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return -1;
        }
        int r = mat.length;
        int c = mat[0].length;

        for (int i = 0; i < r; i++) {
            int colMin = 0;
            for (int j = 1; j < c; j++) {
                if (mat[i][j] < mat[i][colMin]) {
                    colMin = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < r; k++) {
                if (mat[k][colMin] > mat[i][colMin]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                return mat[i][colMin];
            }
        }
        return -1;
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int expectedResult = expected(mat);
        int actualResult = 0;
        try {
            actualResult = SaddlePointDebug.solve(mat);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running SaddlePointDebug tests...");

        runTestCase(1, new int[][]{{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}});
        runTestCase(2, new int[][]{{1, 2, 3}, {4, 5, 6}, {10, 8, 9}});
        runTestCase(3, new int[][]{{1, 5}, {3, 2}});
        runTestCase(4, new int[][]{{50}});
        runTestCase(5, new int[][]{{10, 20, 5, 40}});
        runTestCase(6, new int[][]{{10}, {20}, {5}, {40}});
        runTestCase(7, new int[][]{{7, 8, 3}, {2, 4, 1}, {5, 6, 2}});
        runTestCase(8, new int[][]{{3, 7, 8}, {9, 11, 13}});
        runTestCase(9, new int[][]{{1, 2}, {7, 8}, {3, 4}});
        runTestCase(10, new int[][]{{100, 200}, {300, 50}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
