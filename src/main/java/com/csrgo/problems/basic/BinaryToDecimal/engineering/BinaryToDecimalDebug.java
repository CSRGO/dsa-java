// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BinaryToDecimal.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/binary-to-decimal/
public class BinaryToDecimalDebug {

    // TODO: debug this method to fix it
    public static int solve(long n) {
        int decimal = 0;
        int weight = 1;

        while (n > 0) {
            long lastBit = n % 2;
            n = n / 10;

            decimal = decimal + (int) (lastBit * weight);
            weight = weight + 2;
        }

        return weight;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Binary to Decimal (Debug Mode) ====");
        System.out.print("Enter binary n: ");
        long n = sc.nextLong();
        
        int result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input   : " + n);
        System.out.println("Decimal : " + result);
        System.out.println("========================");
    }
}
