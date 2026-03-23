// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.IsNumberPrime.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/is-number-prime/
public class IsNumberPrime {

    public static boolean solve(int n) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Is Number Prime ====");
        System.out.print("Enter number (n): ");
        int n = sc.nextInt();
        
        boolean result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
        
        sc.close();
    }
}
