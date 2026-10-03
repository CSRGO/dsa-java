// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.EvaluateDivision.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/evaluate-division/
public class EvaluateDivision {

    public static double[] solve(String[][] equations, double[] values, String[][] queries) {
        // TODO: write your logic here
        return new double[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Evaluate Division ====");
        System.out.print("Enter number of equations n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        String[][] equations = new String[n][2];
        double[] values = new double[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter variable 1 for equation " + (i + 1) + ": ");
            equations[i][0] = sc.nextLine().trim();
            System.out.print("Enter variable 2 for equation " + (i + 1) + ": ");
            equations[i][1] = sc.nextLine().trim();
            System.out.print("Enter value for equation " + (i + 1) + ": ");
            values[i] = Double.parseDouble(sc.nextLine().trim());
        }

        System.out.print("Enter number of queries q: ");
        int q = Integer.parseInt(sc.nextLine().trim());

        String[][] queries = new String[q][2];
        for (int i = 0; i < q; i = i + 1) {
            System.out.print("Enter variable 1 for query " + (i + 1) + ": ");
            queries[i][0] = sc.nextLine().trim();
            System.out.print("Enter variable 2 for query " + (i + 1) + ": ");
            queries[i][1] = sc.nextLine().trim();
        }

        double[] results = solve(equations, values, queries);
        System.out.println("Results: " + Arrays.toString(results));
    }
}
