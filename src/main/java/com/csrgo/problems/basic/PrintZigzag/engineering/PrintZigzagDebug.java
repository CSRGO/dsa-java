// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintZigzag.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/print-zigzag/
public class PrintZigzagDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        List<Integer> result = new ArrayList<>();
        zigzag(n, result);
        return result;
    }

    private static void zigzag(int n, List<Integer> result) {
        // Bug 1: Base case stops at n <= 1 instead of n == 0, omitting level 1 subtree leaf evaluations
        if (n <= 1) {
            return;
        }

        result.add(n);
        zigzag(n - 1, result);

        // Bug 2: Missing intermediate in-order result.add(n) invocation between branches

        // Bug 3: Decrements right child branch by 2 instead of 1
        zigzag(n - 2, result);
        result.add(n);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 2;
        List<Integer> result = solve(n);
        System.out.println("Result: " + result);
    }
}
