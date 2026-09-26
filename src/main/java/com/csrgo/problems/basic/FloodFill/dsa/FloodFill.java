// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.FloodFill.dsa;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/flood-fill/
public class FloodFill {

    // TODO: write your logic here
    public static List<String> solve(int[][] maze) {
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        List<String> result = solve(maze);
        System.out.println("Result: " + result);
    }
}
