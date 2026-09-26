// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RotateImage.engineering;

import java.util.Arrays;

public class RotateImageDebugTest {

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
        if (original == null || original.length <= 1) {
            return deepClone(original);
        }
        int[][] mat = deepClone(original);
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int j = 0; j < n; j++) {
            int top = 0;
            int bottom = n - 1;
            while (top < bottom) {
                int temp = mat[top][j];
                mat[top][j] = mat[bottom][j];
                mat[bottom][j] = temp;
                top++;
                bottom--;
            }
        }

        return mat;
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int[][] expectedResult = expected(mat);
        int[][] actualResult = null;
        try {
            actualResult = RotateImageDebug.solve(deepClone(mat));
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
        System.out.println("Running RotateImageDebug tests...");

        runTestCase(1, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        runTestCase(2, new int[][]{{1, 2}, {3, 4}});
        runTestCase(3, new int[][]{{42}});
        runTestCase(4, new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
        runTestCase(5, new int[][]{{0, 0}, {0, 0}});
        runTestCase(6, new int[][]{{-1, -2}, {-3, -4}});
        runTestCase(7, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
        runTestCase(8, new int[][]{{1, 2}, {2, 1}});
        runTestCase(9, new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});
        runTestCase(10, new int[][]{{99, 99}, {99, 99}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
