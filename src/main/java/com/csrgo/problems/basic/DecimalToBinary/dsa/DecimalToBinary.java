// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DecimalToBinary.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decimal-to-binary/
public class DecimalToBinary {

    public static long solve(int n) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decimal to Binary ====");
        System.out.print("Enter decimal n: ");
        int n = sc.nextInt();
        
        long result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Binary : " + result);
        System.out.println("========================");
    }
}
