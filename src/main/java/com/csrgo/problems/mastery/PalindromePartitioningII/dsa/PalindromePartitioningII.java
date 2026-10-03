// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PalindromePartitioningII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/palindrome-partitioning-ii/
public class PalindromePartitioningII {

    public static int solve(String s) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Palindrome Partitioning II ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine().trim();

        int cuts = solve(s);
        System.out.println("Minimum Cuts: " + cuts);
    }
}
