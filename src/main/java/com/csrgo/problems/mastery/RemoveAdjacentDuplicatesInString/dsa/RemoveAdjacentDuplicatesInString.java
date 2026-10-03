// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RemoveAdjacentDuplicatesInString.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-adjacent-duplicates-in-string/
public class RemoveAdjacentDuplicatesInString {

    public static String solve(String s) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Remove Adjacent Duplicates in String ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        String result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input s : " + s);
        System.out.println("Result  : " + result);
        System.out.println("========================");

        sc.close();
    }
}
