// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseToDecimal.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/any-base-to-decimal/
public class AnyBaseToDecimalDebug {

    // TODO: debug this method to fix it
    public static int solve(long n, int b) {
        long ans = 0;
        long power = 1;

        while (n >= 10) {
            long rem = n % b;
            n = n / 10;
            ans = ans + (rem * power);
            power = power * 10;
        }

        return (int) ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Any Base to Decimal (DEBUG) ====");
        System.out.print("Enter number n in base b: ");
        long n = sc.nextLong();
        System.out.print("Enter source base b (2-10): ");
        int b = sc.nextInt();
        
        int result = solve(n, b);
        
        System.out.println("------------------------");
        System.out.println("Input   : n=" + n + ", b=" + b);
        System.out.println("Decimal : " + result);
        System.out.println("========================");
    }
}
