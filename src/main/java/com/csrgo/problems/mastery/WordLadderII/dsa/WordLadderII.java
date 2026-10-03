// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordLadderII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/word-ladder-ii/
public class WordLadderII {

    public static List<List<String>> solve(String beginWord, String endWord, String[] wordList) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Word Ladder II ====");
        System.out.print("Enter begin word: ");
        String beginWord = sc.nextLine();

        System.out.print("Enter end word: ");
        String endWord = sc.nextLine();

        System.out.print("Enter number of dictionary words n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] wordList = new String[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter word " + (i + 1) + ": ");
            wordList[i] = sc.nextLine();
        }

        List<List<String>> result = solve(beginWord, endWord, wordList);

        System.out.println("------------------------");
        System.out.println("Begin Word : " + beginWord);
        System.out.println("End Word   : " + endWord);
        System.out.println("Word List  : " + Arrays.toString(wordList));
        System.out.println("Paths      : " + result);
        System.out.println("========================");

        sc.close();
    }
}
