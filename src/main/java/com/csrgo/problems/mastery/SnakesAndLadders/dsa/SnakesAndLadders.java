// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SnakesAndLadders.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/snakes-and-ladders/
public class SnakesAndLadders {

    public static int solve(int[][] board) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Snakes and Ladders ====");
        System.out.print("Enter board dimension n: ");
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                System.out.print("Enter cell (" + i + ", " + j + ") value (-1 if empty): ");
                board[i][j] = sc.nextInt();
            }
        }

        int result = solve(board);

        System.out.println("------------------------");
        System.out.println("Board         : " + Arrays.deepToString(board));
        System.out.println("Minimum Moves : " + result);
        System.out.println("========================");

        sc.close();
    }
}
