// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MaximumSumRectangle.engineering;

import java.util.Arrays;
import java.util.Objects;

public class MaximumSumRectangleDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return 0;
        int R = mat.length;
        int C = mat[0].length;
        int globalMax = Integer.MIN_VALUE;

        for (int left = 0; left < C; left++) {
            int[] temp = new int[R];
            for (int right = left; right < C; right++) {
                for (int i = 0; i < R; i++) {
                    temp[i] += mat[i][right];
                }

                int currentSum = temp[0];
                int maxSubarray = temp[0];
                for (int i = 1; i < R; i++) {
                    currentSum = Math.max(temp[i], currentSum + temp[i]);
                    maxSubarray = Math.max(maxSubarray, currentSum);
                }
                globalMax = Math.max(globalMax, maxSubarray);
            }
        }
        return globalMax;
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int expectedResult = expected(mat);
        int actualResult = 0;
        try {
            actualResult = MaximumSumRectangleDebug.solve(mat);
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
        System.out.println("Running MaximumSumRectangleDebug tests...");

        runTestCase(1, new int[][]{
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
        });
        runTestCase(2, new int[][]{{-1, -2}, {-3, -4}});
        runTestCase(3, new int[][]{{42}});
        runTestCase(4, new int[][]{{-5}});
        runTestCase(5, new int[][]{{1, 2}, {3, 4}});
        runTestCase(6, new int[][]{{-2, 1, -3, 4, -1, 2, 1, -5, 4}});
        runTestCase(7, new int[][]{{-2}, {1}, {-3}, {4}, {-1}, {2}, {1}, {-5}, {4}});
        runTestCase(8, new int[][]{{0, 0, 0}, {0, 5, 0}, {0, 0, 0}});
        runTestCase(9, new int[][]{{1, -2, 3}, {-4, 5, -6}, {7, -8, 9}});
        runTestCase(10, new int[][]{{2, 1, -3}, {-1, 2, 3}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
