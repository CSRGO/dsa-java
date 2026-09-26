// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PowerLog.engineering;

// Problem Link: https://dsa.csrgo.com/problems/power-log/
public class PowerLogDebug {

    // TODO: debug this method to fix it
    public static long solve(int x, int n) {
        // Bug 1: Base case returns x instead of 1L when exponent n == 0
        if (n == 0) {
            return (long) x;
        }

        long half = solve(x, n / 2);

        // Bug 2: Adds half powers instead of multiplying them (half + half instead of half * half)
        long halfSq = half + half;

        // Bug 3: Fails to multiply by extra factor of x when n is odd
        if (n % 2 != 0) {
            return halfSq;
        }

        return halfSq;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = solve(x, n);
        System.out.println("Result: " + result);
    }
}
