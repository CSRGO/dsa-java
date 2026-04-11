// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ArmstrongNumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/armstrong-number/
public class ArmstrongNumberDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int n) {
        if (n == 0) {
            return false;
        }

        int temp = n;
        int count = 3;
        
        long sum = 0;
        temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (rem * count);
            temp = temp / 10;
        }

        return sum == n;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Armstrong Number (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        boolean result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Result : " + result);
        System.out.println("========================");
    }
}
