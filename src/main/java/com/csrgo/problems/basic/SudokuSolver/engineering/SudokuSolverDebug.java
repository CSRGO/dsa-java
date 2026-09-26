// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SudokuSolver.engineering;

// Problem Link: https://dsa.csrgo.com/problems/sudoku-solver/
public class SudokuSolverDebug {

    // TODO: debug this method to fix it
    public static boolean solve(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    // Bug 1: Loop condition 'd < 9' misses digit '9' completely
                    for (char d = '1'; d < '9'; d++) {
                        if (isValid(board, r, c, d)) {
                            board[r][c] = d;

                            if (solve(board)) {
                                return true;
                            }

                            // Bug 2: Missing board[r][c] = '.' backtrack reset; trial digit persists in failed cells
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        // Bug 3: Faulty block calculation: computes 3 * (row % 3) instead of 3 * (row / 3)
        int startRow = 3 * (row % 3);
        int startCol = 3 * (col % 3);

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c) {
                return false;
            }
            if (board[i][col] == c) {
                return false;
            }
            int blockR = startRow + (i / 3);
            int blockC = startCol + (i % 3);
            if (board[blockR][blockC] == c) {
                return false;
            }
        }

        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        boolean result = solve(board);
        System.out.println("Result: " + result);
    }
}
