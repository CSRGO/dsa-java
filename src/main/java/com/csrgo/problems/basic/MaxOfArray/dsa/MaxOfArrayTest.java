// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MaxOfArray.dsa;

public class MaxOfArrayTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (v > max) max = v;
        }
        return max;
    }

    private static void runTestCase(int testNumber, int[] arr) {
        int expectedResult = expected(arr);
        int actualResult = MaxOfArray.solve(arr);

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: max=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running MaxOfArray tests...");

        runTestCase(1, new int[]{10, 30, 20, 50, 40});
        runTestCase(2, new int[]{-15, -3, -25, -7});
        runTestCase(3, new int[]{42});
        runTestCase(4, new int[]{1, 2, 3, 4, 5});
        runTestCase(5, new int[]{5, 4, 3, 2, 1});
        runTestCase(6, new int[]{0, 0, 0, 0});
        runTestCase(7, new int[]{-100, 0, 100});
        runTestCase(8, new int[]{99, 100, 98});
        runTestCase(9, new int[]{-1, -2, -3});
        runTestCase(10, new int[]{12, 45, 67, 23, 89, 34});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
