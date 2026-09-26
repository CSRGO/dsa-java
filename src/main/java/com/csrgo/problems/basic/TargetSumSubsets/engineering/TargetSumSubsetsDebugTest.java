// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.TargetSumSubsets.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TargetSumSubsetsDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void helper(int[] arr, int idx, int sum, int tar, List<Integer> cur, List<List<Integer>> res) {
        if (sum > tar) return;
        if (idx == arr.length) {
            if (sum == tar) res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[idx]);
        helper(arr, idx + 1, sum + arr[idx], tar, cur, res);
        cur.remove(cur.size() - 1);
        helper(arr, idx + 1, sum, tar, cur, res);
    }

    private static List<List<Integer>> expected(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr == null || arr.length == 0) return res;
        helper(arr, 0, 0, target, new ArrayList<>(), res);
        return res;
    }

    private static void runTestCase(int testNumber, int[] arr, int target) {
        List<List<Integer>> expectedResult = expected(arr, target);
        List<List<Integer>> actualResult;
        try {
            actualResult = TargetSumSubsetsDebug.solve(arr, target);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: target=" + target + ", count=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: target=" + target + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running TargetSumSubsetsDebug tests...");

        runTestCase(1, new int[]{10, 20, 30, 40, 50}, 60);
        runTestCase(2, new int[]{1, 2, 3}, 7);
        runTestCase(3, new int[]{1, 2, 3}, 3);
        runTestCase(4, new int[]{5}, 5);
        runTestCase(5, new int[]{5}, 10);
        runTestCase(6, new int[]{2, 4, 6, 8}, 10);
        runTestCase(7, new int[]{1, 1, 1}, 2);
        runTestCase(8, new int[]{10, 20, 30}, 30);
        runTestCase(9, new int[]{3, 5, 7, 2}, 10);
        runTestCase(10, new int[]{15, 25, 35}, 60);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
