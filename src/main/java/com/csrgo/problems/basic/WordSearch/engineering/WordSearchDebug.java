// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.WordSearch.engineering;

// Problem Link: https://dsa.csrgo.com/problems/word-search/
public class WordSearchDebug {

    // TODO: debug this method to fix it
    public static boolean solve(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null) {
            return false;
        }

        int m = board.length;
        int n = board[0].length;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == word.charAt(0)) {
                    if (dfs(board, word, r, c, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String word, int r, int c, int idx) {
        // Bug 1: Premature base case 'idx == word.length() - 1' returns true before validating the final letter
        if (idx == word.length() - 1) {
            return true;
        }

        int m = board.length;
        int n = board[0].length;

        // Bug 2: Off-by-one boundary check 'r > m' triggers ArrayIndexOutOfBoundsException on board[r][c]
        if (r < 0 || c < 0 || r > m || c >= n || board[r][c] != word.charAt(idx)) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';

        boolean found = dfs(board, word, r - 1, c, idx + 1)
                     || dfs(board, word, r + 1, c, idx + 1)
                     || dfs(board, word, r, c - 1, idx + 1)
                     || dfs(board, word, r, c + 1, idx + 1);

        // Bug 3: Missing board[r][c] = temp restore step; '#' sentinel permanently corrupts grid cells

        return found;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        boolean result = solve(board, word);
        System.out.println("Result: " + result);
    }
}
