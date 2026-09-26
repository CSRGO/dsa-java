// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RotateImage.dsa;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/rotate-image/
public class RotateImage {

    // TODO: write your logic here
    public static int[][] solve(int[][] mat) {
        return mat;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = solve(mat);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
