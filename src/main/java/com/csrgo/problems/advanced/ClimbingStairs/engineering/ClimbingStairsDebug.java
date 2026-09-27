// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ClimbingStairs.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/climbing-stairs/
public class ClimbingStairsDebug {

    // TODO: debug this method to fix it
    public static int solve(int n) {
        if (n <= 1) {
            return 0;
        }

        int first = 0;
        int second = 1;

        for (int i = 3; i < n; i = i + 1) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Climbing Stairs (DEBUG) ====");
        System.out.print("Enter number of stairs (n): ");
        int n = sc.nextInt();

        int result = solve(n);

        System.out.println("------------------------");
        System.out.println("Input  : n=" + n);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
