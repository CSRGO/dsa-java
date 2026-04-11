// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DigitsOfANumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/digits-of-a-number/
public class DigitsOfANumberDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        List<Integer> digits = new ArrayList<>();
        if (n == 0) {
            return digits;
        }

        while (n > 10) {
            digits.add(n % 10);
            n = n / 10;
        }

        return digits;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Digits of a Number (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        List<Integer> result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
