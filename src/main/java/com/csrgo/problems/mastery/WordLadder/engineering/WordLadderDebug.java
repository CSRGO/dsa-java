// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordLadder.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/word-ladder/
public class WordLadderDebug {

    // TODO: debug this method to fix it
    public static int solve(String beginWord, String endWord, String[] wordList) {
        if (wordList == null || wordList.length <= 1) {
            return 0;
        }

        Set<String> dict = new HashSet<>();
        Collections.addAll(dict, wordList);

        if (!dict.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);
        dict.remove(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s = s + 1) {
                String curr = queue.poll();
                char[] chars = curr.toCharArray();

                for (int i = 0; i < chars.length; i = i + 1) {
                    char orig = chars[i];
                    for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
                        if (c == orig) {
                            continue;
                        }
                        chars[i] = c;
                        String nextWord = new String(chars);

                        if (nextWord.equals(endWord)) {
                            return level;
                        }

                        if (dict.contains(nextWord)) {
                            queue.offer(nextWord);
                            dict.remove(nextWord);
                        }
                    }
                    chars[i] = orig;
                }
            }
            level = level + 1;
        }

        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Word Ladder (Debug) ====");
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

        int result = solve(beginWord, endWord, wordList);

        System.out.println("------------------------");
        System.out.println("Begin Word : " + beginWord);
        System.out.println("End Word   : " + endWord);
        System.out.println("Word List  : " + Arrays.toString(wordList));
        System.out.println("Shortest Ladder Length : " + result);
        System.out.println("========================");

        sc.close();
    }
}
