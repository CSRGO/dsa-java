// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HighestFrequencyCharacter.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/highest-frequency-character/
public class HighestFrequencyCharacterDebug {

    // TODO: fix the bugs in this method
    public static char solve(String str) {
        if (str == null || str.length() <= 1) {
            return '0';
        }

        Map<Character, Integer> map = new HashMap<>();
        char maxChar = str.charAt(0);
        int maxFreq = 0;

        for (int i = 0; i < str.length() - 1; i = i + 1) {
            char ch = str.charAt(i);
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
            if (count >= maxFreq) {
                maxFreq = count;
                maxChar = ch;
            }
        }

        return maxChar;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Highest Frequency Character (Debug) ====");
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char result = solve(str);

        System.out.println("------------------------");
        System.out.println("Input String      : " + str);
        System.out.println("Highest Frequency : " + result);
        System.out.println("========================");

        sc.close();
    }
}
