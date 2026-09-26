// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.TowerOfHanoi.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/tower-of-hanoi/
public class TowerOfHanoiDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(int n, int src, int dest, int helper) {
        List<String> result = new ArrayList<>();
        toh(n, src, dest, helper, result);
        return result;
    }

    private static void toh(int n, int src, int dest, int helper, List<String> result) {
        // Bug 1: Base case prematurely exits on n <= 1 without recording disk 1 move
        if (n <= 1) {
            return;
        }

        // Bug 2: Fails to swap helper and dest in the first recursive call
        toh(n - 1, src, dest, helper, result);

        // Bug 3: Inverts source and destination arrow order in move log string
        result.add(n + "[" + dest + " -> " + src + "]");

        toh(n - 1, helper, dest, src, result);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 3;
        List<String> result = solve(n, 10, 11, 12);
        System.out.println("Result: " + result);
    }
}
