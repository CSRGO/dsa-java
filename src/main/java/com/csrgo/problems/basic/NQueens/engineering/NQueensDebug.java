// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.NQueens.engineering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/n-queens/
public class NQueensDebug {

    // TODO: debug this method to fix it
    public static List<List<String>> solve(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        placeQueens(0, board, result);
        return result;
    }

    private static void placeQueens(int row, char[][] board, List<List<String>> result) {
        int n = board.length;
        // Bug 1: Premature base case 'row == n - 1' halts before placing queen in the final row
        if (row == n - 1) {
            List<String> configuration = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                configuration.add(new String(board[i]));
            }
            result.add(configuration);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                placeQueens(row + 1, board, result);
                // Bug 2: Missing backtracking board[row][col] = '.' reset, leaving stale queens on board
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Vertical check above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Bug 3: Missing upper-right diagonal safety validation, allowing conflicting queens to attack

        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = solve(n);
        System.out.println("Result: " + result);
    }
}
