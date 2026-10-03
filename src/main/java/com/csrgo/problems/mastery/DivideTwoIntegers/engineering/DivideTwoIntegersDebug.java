// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DivideTwoIntegers.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/divide-two-integers/
public class DivideTwoIntegersDebug {

    // TODO: debug this method to fix it
    public static int solve(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }

        boolean negative = (dividend < 0) && (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int quotient = 0;

        for (int i = 30; i > 0; i = i - 1) {
            if ((a >> i) >= b) {
                quotient = quotient + (1 << i);
                a = a - (b << i);
            }
        }

        if (negative) {
            return -quotient;
        }

        return quotient;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int result = solve(dividend, divisor);
        System.out.println("Quotient (Debug): " + result);
        sc.close();
    }
}
