// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.FirstIndex.engineering;

public class FirstIndexDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(int[] arr, int target) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    private static void runTestCase(int testNumber, int[] arr, int target) {
        int expectedResult = expected(arr, target);
        int actualResult;
        try {
            actualResult = FirstIndexDebug.solve(arr, target);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: target=" + target + ", index=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: target=" + target + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running FirstIndexDebug tests...");

        runTestCase(1, new int[]{10, 20, 30, 20, 50}, 20);
        runTestCase(2, new int[]{1, 2, 3, 4}, 10);
        runTestCase(3, new int[]{5, 5, 5, 5}, 5);
        runTestCase(4, new int[]{7}, 7);
        runTestCase(5, new int[]{7}, 8);
        runTestCase(6, new int[]{}, 5);
        runTestCase(7, new int[]{-10, -20, -30, -20}, -20);
        runTestCase(8, new int[]{100, 200, 300}, 300);
        runTestCase(9, new int[]{100, 200, 300}, 100);
        runTestCase(10, new int[]{1, 2, 3, 2, 1}, 2);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}
