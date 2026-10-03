// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordLadderII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/word-ladder-ii/
public class WordLadderIIDebug {

    // TODO: debug this method to fix it
    public static List<List<String>> solve(String beginWord, String endWord, String[] wordList) {
        List<List<String>> results = new ArrayList<>();
        if (wordList == null || wordList.length <= 1) {
            return results;
        }

        Set<String> dict = new HashSet<>();
        Collections.addAll(dict, wordList);

        if (!dict.contains(endWord)) {
            return results;
        }

        Map<String, Integer> dist = new HashMap<>();
        Map<String, List<String>> adj = new HashMap<>();

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);
        dist.put(beginWord, 0);

        boolean found = false;

        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            for (int s = 0; s < size; s = s + 1) {
                String curr = queue.poll();
                int currentDist = dist.get(curr);
                adj.putIfAbsent(curr, new ArrayList<>());

                char[] chars = curr.toCharArray();
                for (int i = 0; i < chars.length; i = i + 1) {
                    char orig = chars[i];
                    for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
                        if (c == orig) {
                            continue;
                        }
                        chars[i] = c;
                        String next = new String(chars);

                        if (dict.contains(next)) {
                            if (!dist.containsKey(next)) {
                                dist.put(next, currentDist + 1);
                                queue.offer(next);
                                adj.get(curr).add(next);
                                if (next.equals(endWord)) {
                                    found = true;
                                }
                            } else if (dist.get(next) == currentDist + 1) {
                                adj.get(curr).add(next);
                            }
                        }
                    }
                    chars[i] = orig;
                }
            }
        }

        if (!dist.containsKey(endWord)) {
            return results;
        }

        List<String> path = new ArrayList<>();
        dfs(beginWord, endWord, adj, dist, path, results);

        return results;
    }

    private static void dfs(String curr, String endWord, Map<String, List<String>> adj, Map<String, Integer> dist, List<String> path, List<List<String>> results) {
        if (curr.equals(endWord)) {
            results.add(new ArrayList<>(path));
            return;
        }

        List<String> neighbors = adj.get(curr);
        if (neighbors == null) {
            return;
        }

        for (int i = 0; i < neighbors.size(); i = i + 1) {
            String next = neighbors.get(i);
            if (dist.get(next) == dist.get(curr)) {
                path.add(next);
                dfs(next, endWord, adj, dist, path, results);
                path.remove(path.size() - 1);
            }
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Word Ladder II (Debug) ====");
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
