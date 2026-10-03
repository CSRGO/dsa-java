// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PowerOfTwo.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/power-of-two/
public class PowerOfTwoDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int n) {
        if (n == 0) {
            return true;
        }

        if (n < 0) {
            return false;
        }

        return (n & (n + 1)) == 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = sc.nextInt();

        boolean result = solve(n);
        System.out.println("Is Power of Two (Debug): " + result);
        sc.close();
    }
}
