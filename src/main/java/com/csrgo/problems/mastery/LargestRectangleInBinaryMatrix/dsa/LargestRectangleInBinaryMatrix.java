// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LargestRectangleInBinaryMatrix.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/largest-rectangle-in-binary-matrix/
public class LargestRectangleInBinaryMatrix {

    public static int solve(char[][] matrix) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Largest Rectangle in Binary Matrix ====");
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int c = sc.nextInt();
        char[][] matrix = new char[r][c];
        System.out.println("Enter matrix rows (as strings of 0s and 1s):");
        for (int i = 0; i < r; i = i + 1) {
            String row = sc.next();
            for (int j = 0; j < c; j = j + 1) {
                matrix[i][j] = row.charAt(j);
            }
        }

        int result = solve(matrix);

        System.out.println("------------------------");
        System.out.println("Max Rectangle Area : " + result);
        System.out.println("========================");

        sc.close();
    }
}
