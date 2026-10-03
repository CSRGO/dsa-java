// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestWordInDictionary.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-word-in-dictionary/
public class LongestWordInDictionaryDebug {

    // TODO: debug this method to fix it
    public static String solve(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        String longest = "";

        for (int i = 0; i < words.length; i = i + 1) {
            String w = words[i];
            if (w.length() > longest.length()) {
                boolean valid = true;
                for (int k = 1; k < w.length(); k = k + 1) {
                    if (!set.contains(w.substring(0, k))) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    longest = w;
                }
            }
        }

        return longest;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Word in Dictionary (DEBUG) ====");
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
