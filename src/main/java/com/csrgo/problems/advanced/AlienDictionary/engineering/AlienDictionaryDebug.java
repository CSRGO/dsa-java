// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AlienDictionary.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/alien-dictionary/
public class AlienDictionaryDebug {

    // TODO: debug this method to fix it
    public static String solve(String[] words) {
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                graph.putIfAbsent(ch, new HashSet<>());
                inDegree.putIfAbsent(ch, 0);
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];

            int minLen = Math.min(w1.length(), w2.length());
            for (int j = 0; j < minLen; j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if (c1 != c2) {
                    if (!graph.get(c2).contains(c1)) {
                        graph.get(c2).add(c1);
                        inDegree.put(c1, inDegree.get(c1) + 1);
                    }
                    break;
                }
            }
        }

        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                pq.add(entry.getKey());
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char curr = pq.poll();
            sb.append(curr);

            for (char neighbor : graph.get(curr)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    pq.add(neighbor);
                }
            }
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Alien Dictionary (DEBUG) ====");
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
