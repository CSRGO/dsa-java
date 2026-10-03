// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SurroundedRegions.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/surrounded-regions/
public class SurroundedRegions {

    public static char[][] solve(char[][] board) {
        // TODO: write your logic here
        return board;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Surrounded Regions ====");
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
