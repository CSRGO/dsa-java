// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.IsNumberPrime.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/is-number-prime/
public class IsNumberPrimeDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int n) {
        if (n <= 1) return true;
        
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        if (n == 2) return false;
        
        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Is Number Prime (DEBUG) ====");
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
