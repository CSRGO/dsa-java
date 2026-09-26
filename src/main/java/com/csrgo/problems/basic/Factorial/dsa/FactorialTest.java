// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.Factorial.dsa;

public class FactorialTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static long expected(int n) {
        long ans = 1L;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    private static void runTestCase(int testNumber, int n) {
        long expectedResult = expected(n);
        long actualResult = Factorial.solve(n);

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: n=" + n + ", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: n=" + n + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running Factorial tests...");

        runTestCase(1, 0);
        runTestCase(2, 1);
        runTestCase(3, 2);
        runTestCase(4, 3);
        runTestCase(5, 4);
        runTestCase(6, 5);
        runTestCase(7, 6);
        runTestCase(8, 7);
        runTestCase(9, 10);
        runTestCase(10, 12);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
