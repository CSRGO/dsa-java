// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DigitFrequency.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/digit-frequency/
public class DigitFrequencyDebug {

    // TODO: debug this method to fix it
    public static int solve(long n, int d) {
        if (n == 0) {
            return 0;
        }

        long temp = Math.abs(n);
        int count = 0;
        while (temp >= 10) {
            int rem = (int) (temp % 10);
            if (rem == d) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Digit Frequency (DEBUG) ====");
        System.out.print("Enter number n: ");
        long n = sc.nextLong();
        System.out.print("Enter digit d (0-9): ");
        int d = sc.nextInt();
        
        int result = solve(n, d);
        
        System.out.println("------------------------");
        System.out.println("Input  : n=" + n + ", d=" + d);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
