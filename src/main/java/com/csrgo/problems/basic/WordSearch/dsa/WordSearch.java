// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.WordSearch.dsa;

// Problem Link: https://dsa.csrgo.com/problems/word-search/
public class WordSearch {

    // TODO: write your logic here
    public static boolean solve(char[][] board, String word) {
        return false;
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
