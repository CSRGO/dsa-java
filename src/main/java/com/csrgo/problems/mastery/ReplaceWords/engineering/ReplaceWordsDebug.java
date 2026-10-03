// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReplaceWords.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/replace-words/
public class ReplaceWordsDebug {

    // TODO: debug this method to fix it
    public static String solve(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();
        for (int i = 0; i < dictionary.size(); i = i + 1) {
            String word = dictionary.get(i);
            if (word.length() <= 1) {
                continue;
            }
            TrieNode curr = root;
            for (int j = 0; j < word.length(); j = j + 1) {
                int idx = word.charAt(j) - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode();
                }
                curr = curr.children[idx];
            }
            curr.isEnd = true;
        }

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i = i + 1) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(findRoot(root, words[i]));
        }

        return result.toString();
    }

    private static String findRoot(TrieNode root, String word) {
        TrieNode curr = root;
        StringBuilder prefix = new StringBuilder();
        String longestRoot = word;
        for (int i = 0; i < word.length(); i = i + 1) {
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                break;
            }
            curr = curr.children[idx];
            prefix.append(ch);
            if (curr.isEnd) {
                longestRoot = prefix.toString();
            }
        }
        return longestRoot;
    }

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Replace Words (DEBUG) ====");
        System.out.print("Enter number of roots in dictionary: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> dictionary = new ArrayList<>();
        System.out.println("Enter roots:");
        for (int i = 0; i < n; i = i + 1) {
            dictionary.add(sc.nextLine().trim());
        }
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String result = solve(dictionary, sentence);

        System.out.println("------------------------");
        System.out.println("Result : " + result);
        System.out.println("========================");

        sc.close();
    }
}
