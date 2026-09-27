// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AlienDictionary.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/alien-dictionary/
public class AlienDictionary {

    public static String solve(String[] words) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Alien Dictionary ====");
        System.out.print("Enter number of words: ");
        int n = scanner.nextInt();
        String[] words = new String[n];
        System.out.println("Enter " + n + " words (one per line or space-separated):");
        for (int i = 0; i < n; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words[i] = scanner.next();
        }

        String result = solve(words);

        System.out.println("------------------------");
        System.out.println("Input Words : " + Arrays.toString(words));
        System.out.println("Alien Order : " + (result.isEmpty() ? "<empty - invalid order / cycle>" : result));
        System.out.println("========================");

        scanner.close();
    }
}
