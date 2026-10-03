// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LargestRectangleInBinaryMatrix.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/largest-rectangle-in-binary-matrix/
public class LargestRectangleInBinaryMatrixDebug {

    // TODO: debug this method to fix it
    public static int solve(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return -1;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i = i + 1) {
            for (int j = 0; j < cols; j = j + 1) {
                if (matrix[i][j] == '1') {
                    heights[j] = heights[j] + 1;
                }
            }
            maxArea = Math.max(maxArea, maxHistogram(heights));
        }

        return maxArea;
    }

    private static int maxHistogram(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i = i + 1) {
            int h;
            if (i == n) {
                h = 0;
            } else {
                h = heights[i];
            }

            while (!stack.isEmpty() && heights[stack.peek()] >= h) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek();
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Largest Rectangle in Binary Matrix (DEBUG) ====");
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
