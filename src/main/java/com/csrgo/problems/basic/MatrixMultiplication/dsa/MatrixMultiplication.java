// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MatrixMultiplication.dsa;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/matrix-multiplication/
public class MatrixMultiplication {

    // TODO: write your logic here
    public static int[][] solve(int[][] mat1, int[][] mat2) {
        return new int[0][0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{1, 0}, {0, 1}};
        int[][] result = solve(mat1, mat2);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
