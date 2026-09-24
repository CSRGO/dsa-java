// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.XStarPattern.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/x-star-pattern/
public class XStarPattern {

    public static String solve(int n) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== X Star Pattern ====");
        System.out.print("Enter odd number n: ");
        int n = sc.nextInt();
        
        String result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output :");
        System.out.print(result);
        System.out.println("========================");
    }
}
