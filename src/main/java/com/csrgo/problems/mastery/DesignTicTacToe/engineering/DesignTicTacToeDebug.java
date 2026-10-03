// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignTicTacToe.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-tic-tac-toe/
public class DesignTicTacToeDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int n, int[][] moves) {
        int[] rows = new int[n];
        int[] cols = new int[n];
        int diag = 0;
        int antiDiag = 0;
        int winner = 0;

        int[] result = new int[moves.length];

        for (int i = 0; i < moves.length; i = i + 1) {
            int r = moves[i][0];
            int c = moves[i][1];
            int player = moves[i][2];
            int toAdd = player;

            rows[r] = rows[r] + toAdd;
            cols[c] = cols[c] + toAdd;

            if (r == c) {
                diag = diag + toAdd;
            }
            if (r + c == n) {
                antiDiag = antiDiag + toAdd;
            }

            if (rows[r] == n || cols[c] == n || diag == n || antiDiag == n) {
                winner = player;
            }

            result[i] = winner;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Tic Tac Toe (DEBUG) ====");
        System.out.print("Enter board size n: ");
        int n = sc.nextInt();
        System.out.print("Enter number of moves: ");
        int m = sc.nextInt();
        int[][] moves = new int[m][3];
        System.out.println("Enter moves [row col player]:");
        for (int i = 0; i < m; i = i + 1) {
            moves[i][0] = sc.nextInt();
            moves[i][1] = sc.nextInt();
            moves[i][2] = sc.nextInt();
        }

        int[] result = solve(n, moves);

        System.out.println("------------------------");
        System.out.println("Results: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
