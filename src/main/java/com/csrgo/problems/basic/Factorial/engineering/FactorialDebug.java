// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.Factorial.engineering;

// Problem Link: https://dsa.csrgo.com/problems/factorial/
public class FactorialDebug {

    // TODO: debug this method to fix it
    public static long solve(int n) {
        // Bug 1: Base case returns 0 instead of 1 for n <= 0, causing entire product chain to collapse to 0
        if (n <= 0) {
            return 0L;
        }
        if (n == 1) {
            return 1L;
        }

        // Bug 2: Decrements by 2 instead of 1, computing double factorial instead of single factorial
        // Bug 3: Casts to int before multiplication, leading to 32-bit signed overflow on larger values
        int partial = (int) solve(n - 2);
        return (long) (n * partial);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 5;
        long result = solve(n);
        System.out.println("Result: " + result);
    }
}
