// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MaximumSumRectangle.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/maximum-sum-rectangle/
public class MaximumSumRectangleDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return 0;
        }

        int R = mat.length;
        int C = mat[0].length;

        // Bug 1: Initializing globalMax to 0 fails when all matrix elements are negative
        int globalMax = 0;

        for (int left = 0; left < C; left++) {
            for (int right = left; right < C; right++) {
                // Bug 2: Allocating temp inside the right loop resets cumulative row sums prematurely
                int[] temp = new int[R];
                for (int i = 0; i < R; i++) {
                    temp[i] += mat[i][right];
                }

                // Bug 3: Initializing maxSubarray to 0 ignores negative maximum values
                int currentSum = 0;
                int maxSubarray = 0;

                for (int i = 0; i < R; i++) {
                    currentSum += temp[i];
                    if (currentSum > maxSubarray) {
                        maxSubarray = currentSum;
                    }
                    if (currentSum < 0) {
                        currentSum = 0;
                    }
                }

                if (maxSubarray > globalMax) {
                    globalMax = maxSubarray;
                }
            }
        }

        return globalMax;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
        };
        int result = solve(mat);
        System.out.println("Result: " + result);
    }
}
