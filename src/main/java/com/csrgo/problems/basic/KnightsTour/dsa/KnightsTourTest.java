// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.KnightsTour.dsa;

public class KnightsTourTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean isValidTour(int[][] board, int n, int startR, int startC) {
        if (board == null || board.length != n || board[0].length != n) return false;
        if (board[startR][startC] != 1) return false;

        int total = n * n;
        int[][] pos = new int[total + 1][2];
        boolean[] seen = new boolean[total + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = board[i][j];
                if (val < 1 || val > total || seen[val]) return false;
                seen[val] = true;
                pos[val][0] = i;
                pos[val][1] = j;
            }
        }

        for (int k = 1; k < total; k++) {
            int r1 = pos[k][0], c1 = pos[k][1];
            int r2 = pos[k + 1][0], c2 = pos[k + 1][1];
            int dr = Math.abs(r1 - r2);
            int dc = Math.abs(c1 - c2);
            if (!((dr == 1 && dc == 2) || (dr == 2 && dc == 1))) {
                return false;
            }
        }

        return true;
    }

    private static void runTestCase(int testNumber, int n, int r, int c, boolean shouldExist) {
        int[][] actual = KnightsTour.solve(n, r, c);
        boolean passed;
        if (!shouldExist) {
            passed = (actual.length == 0);
        } else {
            passed = isValidTour(actual, n, r, c);
        }

        if (passed) {
            System.out.println("Test " + testNumber + " PASSED: n=" + n + ", start=(" + r + "," + c + ")");
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: n=" + n + ", start=(" + r + "," + c + ")");
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running KnightsTour tests...");

        runTestCase(1, 1, 0, 0, true);
        runTestCase(2, 2, 0, 0, false);
        runTestCase(3, 3, 0, 0, false);
        runTestCase(4, 5, 0, 0, true);
        runTestCase(5, 5, 1, 2, true);
        runTestCase(6, 5, 2, 2, true);
        runTestCase(7, 5, 0, 4, true);
        runTestCase(8, 6, 0, 0, true);
        runTestCase(9, 4, 0, 0, false);
        runTestCase(10, 5, 4, 4, true);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
