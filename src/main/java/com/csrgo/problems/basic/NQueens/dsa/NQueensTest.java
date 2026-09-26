// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.NQueens.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NQueensTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void place(int row, char[][] board, List<List<String>> res) {
        int n = board.length;
        if (row == n) {
            List<String> cur = new ArrayList<>();
            for (char[] r : board) cur.add(new String(r));
            res.add(cur);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                place(row + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) if (board[i][col] == 'Q') return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) if (board[i][j] == 'Q') return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) if (board[i][j] == 'Q') return false;
        return true;
    }

    private static List<List<String>> expected(int n) {
        List<List<String>> res = new ArrayList<>();
        if (n <= 0) return res;
        char[][] b = new char[n][n];
        for (char[] r : b) Arrays.fill(r, '.');
        place(0, b, res);
        return res;
    }

    private static void runTestCase(int testNumber, int n) {
        List<List<String>> expectedResult = expected(n);
        List<List<String>> actualResult = NQueens.solve(n);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: n=" + n + ", solutions=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: n=" + n + ", expected=" + expectedResult.size() + ", actual=" + actualResult.size());
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running NQueens tests...");

        runTestCase(1, 4);
        runTestCase(2, 1);
        runTestCase(3, 2);
        runTestCase(4, 3);
        runTestCase(5, 5);
        runTestCase(6, 6);
        runTestCase(7, 7);
        runTestCase(8, 8);
        runTestCase(9, 4);
        runTestCase(10, 1);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
