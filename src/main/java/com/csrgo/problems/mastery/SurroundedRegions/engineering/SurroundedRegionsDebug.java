// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SurroundedRegions.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/surrounded-regions/
public class SurroundedRegionsDebug {

    // TODO: debug this method to fix it
    public static char[][] solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return board;
        }

        int m = board.length;
        int n = board[0].length;

        for (int r = 0; r < m; r = r + 1) {
            if (board[r][0] == 'O') {
                dfs(board, r, 0, m, n);
            }
        }

        for (int c = 0; c < n; c = c + 1) {
            if (board[0][c] == 'O') {
                dfs(board, 0, c, m, n);
            }
        }

        for (int r = 0; r < m; r = r + 1) {
            for (int c = 0; c < n; c = c + 1) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if (board[r][c] == '#') {
                    board[r][c] = 'X';
                }
            }
        }

        return board;
    }

    private static void dfs(char[][] board, int r, int c, int m, int n) {
        if (r < 0 || r >= m || c < 0 || c >= n || board[r][c] != 'O') {
            return;
        }
        board[r][c] = '#';
        dfs(board, r - 1, c, m, n);
        dfs(board, r + 1, c, m, n);
        dfs(board, r, c - 1, m, n);
        dfs(board, r, c + 1, m, n);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Surrounded Regions (DEBUG) ====");
        System.out.print("Enter rows m: ");
        int m = sc.nextInt();
        System.out.print("Enter cols n: ");
        int n = sc.nextInt();
        char[][] board = new char[m][n];
        System.out.println("Enter board rows:");
        for (int i = 0; i < m; i = i + 1) {
            String row = sc.next();
            for (int j = 0; j < n; j = j + 1) {
                board[i][j] = row.charAt(j);
            }
        }

        char[][] result = solve(board);

        System.out.println("------------------------");
        System.out.println("Result Board:");
        for (int i = 0; i < m; i = i + 1) {
            System.out.println(new String(result[i]));
        }
        System.out.println("========================");

        sc.close();
    }
}
