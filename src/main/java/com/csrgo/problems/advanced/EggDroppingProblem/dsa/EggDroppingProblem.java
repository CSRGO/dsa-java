// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.EggDroppingProblem.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/egg-dropping-problem/
public class EggDroppingProblem {

    public static int solve(int k, int n) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Egg Dropping Problem ====");
        System.out.print("Enter number of eggs (k): ");
        int k = sc.nextInt();
        System.out.print("Enter number of floors (n): ");
        int n = sc.nextInt();

        int result = solve(k, n);

        System.out.println("------------------------");
        System.out.println("Input  : k=" + k + ", n=" + n);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
