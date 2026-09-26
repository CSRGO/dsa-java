// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ExitPointOfMatrix.dsa;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/exit-point-of-matrix/
public class ExitPointOfMatrix {

    // TODO: write your logic here
    public static int[] solve(int[][] mat) {
        return new int[]{0, 0};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 0, 1, 0}
        };
        int[] result = solve(mat);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
