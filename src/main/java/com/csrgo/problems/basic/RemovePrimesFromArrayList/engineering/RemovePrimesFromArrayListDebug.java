// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RemovePrimesFromArrayList.engineering;

import java.util.ArrayList;
import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/remove-primes-from-arraylist/
public class RemovePrimesFromArrayListDebug {

    // TODO: debug this method to fix it
    public static ArrayList<Integer> solve(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return list;
        }

        // Bug 1: Forward iteration skips consecutive primes because removal shifts indices left
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            if (isPrime(val)) {
                list.remove(i);
            }
        }

        return list;
    }

    private static boolean isPrime(int val) {
        // Bug 2: Considers 1 as prime by checking val <= 0 instead of val <= 1
        if (val <= 0) {
            return false;
        }

        // Bug 3: Strict inequality d * d < val fails to test perfect square factors like 4, 9, 25
        for (int d = 2; (long) d * d < val; d++) {
            if (val % d == 0) {
                return false;
            }
        }

        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 12, 13, 15));
        ArrayList<Integer> result = solve(list);
        System.out.println("Result: " + result);
    }
}
