// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PythagoreanTriplet.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/pythagorean-triplet/
public class PythagoreanTriplet {

    public static boolean solve(int a, int b, int c) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Pythagorean Triplet ====");
        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();
        
        boolean result = solve(a, b, c);
        
        System.out.println("------------------------");
        System.out.println("Sides  : " + a + ", " + b + ", " + c);
        System.out.println("Result : " + result);
        System.out.println("========================");
    }
}
