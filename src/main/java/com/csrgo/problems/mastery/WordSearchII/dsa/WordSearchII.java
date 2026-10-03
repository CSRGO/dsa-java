// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordSearchII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/word-search-ii/
public class WordSearchII {

    public static List<String> solve(char[][] board, String[] words) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Word Search II ====");
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
