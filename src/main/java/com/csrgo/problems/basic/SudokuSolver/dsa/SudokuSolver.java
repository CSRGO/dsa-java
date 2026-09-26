// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SudokuSolver.dsa;

// Problem Link: https://dsa.csrgo.com/problems/sudoku-solver/
public class SudokuSolver {

    // TODO: write your logic here
    public static boolean solve(char[][] board) {
        return false;
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
