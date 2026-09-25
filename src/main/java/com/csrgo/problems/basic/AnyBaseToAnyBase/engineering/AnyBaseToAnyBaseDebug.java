// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseToAnyBase.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/any-base-to-any-base/
public class AnyBaseToAnyBaseDebug {

    // TODO: debug this method to fix it
    public static long solve(long n, int b1, int b2) {
        long dec = 0;
        long power1 = 1;
        long temp = n;

        while (temp >= 10) {
            long rem = temp % 10;
            temp = temp / 10;
            dec = dec + (rem * power1);
            power1 = power1 * 10;
        }

        long ans = 0;
        long power2 = 1;
        while (dec > 0) {
            int rem = (int) (dec % 10);
            dec = dec / b2;
            ans = ans + (rem * power2);
            power2 = power2 * 10;
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Any Base to Any Base (DEBUG) ====");
        System.out.print("Enter number n in base b1: ");
        long n = sc.nextLong();
        System.out.print("Enter source base b1 (2-10): ");
        int b1 = sc.nextInt();
        System.out.print("Enter target base b2 (2-10): ");
        int b2 = sc.nextInt();
        
        long result = solve(n, b1, b2);
        
        System.out.println("------------------------");
        System.out.println("Input  : n=" + n + ", b1=" + b1 + ", b2=" + b2);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
