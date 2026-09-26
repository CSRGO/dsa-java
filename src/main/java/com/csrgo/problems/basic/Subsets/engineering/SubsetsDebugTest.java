// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.Subsets.engineering;

import java.util.*;

public class SubsetsDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void backtrack(int start, int[] nums, List<Integer> cur, List<List<Integer>> res) {
        res.add(new ArrayList<>(cur));
        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            backtrack(i + 1, nums, cur, res);
            cur.remove(cur.size() - 1);
        }
    }

    private static List<List<Integer>> expected(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null) return res;
        backtrack(0, nums, new ArrayList<>(), res);
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

    private static void runTestCase(int testNumber, int[] nums) {
        List<List<Integer>> expectedResult = normalize(expected(nums));
        List<List<Integer>> actualResult;
        try {
            actualResult = normalize(SubsetsDebug.solve(nums));
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=" + Arrays.toString(nums) + ", count=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=" + Arrays.toString(nums) + ", expected=" + expectedResult.size() + ", actual=" + actualResult.size());
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running SubsetsDebug tests...");

        runTestCase(1, new int[]{1, 2, 3});
        runTestCase(2, new int[]{0});
        runTestCase(3, new int[]{1, 2});
        runTestCase(4, new int[]{});
        runTestCase(5, new int[]{4, 5, 6, 7});
        runTestCase(6, new int[]{-1, 1});
        runTestCase(7, new int[]{9});
        runTestCase(8, new int[]{10, 20, 30});
        runTestCase(9, new int[]{2, 3, 5});
        runTestCase(10, new int[]{1, 3, 5, 7});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
