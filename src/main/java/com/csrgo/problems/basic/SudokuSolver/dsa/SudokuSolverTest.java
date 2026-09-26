// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SudokuSolver.dsa;

public class SudokuSolverTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean isSolvedCorrectly(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) return false;

        for (int r = 0; r < 9; r++) {
            boolean[] rowSeen = new boolean[10];
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch < '1' || ch > '9') return false;
                int d = ch - '0';
                if (rowSeen[d]) return false;
                rowSeen[d] = true;
            }
        }

        for (int c = 0; c < 9; c++) {
            boolean[] colSeen = new boolean[10];
            for (int r = 0; r < 9; r++) {
                int d = board[r][c] - '0';
                if (colSeen[d]) return false;
                colSeen[d] = true;
            }
        }

        for (int b = 0; b < 9; b++) {
            boolean[] boxSeen = new boolean[10];
            int startR = (b / 3) * 3;
            int startC = (b % 3) * 3;
            for (int i = 0; i < 9; i++) {
                int d = board[startR + (i / 3)][startC + (i % 3)] - '0';
                if (boxSeen[d]) return false;
                boxSeen[d] = true;
            }
        }

        return true;
    }

    private static char[][] makeBoard(String[] rows) {
        char[][] b = new char[9][9];
        for (int i = 0; i < 9; i++) {
            b[i] = rows[i].toCharArray();
        }
        return b;
    }

    private static void runTestCase(int testNumber, char[][] board) {
        char[][] copy = new char[9][9];
        for (int i = 0; i < 9; i++) copy[i] = board[i].clone();

        boolean res = SudokuSolver.solve(copy);

        if (res && isSolvedCorrectly(copy)) {
            System.out.println("Test " + testNumber + " PASSED: board solved correctly.");
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: res=" + res);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running SudokuSolver tests...");

        String[] b1 = {
            "53..7....",
            "6..195...",
            ".98....6.",
            "8...6...3",
            "4..8.3..1",
            "7...2...6",
            ".6....28.",
            "...419..5",
            "....8..79"
        };
        runTestCase(1, makeBoard(b1));

        String[] b2 = {
            ".2.6.8...",
            "58...97..",
            "....4....",
            "37....5..",
            "6.......4",
            "..8....13",
            "....2....",
            "..98...36",
            "...3.6.9."
        };
        runTestCase(2, makeBoard(b2));

        String[] b3 = {
            "1........",
            ".2.......",
            "..3......",
            "...4.....",
            "....5....",
            ".....6...",
            "......7..",
            ".......8.",
            "........9"
        };
        runTestCase(3, makeBoard(b3));

        String[] b4 = {
            "..9748...",
            "7........",
            ".2.1.9...",
            "..7...24.",
            ".64.1.59.",
            ".98...3..",
            "...8.3.2.",
            "........6",
            "...2759.."
        };
        runTestCase(4, makeBoard(b4));

        String[] b5 = {
            "8........",
            "..36.....",
            ".7..9.2..",
            ".5...7...",
            "....457..",
            "...1...3.",
            "..1....68",
            "..85...1.",
            ".9....4.."
        };
        runTestCase(5, makeBoard(b5));

        runTestCase(6, makeBoard(b1));
        runTestCase(7, makeBoard(b2));
        runTestCase(8, makeBoard(b4));
        runTestCase(9, makeBoard(b5));
        runTestCase(10, makeBoard(b1));

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
