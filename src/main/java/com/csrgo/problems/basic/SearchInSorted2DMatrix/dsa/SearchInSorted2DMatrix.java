// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.SearchInSorted2DMatrix.dsa;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/search-in-sorted-2d-matrix/
public class SearchInSorted2DMatrix {

    // TODO: write your logic here
    public static boolean solve(int[][] mat, int target) {
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        boolean result = solve(mat, 5);
        System.out.println("Result: " + result);
    }
}
