// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ArrangeBuildings.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/arrange-buildings/
public class ArrangeBuildings {

    public static long solve(int n) {
        // TODO: write your logic here
        return 0L;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Arrange Buildings ====");
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
