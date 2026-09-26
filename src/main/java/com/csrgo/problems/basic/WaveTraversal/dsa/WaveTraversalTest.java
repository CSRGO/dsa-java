// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.WaveTraversal.dsa;

import java.util.Arrays;

public class WaveTraversalTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int[] expected(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        int r = mat.length;
        int c = mat[0].length;
        int[] res = new int[r * c];
        int idx = 0;
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < r; i++) {
                    res[idx++] = mat[i][j];
                }
            } else {
                for (int i = r - 1; i >= 0; i--) {
                    res[idx++] = mat[i][j];
                }
            }
        }
        return res;
    }

    private static void runTestCase(int testNumber, int[][] mat) {
        int[] expectedResult = expected(mat);
        int[] actualResult = WaveTraversal.solve(mat);

        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: result=" + Arrays.toString(actualResult));
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + Arrays.toString(expectedResult) + ", actual=" + Arrays.toString(actualResult));
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running WaveTraversal tests...");

        runTestCase(1, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        runTestCase(2, new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
        runTestCase(3, new int[][]{{42}});
        runTestCase(4, new int[][]{{10, 20, 30, 40}});
        runTestCase(5, new int[][]{{1}, {2}, {3}, {4}});
        runTestCase(6, new int[][]{{1, 2}, {3, 4}});
        runTestCase(7, new int[][]{{1, 2, 3}, {4, 5, 6}});
        runTestCase(8, new int[][]{{-1, -2}, {-3, -4}});
        runTestCase(9, new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        runTestCase(10, new int[][]{{0, 0}, {0, 0}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
