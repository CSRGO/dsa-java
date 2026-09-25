// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseMultiplication.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/any-base-multiplication/
public class AnyBaseMultiplicationDebug {

    // TODO: debug this method to fix it
    public static long solve(long n1, long n2, int b) {
        long ans = 0;
        long power = 1;

        while (n2 > 0) {
            long d2 = n2 % 10;
            n2 = n2 / 10;

            long singleProd = 0;
            long carry = 0;
            long p = 1;
            long temp = n1;

            while (temp > 0) {
                long d1 = temp % 10;
                temp = temp / 10;

                long prod = (d1 * d2) + carry;
                carry = prod / 10;
                long rem = prod % b;

                singleProd = singleProd + (rem * p);
                p = p * 10;
            }

            ans = ans + singleProd;
            power = power * 10;
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Any Base Multiplication (DEBUG) ====");
        System.out.print("Enter first number n1: ");
        long n1 = sc.nextLong();
        System.out.print("Enter second number n2: ");
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
