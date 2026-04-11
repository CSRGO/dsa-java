// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DecimalToBinary.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decimal-to-binary/
public class DecimalToBinaryDebug {

    // TODO: debug this method to fix it
    public static long solve(int n) {
        if (n == 0) {
            return 0;
        }

        long binary = 0;
        long power = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            binary = binary + rem * power;
            power = power * 10;
        }

        return binary;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decimal to Binary (Debug Mode) ====");
        System.out.print("Enter decimal n: ");
        int n = sc.nextInt();
        
        long result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Binary : " + result);
        System.out.println("========================");
    }
}
