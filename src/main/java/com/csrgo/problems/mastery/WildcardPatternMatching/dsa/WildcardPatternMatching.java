// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WildcardPatternMatching.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/wildcard-pattern-matching/
public class WildcardPatternMatching {

    public static boolean solve(String s, String p) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Wildcard Pattern Matching ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter pattern p: ");
        String p = sc.nextLine();

        boolean result = solve(s, p);

        System.out.println("------------------------");
        System.out.println("String s : \"" + s + "\"");
        System.out.println("Pattern p: \"" + p + "\"");
        System.out.println("Matches  : " + result);
        System.out.println("========================");

        sc.close();
    }
}
