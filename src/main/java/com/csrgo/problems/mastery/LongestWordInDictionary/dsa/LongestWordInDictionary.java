// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestWordInDictionary.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-word-in-dictionary/
public class LongestWordInDictionary {

    public static String solve(String[] words) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Word in Dictionary ====");
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = sc.next();
        }

        String result = solve(words);

        System.out.println("------------------------");
        System.out.println("Longest Word : " + result);
        System.out.println("========================");

        sc.close();
    }
}
