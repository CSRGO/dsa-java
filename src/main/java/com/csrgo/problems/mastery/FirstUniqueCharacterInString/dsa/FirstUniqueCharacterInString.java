// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FirstUniqueCharacterInString.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/first-unique-character-in-string/
public class FirstUniqueCharacterInString {

    public static int solve(String s) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== First Unique Character in String ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        int result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input String        : \"" + s + "\"");
        System.out.println("First Unique Index  : " + result);
        if (result != -1) {
            System.out.println("First Unique Char   : '" + s.charAt(result) + "'");
        }
        System.out.println("========================");

        sc.close();
    }
}
