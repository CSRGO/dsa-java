// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DivideTwoIntegers.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/divide-two-integers/
public class DivideTwoIntegers {

    public static int solve(int dividend, int divisor) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int result = solve(dividend, divisor);
        System.out.println("Quotient: " + result);
        sc.close();
    }
}
