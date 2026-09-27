// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ClimbingStairs.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/climbing-stairs/
public class ClimbingStairs {

    public static int solve(int n) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Climbing Stairs ====");
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
