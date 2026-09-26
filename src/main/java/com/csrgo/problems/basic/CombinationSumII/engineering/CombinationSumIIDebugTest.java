// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.CombinationSumII.engineering;

import java.util.*;

public class CombinationSumIIDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void backtrack(int start, int[] cand, int remain, List<Integer> cur, List<List<Integer>> res) {
        if (remain == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < cand.length; i++) {
            if (cand[i] > remain) break;
            if (i > start && cand[i] == cand[i - 1]) continue;
            cur.add(cand[i]);
            backtrack(i + 1, cand, remain - cand[i], cur, res);
            cur.remove(cur.size() - 1);
        }
    }

    private static List<List<Integer>> expected(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null) return res;
        int[] copy = candidates.clone();
        Arrays.sort(copy);
        backtrack(0, copy, target, new ArrayList<>(), res);
        return res;
    }

    private static List<List<Integer>> normalize(List<List<Integer>> input) {
        if (input == null) return new ArrayList<>();
        List<List<Integer>> copy = new ArrayList<>();
        for (List<Integer> inner : input) {
            List<Integer> sortedInner = new ArrayList<>(inner);
            Collections.sort(sortedInner);
            copy.add(sortedInner);
        }
        copy.sort((a, b) -> {
            int s = Integer.compare(a.size(), b.size());
            if (s != 0) return s;
            for (int i = 0; i < a.size(); i++) {
                int c = Integer.compare(a.get(i), b.get(i));
                if (c != 0) return c;
            }
            return 0;
        });
        return copy;
    }

    private static void runTestCase(int testNumber, int[] candidates, int target) {
        List<List<Integer>> expectedResult = normalize(expected(candidates, target));
        List<List<Integer>> actualResult;
        try {
            actualResult = normalize(CombinationSumIIDebug.solve(candidates, target));
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: target=" + target + ", count=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: target=" + target + ", expected=" + expectedResult.size() + ", actual=" + actualResult.size());
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running CombinationSumIIDebug tests...");

        runTestCase(1, new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        runTestCase(2, new int[]{2, 5, 2, 1, 2}, 5);
        runTestCase(3, new int[]{1, 1, 1, 1}, 2);
        runTestCase(4, new int[]{1, 2, 3}, 7);
        runTestCase(5, new int[]{1, 2, 3}, 3);
        runTestCase(6, new int[]{2, 2, 2}, 2);
        runTestCase(7, new int[]{2, 2, 2}, 4);
        runTestCase(8, new int[]{3, 1, 3, 5, 1}, 8);
        runTestCase(9, new int[]{1}, 1);
        runTestCase(10, new int[]{1, 1, 1, 2, 2}, 4);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
