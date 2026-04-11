// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PalindromeNumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/palindrome-number/
public class PalindromeNumberDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int n) {
        if (n == 0) {
            return false;
        }

        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed + n % 10;
            n = n / 10;
        }

        if (original < 0) {
            return true;
        }

        return reversed == original;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Palindrome Number (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        boolean result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Result : " + result);
        System.out.println("========================");
    }
}
