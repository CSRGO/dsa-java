// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestRepeatingCharacterReplacement.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacementDebug {

    // TODO: debug this method to fix it
    public static int solve(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right = right + 1) {
            int idx = s.charAt(right) - 'A';
            count[idx] = count[idx] + 1;
            maxFreq = Math.max(maxFreq, count[idx]);

            while ((right - left + 1) - maxFreq >= k) {
                left = left + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxFreq;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Repeating Character Replacement (DEBUG) ====");
        System.out.print("Enter string s (uppercase letters): ");
        String s = sc.nextLine();
        System.out.print("Enter maximum operations k: ");
        int k = sc.nextInt();

        int result = solve(s, k);

        System.out.println("------------------------");
        System.out.println("Input String   : \"" + s + "\"");
        System.out.println("Max Changes k  : " + k);
        System.out.println("Longest Length : " + result);
        System.out.println("========================");

        sc.close();
    }
}
