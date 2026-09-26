// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintDecreasing.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintDecreasingTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<Integer> expected(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            res.add(i);
        }
        return res;
    }

    private static void runTestCase(int testNumber, int n) {
        List<Integer> expectedResult = expected(n);
        List<Integer> actualResult = PrintDecreasing.solve(n);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: n=" + n + ", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: n=" + n + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running PrintDecreasing tests...");

        runTestCase(1, 5);
        runTestCase(2, 1);
        runTestCase(3, 2);
        runTestCase(4, 3);
        runTestCase(5, 4);
        runTestCase(6, 6);
        runTestCase(7, 7);
        runTestCase(8, 8);
        runTestCase(9, 9);
        runTestCase(10, 10);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
