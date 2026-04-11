// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ReverseANumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reverse-a-number/
public class ReverseANumberDebug {

    // TODO: debug this method to fix it
    public static int solve(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 0;
        while (n > 10) {
            int lastDigit = n % 10;
            result = (result * 10) + lastDigit;
            n = n / 10;
        }

        return result + n;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reverse a Number (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        int result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
