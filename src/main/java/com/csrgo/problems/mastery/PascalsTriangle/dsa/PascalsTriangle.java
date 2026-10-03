// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PascalsTriangle.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/pascals-triangle/
public class PascalsTriangle {

    public static List<List<Integer>> solve(int numRows) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Pascal's Triangle ====");
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
