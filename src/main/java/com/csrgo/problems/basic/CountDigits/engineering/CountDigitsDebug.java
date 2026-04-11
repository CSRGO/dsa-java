// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.CountDigits.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-digits/
public class CountDigitsDebug {

    // TODO: debug this method to fix it
    public static int solve(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 0;
        while (n > 10) {
            n = n / 10;
            count = count + 1;
        }

        return count - 1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Digits (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        int result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
