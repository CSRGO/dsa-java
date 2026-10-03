// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ImplementTrie.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/implement-trie/
public class ImplementTrie {

    public static boolean[] solve(String[] operations, String[] words) {
        // TODO: write your logic here
        return new boolean[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Implement Trie ====");
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        String[] operations = new String[n];
        String[] words = new String[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter operation " + (i + 1) + " (insert/search/startsWith): ");
            operations[i] = sc.next();
            System.out.print("Enter word for operation " + (i + 1) + ": ");
            words[i] = sc.next();
        }

        boolean[] result = solve(operations, words);

        System.out.println("------------------------");
        System.out.println("Query Results : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
