// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.CountNegativeNumbersInSortedMatrix.dsa;

import java.util.Arrays;
import java.util.Objects;

public class CountNegativeNumbersInSortedMatrixTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int r = m - 1;
        int c = 0;
        int count = 0;

        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                count += (n - c);
                r--;
            } else {
                c++;
            }
        }
        return count;
    }

    private static void runTestCase(int testNumber, int[][] grid) {
        int expectedResult = expected(grid);
        int actualResult = CountNegativeNumbersInSortedMatrix.solve(grid);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running CountNegativeNumbersInSortedMatrix tests...");

        runTestCase(1, new int[][]{
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        });
        runTestCase(2, new int[][]{{3, 2}, {1, 0}});
        runTestCase(3, new int[][]{{-1, -1}, {-1, -2}});
        runTestCase(4, new int[][]{{5}});
        runTestCase(5, new int[][]{{-5}});
        runTestCase(6, new int[][]{{3, 2, 0, -1, -4}});
        runTestCase(7, new int[][]{{3}, {2}, {0}, {-1}, {-4}});
        runTestCase(8, new int[][]{{0, -1}, {-1, -2}});
        runTestCase(9, new int[][]{{5, 4, 3}, {3, 2, 1}, {1, 0, -1}});
        runTestCase(10, new int[][]{{100, 50}, {25, -10}});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
