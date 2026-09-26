// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PalindromePartitioning.engineering;

import java.util.*;

public class PalindromePartitioningDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    private static void backtrack(int start, String s, List<String> cur, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPal(s, start, i)) {
                cur.add(s.substring(start, i + 1));
                backtrack(i + 1, s, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }

    private static List<List<String>> expected(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null || s.length() == 0) return res;
        backtrack(0, s, new ArrayList<>(), res);
        return res;
    }

    private static List<List<String>> normalize(List<List<String>> input) {
        if (input == null) return new ArrayList<>();
        List<List<String>> copy = new ArrayList<>();
        for (List<String> inner : input) {
            copy.add(new ArrayList<>(inner));
        }
        copy.sort((a, b) -> {
            int s = Integer.compare(a.size(), b.size());
            if (s != 0) return s;
            for (int i = 0; i < a.size(); i++) {
                int c = a.get(i).compareTo(b.get(i));
                if (c != 0) return c;
            }
            return 0;
        });
        return copy;
    }

    private static void runTestCase(int testNumber, String s) {
        List<List<String>> expectedResult = normalize(expected(s));
        List<List<String>> actualResult;
        try {
            actualResult = normalize(PalindromePartitioningDebug.solve(s));
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", count=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=" + expectedResult.size() + ", actual=" + actualResult.size());
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running PalindromePartitioningDebug tests...");

        runTestCase(1, "aab");
        runTestCase(2, "a");
        runTestCase(3, "ab");
        runTestCase(4, "aba");
        runTestCase(5, "racecar");
        runTestCase(6, "efe");
        runTestCase(7, "bb");
        runTestCase(8, "cdd");
        runTestCase(9, "");
        runTestCase(10, "abba");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
