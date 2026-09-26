// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintIncreasing.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/print-increasing/
public class PrintIncreasingDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        List<Integer> result = new ArrayList<>();
        printIncreasing(n, result);
        return result;
    }

    private static void printIncreasing(int n, List<Integer> result) {
        // Bug 1: Base condition 'n < 0' instead of 'n <= 0', improperly including 0 in the list
        if (n < 0) {
            return;
        }

        // Bug 2: Appends element before recursive call (pre-order), generating descending sequence instead of ascending
        result.add(n);

        // Bug 3: Decrements step size by 2 instead of 1, skipping intermediate numbers
        printIncreasing(n - 2, result);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 5;
        List<Integer> result = solve(n);
        System.out.println("Result: " + result);
    }
}
