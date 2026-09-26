// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PowerLog.dsa;

public class PowerLogTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static long expected(int x, int n) {
        long ans = 1L;
        for (int i = 0; i < n; i++) {
            ans *= x;
        }
        return ans;
    }

    private static void runTestCase(int testNumber, int x, int n) {
        long expectedResult = expected(x, n);
        long actualResult = PowerLog.solve(x, n);

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: x=" + x + ", n=" + n + ", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: x=" + x + ", n=" + n + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running PowerLog tests...");

        runTestCase(1, 2, 5);
        runTestCase(2, 3, 4);
        runTestCase(3, 5, 0);
        runTestCase(4, 2, 16);
        runTestCase(5, -2, 3);
        runTestCase(6, -2, 4);
        runTestCase(7, 3, 5);
        runTestCase(8, 10, 6);
        runTestCase(9, 1, 25);
        runTestCase(10, 0, 7);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
