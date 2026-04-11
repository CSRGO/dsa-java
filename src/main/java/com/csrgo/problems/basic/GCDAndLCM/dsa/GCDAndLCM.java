// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.GCDAndLCM.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/gcd-and-lcm/
public class GCDAndLCM {

    public static long[] solve(int n1, int n2) {
        // TODO: write your logic here
        return new long[2];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== GCD and LCM ====");
        System.out.print("Enter first number n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number n2: ");
        int n2 = sc.nextInt();
        
        long[] result = solve(n1, n2);
        
        System.out.println("------------------------");
        System.out.println("Input  : n1=" + n1 + ", n2=" + n2);
        System.out.println("GCD    : " + result[0]);
        System.out.println("LCM    : " + result[1]);
        System.out.println("========================");
    }
}
