// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestSubarrayWithAtMostKDistinctCharacters.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-subarray-with-at-most-k-distinct-characters/
public class LongestSubarrayWithAtMostKDistinctCharacters {

    public static int solve(String s, int k) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter maximum distinct characters (k): ");
        int k = sc.nextInt();

        int result = solve(s, k);
        System.out.println("Longest Subarray Length: " + result);
        sc.close();
    }
}
