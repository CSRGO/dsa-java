// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PermutationsOfString.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PermutationsOfStringTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void backtrack(char[] chars, boolean[] used, StringBuilder cur, List<String> res) {
        if (cur.length() == chars.length) {
            res.add(cur.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            cur.append(chars[i]);
            backtrack(chars, used, cur, res);
            cur.deleteCharAt(cur.length() - 1);
            used[i] = false;
        }
    }

    private static List<String> expected(String s) {
        List<String> list = new ArrayList<>();
        if (s == null || s.length() == 0) return list;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];
        backtrack(chars, used, new StringBuilder(), list);
        return list;
    }

    private static void runTestCase(int testNumber, String s) {
        List<String> expectedResult = expected(s);
        List<String> actualResult = PermutationsOfString.solve(s);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", size=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running PermutationsOfString tests...");

        runTestCase(1, "abc");
        runTestCase(2, "aab");
        runTestCase(3, "a");
        runTestCase(4, "ab");
        runTestCase(5, "aaa");
        runTestCase(6, "aba");
        runTestCase(7, "abcd");
        runTestCase(8, "aabb");
        runTestCase(9, "bac");
        runTestCase(10, "cba");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
