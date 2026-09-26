// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintZigzag.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintZigzagTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static void generateExpected(int n, List<Integer> res) {
        if (n == 0) return;
        res.add(n);
        generateExpected(n - 1, res);
        res.add(n);
        generateExpected(n - 1, res);
        res.add(n);
    }

    private static List<Integer> expected(int n) {
        List<Integer> res = new ArrayList<>();
        generateExpected(n, res);
        return res;
    }

    private static void runTestCase(int testNumber, int n) {
        List<Integer> expectedResult = expected(n);
        List<Integer> actualResult = PrintZigzag.solve(n);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: n=" + n + ", size=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: n=" + n + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running PrintZigzag tests...");

        runTestCase(1, 1);
        runTestCase(2, 2);
        runTestCase(3, 3);
        runTestCase(4, 4);
        runTestCase(5, 5);
        runTestCase(6, 6);
        runTestCase(7, 7);
        runTestCase(8, 8);
        runTestCase(9, 1);
        runTestCase(10, 2);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
