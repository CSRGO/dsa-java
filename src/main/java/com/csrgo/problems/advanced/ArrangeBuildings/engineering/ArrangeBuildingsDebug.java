// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ArrangeBuildings.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/arrange-buildings/
public class ArrangeBuildingsDebug {

    // TODO: debug this method to fix it
    public static long solve(int n) {
        if (n <= 1) {
            return 0L;
        }

        int buildings = 1;
        int spaces = 1;

        for (int i = 2; i < n; i = i + 1) {
            int nextBuildings = spaces;
            int nextSpaces = buildings + spaces;
            buildings = nextBuildings;
            spaces = nextSpaces;
        }

        int singleSide = buildings + spaces;
        return (long) singleSide * 2;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Arrange Buildings (DEBUG) ====");
        System.out.print("Enter road length (n): ");
        int n = sc.nextInt();

        long result = solve(n);

        System.out.println("------------------------");
        System.out.println("Input  : n=" + n);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
