// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ImplementTrie.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/implement-trie/
public class ImplementTrieDebug {

    // TODO: debug this method to fix it
    public static boolean[] solve(String[] operations, String[] words) {
        int queryCount = 0;
        for (int i = 0; i < operations.length; i = i + 1) {
            if (operations[i].equals("search") || operations[i].equals("startsWith")) {
                queryCount = queryCount + 1;
            }
        }

        boolean[] result = new boolean[queryCount];
        int resIdx = 0;
        Set<String> wordsSet = new HashSet<>();

        for (int i = 0; i < operations.length; i = i + 1) {
            String op = operations[i];
            String word = words[i];

            if (op.equals("insert")) {
                wordsSet.add(word);
            } else if (op.equals("search")) {
                result[resIdx] = wordsSet.contains(word);
                resIdx = resIdx + 1;
            } else if (op.equals("startsWith")) {
                result[resIdx] = wordsSet.contains(word);
                resIdx = resIdx + 1;
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Implement Trie (DEBUG) ====");
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
