// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.GroupAnagrams.dsa;

import java.util.*;

public class GroupAnagramsTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<List<String>> expected(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = new String(ca);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private static List<List<String>> normalize(List<List<String>> list) {
        if (list == null) return new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        for (List<String> inner : list) {
            List<String> copy = new ArrayList<>(inner);
            Collections.sort(copy);
            res.add(copy);
        }
        res.sort((a, b) -> {
            String s1 = a.isEmpty() ? "" : a.get(0);
            String s2 = b.isEmpty() ? "" : b.get(0);
            return s1.compareTo(s2);
        });
        return res;
    }

    private static void runTestCase(int testNumber, String[] strs) {
        List<List<String>> expectedResult = normalize(expected(strs));
        List<List<String>> actualResult = normalize(GroupAnagrams.solve(strs));

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=" + Arrays.toString(strs) + ", groups=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running GroupAnagrams tests...");

        runTestCase(1, new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        runTestCase(2, new String[]{""});
        runTestCase(3, new String[]{"a"});
        runTestCase(4, new String[]{"a", "b", "c"});
        runTestCase(5, new String[]{"ab", "ba", "abc", "cba", "bca"});
        runTestCase(6, new String[]{"listen", "silent", "enlist"});
        runTestCase(7, new String[]{"rat", "tar", "art"});
        runTestCase(8, new String[]{"hello", "world"});
        runTestCase(9, new String[]{"aa", "aa", "aa"});
        runTestCase(10, new String[]{"stop", "pots", "tops", "opts", "post"});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
