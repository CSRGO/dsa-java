// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DuplicateBrackets.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/duplicate-brackets/
public class DuplicateBrackets {

    public static boolean solve(String s) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Duplicate Brackets ====");
        System.out.print("Enter expression string: ");
        String s = sc.nextLine();

        boolean result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input  : " + s);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
