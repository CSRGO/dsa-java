// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PowerLinear.engineering;

// Problem Link: https://dsa.csrgo.com/problems/power-linear/
public class PowerLinearDebug {

    // TODO: debug this method to fix it
    public static long solve(int x, int n) {
        // Bug 1: Base case returns 0 instead of 1 for n == 0, causing entire multiplication cascade to return 0
        if (n == 0) {
            return 0L;
        }

        // Bug 2: Adds base x to recursive result instead of multiplying
        // Bug 3: Decrements base x instead of exponent n in recursive call
        return (long) x + solve(x - 1, n);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = solve(x, n);
        System.out.println("Result: " + result);
    }
}
