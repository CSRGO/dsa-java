// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PascalsTriangle.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/pascals-triangle/
public class PascalsTriangleDebug {

    // TODO: debug this method to fix it
    public static List<List<Integer>> solve(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int r = 0; r < numRows; r = r + 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int c = 1; c < r - 1; c = c + 1) {
                List<Integer> prev = triangle.get(r - 1);
                int val = prev.get(c) + prev.get(c);
                row.add(val);
            }

            if (r > 1) {
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Pascal's Triangle (DEBUG) ====");
        System.out.print("Enter number of rows numRows: ");
        int numRows = sc.nextInt();

        List<List<Integer>> result = solve(numRows);

        System.out.println("------------------------");
        System.out.println("Rows: " + numRows);
        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
        System.out.println("========================");

        sc.close();
    }
}
