// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SetMatrixZeroes.engineering;

import java.util.Arrays;

public class SetMatrixZeroesDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int[][] deepClone(int[][] mat) {
        if (mat == null) return null;
        int[][] copy = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            copy[i] = mat[i].clone();
        }
        return copy;
    }

    private static int[][] expected(int[][] original) {
        if (original == null || original.length == 0 || original[0].length == 0) {
            return deepClone(original);
        }
        int[][] mat = deepClone(original);
        int m = mat.length;
        int n = mat[0].length;

        boolean[] rowZero = new boolean[m];
        boolean[] colZero = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowZero[i] || colZero[j]) {
                    mat[i][j] = 0;
                }
            }
        }

        return mat;
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int[][] expectedResult = expected(mat);
        int[][] actualResult = null;
        try {
            actualResult = SetMatrixZeroesDebug.solve(deepClone(mat));
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
        System.out.println("Running SetMatrixZeroesDebug tests...");

        runTestCase(1, new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
        runTestCase(2, new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
        runTestCase(3, new int[][]{{0}});
        runTestCase(4, new int[][]{{42}});
        runTestCase(5, new int[][]{{1, 2}, {3, 4}});
        runTestCase(6, new int[][]{{0, 0}, {0, 0}});
        runTestCase(7, new int[][]{{1, 0, 3}, {4, 5, 6}});
        runTestCase(8, new int[][]{{1, 2}, {0, 4}, {5, 6}});
        runTestCase(9, new int[][]{{1, 0, 3}});
        runTestCase(10, new int[][]{{1}, {0}, {3}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
