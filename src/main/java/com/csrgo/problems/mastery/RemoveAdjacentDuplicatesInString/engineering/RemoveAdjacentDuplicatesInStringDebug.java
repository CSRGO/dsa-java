// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RemoveAdjacentDuplicatesInString.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-adjacent-duplicates-in-string/
public class RemoveAdjacentDuplicatesInStringDebug {

    // TODO: debug this method to fix it
    public static String solve(String s) {
        if (s == null || s.length() == 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i = i + 1) {
            char c = s.charAt(i);
            int len = sb.length();
            if (len > 1 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Remove Adjacent Duplicates in String (Debug) ====");
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
