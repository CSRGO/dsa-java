// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SearchInSorted2DMatrix.dsa;

import java.util.Arrays;
import java.util.Objects;

public class SearchInSorted2DMatrixTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean expected(int[][] mat, int target) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return false;
        }
        int m = mat.length;
        int n = mat[0].length;
        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (mat[i][j] == target) {
                return true;
            } else if (mat[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    private static void runTestCase(int testNumber, int[][] mat, int target) {
        boolean expectedResult = expected(mat, target);
        boolean actualResult = SearchInSorted2DMatrix.solve(mat, target);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: target=" + target + ", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: target=" + target + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running SearchInSorted2DMatrix tests...");

        int[][] mat = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        runTestCase(1, mat, 5);
        runTestCase(2, mat, 20);
        runTestCase(3, mat, 1);
        runTestCase(4, mat, 30);
        runTestCase(5, mat, 15);
        runTestCase(6, mat, 18);
        runTestCase(7, mat, 0);
        runTestCase(8, mat, 35);
        runTestCase(9, new int[][]{{42}}, 42);
        runTestCase(10, new int[][]{{42}}, 10);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
