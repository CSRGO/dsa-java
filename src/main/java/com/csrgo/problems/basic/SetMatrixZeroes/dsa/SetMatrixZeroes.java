// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SetMatrixZeroes.dsa;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {

    // TODO: write your logic here
    public static int[][] solve(int[][] mat) {
        return mat;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int[][] result = solve(mat);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
