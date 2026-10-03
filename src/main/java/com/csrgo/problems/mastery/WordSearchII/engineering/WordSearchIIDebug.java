// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordSearchII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/word-search-ii/
public class WordSearchIIDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < words.length; i = i + 1) {
            String w = words[i];
            boolean found = false;
            for (int r = 0; r < m && !found; r = r + 1) {
                for (int c = 0; c < n && !found; c = c + 1) {
                    if (dfsSimple(board, r, c, w, 0)) {
                        result.add(w);
                        found = true;
                    }
                }
            }
        }

        return result;
    }

    private static boolean dfsSimple(char[][] board, int r, int c, String w, int idx) {
        if (idx == w.length()) {
            return true;
        }
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != w.charAt(idx)) {
            return false;
        }

        board[r][c] = '#';
        boolean found = dfsSimple(board, r + 1, c, w, idx + 1) ||
                        dfsSimple(board, r, c + 1, w, idx + 1);
        board[r][c] = w.charAt(idx);
        return found;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Word Search II (DEBUG) ====");
        System.out.print("Enter rows m: ");
        int m = sc.nextInt();
        System.out.print("Enter cols n: ");
        int n = sc.nextInt();
        char[][] board = new char[m][n];

        for (int i = 0; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        System.out.print("Enter number of words: ");
        int wCount = sc.nextInt();
        String[] words = new String[wCount];
        for (int i = 0; i < wCount; i = i + 1) {
            words[i] = sc.next();
        }

        List<String> result = solve(board, words);

        System.out.println("------------------------");
        System.out.println("Found Words : " + result);
        System.out.println("========================");

        sc.close();
    }
}
