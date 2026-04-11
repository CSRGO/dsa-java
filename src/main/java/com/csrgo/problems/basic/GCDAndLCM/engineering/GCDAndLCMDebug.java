// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.GCDAndLCM.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/gcd-and-lcm/
public class GCDAndLCMDebug {

    // TODO: debug this method to fix it
    public static long[] solve(int n1, int n2) {
        int originN1 = n1;
        int originN2 = n2;

        while (n1 % n2 != 0) {
            int rem = n1 / n2;
            n1 = n2;
            n2 = rem;
        }

        long gcd = n2;
        long lcm = (n1 * n2) * gcd;

        return new long[] {gcd, lcm};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== GCD and LCM (Debug Mode) ====");
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
