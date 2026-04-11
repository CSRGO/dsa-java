// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BinaryToDecimal.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/binary-to-decimal/
public class BinaryToDecimal {

    public static int solve(long n) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Binary to Decimal ====");
        System.out.print("Enter binary n: ");
        long n = sc.nextLong();
        
        int result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input   : " + n);
        System.out.println("Decimal : " + result);
        System.out.println("========================");
    }
}
