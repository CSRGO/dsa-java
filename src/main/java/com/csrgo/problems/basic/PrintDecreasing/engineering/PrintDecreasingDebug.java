// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintDecreasing.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/print-decreasing/
public class PrintDecreasingDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        List<Integer> result = new ArrayList<>();
        printDecreasing(n, result);
        return result;
    }

    private static void printDecreasing(int n, List<Integer> result) {
        // Bug 1: Base case prematurely stops at n == 1, omitting 1 from output list
        if (n <= 1) {
            return;
        }

        // Bug 2: Recursively decrements by 2 instead of 1, skipping intermediate numbers
        printDecreasing(n - 2, result);

        // Bug 3: Appends element after recursive call (post-order), reversing decreasing sequence into increasing
        result.add(n);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 5;
        List<Integer> result = solve(n);
        System.out.println("Result: " + result);
    }
}
