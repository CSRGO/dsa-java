// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FirstUniqueCharacterInString.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/first-unique-character-in-string/
public class FirstUniqueCharacterInStringDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i = i + 1) {
            int idx = s.charAt(i) - 'a';
            freq[idx] = freq[idx] + 1;
        }

        for (int i = 1; i < s.length(); i = i + 1) {
            int idx = s.charAt(i) - 'a';
            if (freq[idx] <= 1) {
                return i;
            }
        }

        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== First Unique Character in String (DEBUG) ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        int result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input String        : \"" + s + "\"");
        System.out.println("First Unique Index  : " + result);
        if (result != -1 && result < s.length()) {
            System.out.println("First Unique Char   : '" + s.charAt(result) + "'");
        }
        System.out.println("========================");

        sc.close();
    }
}
