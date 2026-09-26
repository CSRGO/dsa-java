// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ValidAnagram.dsa;

import java.util.Objects;

public class ValidAnagramTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean expected(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    private static void runTestCase(int testNumber, String s, String t) {
        boolean expectedResult = expected(s, t);
        boolean actualResult = ValidAnagram.solve(s, t);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: s=\"" + s + "\", t=\"" + t + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: s=\"" + s + "\", t=\"" + t + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running ValidAnagram tests...");

        runTestCase(1, "anagram", "nagaram");
        runTestCase(2, "rat", "car");
        runTestCase(3, "a", "ab");
        runTestCase(4, "z", "z");
        runTestCase(5, "a", "b");
        runTestCase(6, "aa", "aa");
        runTestCase(7, "aab", "abb");
        runTestCase(8, "listen", "silent");
        runTestCase(9, "triangle", "integral");
        runTestCase(10, "apple", "pale");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
