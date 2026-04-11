// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InverseOfANumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/inverse-of-a-number/
public class InverseOfANumberDebug {

    // TODO: debug this method to fix it
    public static int solve(int n) {
        int invertedResult = 0;
        int originalPos = 0;

        while (n > 0) {
            int originalDigit = n % 10;
            
            invertedResult += originalPos * (int) Math.pow(10, originalDigit);
            
            n = n % 10;
            originalPos++;
        }

        return invertedResult;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Inverse of a Number (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        int result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
