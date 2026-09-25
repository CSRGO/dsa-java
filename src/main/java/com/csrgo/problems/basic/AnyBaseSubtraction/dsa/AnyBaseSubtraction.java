// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseSubtraction.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/any-base-subtraction/
public class AnyBaseSubtraction {

    public static long solve(long n1, long n2, int b) {
        // TODO: write your logic here
        return 0L;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Any Base Subtraction ====");
        System.out.print("Enter first number n1 (larger): ");
        long n1 = sc.nextLong();
        System.out.print("Enter second number n2 (smaller): ");
        long n2 = sc.nextLong();
        System.out.print("Enter base b (2-10): ");
        int b = sc.nextInt();
        
        long result = solve(n1, n2, b);
        
        System.out.println("------------------------");
        System.out.println("Input  : n1=" + n1 + ", n2=" + n2 + ", b=" + b);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
