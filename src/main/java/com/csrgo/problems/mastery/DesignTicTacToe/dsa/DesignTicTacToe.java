// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignTicTacToe.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-tic-tac-toe/
public class DesignTicTacToe {

    public static int[] solve(int n, int[][] moves) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Tic Tac Toe ====");
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
