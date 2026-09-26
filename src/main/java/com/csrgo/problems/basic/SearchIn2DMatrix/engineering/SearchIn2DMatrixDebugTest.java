// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SearchIn2DMatrix.engineering;

import java.util.Arrays;
import java.util.Objects;

public class SearchIn2DMatrixDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean expected(int[][] mat, int target) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return false;
        int m = mat.length;
        int n = mat[0].length;
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mat[mid / n][mid % n];
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    private static void runTestCase(int testNumber, int[][] mat, int target) {
        boolean expectedResult = expected(mat, target);
        boolean actualResult = false;
        try {
            actualResult = SearchIn2DMatrixDebug.solve(mat, target);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: target=" + target + ", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: target=" + target + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running SearchIn2DMatrixDebug tests...");

        int[][] mat = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        runTestCase(1, mat, 3);
        runTestCase(2, mat, 13);
        runTestCase(3, mat, 1);
        runTestCase(4, mat, 60);
        runTestCase(5, mat, 16);
        runTestCase(6, mat, 0);
        runTestCase(7, mat, 100);
        runTestCase(8, new int[][]{{5}}, 5);
        runTestCase(9, new int[][]{{5}}, 2);
        runTestCase(10, new int[][]{{1, 3, 5, 7, 9}}, 7);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
