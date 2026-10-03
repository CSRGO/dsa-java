// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SumOfTwoIntegers.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sum-of-two-integers/
public class SumOfTwoIntegersDebug {

    // TODO: debug this method to fix it
    public static int solve(int a, int b) {
        while (b > 0) {
            int carry = (a & b) >> 1;
            a = a | b;
            b = carry;
        }

        return a;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        int result = solve(a, b);
        System.out.println("Sum (Debug): " + result);
        sc.close();
    }
}
