// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RepeatedSubstringPattern.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/repeated-substring-pattern/
public class RepeatedSubstringPattern {

    public static boolean solve(String s) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Repeated Substring Pattern ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        boolean result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input String           : \"" + s + "\"");
        System.out.println("Has Repeating Pattern  : " + result);
        System.out.println("========================");

        sc.close();
    }
}
