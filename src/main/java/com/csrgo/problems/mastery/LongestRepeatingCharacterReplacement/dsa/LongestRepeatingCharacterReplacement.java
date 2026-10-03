// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestRepeatingCharacterReplacement.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {

    public static int solve(String s, int k) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Repeating Character Replacement ====");
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
