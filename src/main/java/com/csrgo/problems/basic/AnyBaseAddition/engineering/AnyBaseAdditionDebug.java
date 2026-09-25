// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseAddition.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/any-base-addition/
public class AnyBaseAdditionDebug {

    // TODO: debug this method to fix it
    public static long solve(long n1, long n2, int b) {
        long ans = 0;
        long carry = 0;
        long power = 1;

        while (n1 > 0 || n2 > 0) {
            long d1 = n1 % 10;
            long d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            long sum = d1 + d2 + carry;
            carry = sum / 10;
            long rem = sum % b;

            ans = ans + (rem * power);
            power = power * b;
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Any Base Addition (DEBUG) ====");
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
