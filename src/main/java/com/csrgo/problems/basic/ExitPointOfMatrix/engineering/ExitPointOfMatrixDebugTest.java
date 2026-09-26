// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ExitPointOfMatrix.engineering;

import java.util.Arrays;

public class ExitPointOfMatrixDebugTest {

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

    private static int[] expected(int[][] original) {
        if (original == null || original.length == 0 || original[0].length == 0) {
            return new int[]{0, 0};
        }
        int[][] mat = deepClone(original);
        int r = mat.length;
        int c = mat[0].length;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int i = 0;
        int j = 0;
        int dir = 0;

        while (true) {
            if (mat[i][j] == 1) {
                dir = (dir + 1) % 4;
                mat[i][j] = 0;
            }

            int nextI = i + dr[dir];
            int nextJ = j + dc[dir];

            if (nextI < 0 || nextI >= r || nextJ < 0 || nextJ >= c) {
                return new int[]{i, j};
            }

            i = nextI;
            j = nextJ;
        }
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int[] expectedResult = expected(mat);
        int[] actualResult = null;
        try {
            actualResult = ExitPointOfMatrixDebug.solve(deepClone(mat));
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
        System.out.println("Running ExitPointOfMatrixDebug tests...");

        runTestCase(1, new int[][]{{0, 0, 1, 0}, {1, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 1, 0}});
        runTestCase(2, new int[][]{{0, 1}, {1, 0}});
        runTestCase(3, new int[][]{{0}});
        runTestCase(4, new int[][]{{1}});
        runTestCase(5, new int[][]{{0, 0, 0, 0}});
        runTestCase(6, new int[][]{{0}, {0}, {0}});
        runTestCase(7, new int[][]{{1, 1}, {1, 1}});
        runTestCase(8, new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});
        runTestCase(9, new int[][]{{0, 0, 1}, {0, 0, 0}, {0, 0, 0}});
        runTestCase(10, new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 0, 0}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
