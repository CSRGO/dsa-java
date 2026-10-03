// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UniquePaths.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/unique-paths/
public class UniquePaths {

    public static int solve(int m, int n) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Unique Paths ====");
        System.out.print("Enter number of rows m: ");
        int m = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter number of columns n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int paths = solve(m, n);
        System.out.println("Total Unique Paths: " + paths);
    }
}
