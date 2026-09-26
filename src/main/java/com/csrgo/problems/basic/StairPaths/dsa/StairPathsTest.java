// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StairPaths.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StairPathsTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<String> expected(int n) {
        if (n == 0) {
            List<String> b = new ArrayList<>();
            b.add("");
            return b;
        }
        if (n < 0) return new ArrayList<>();

        List<String> p1 = expected(n - 1);
        List<String> p2 = expected(n - 2);
        List<String> p3 = expected(n - 3);

        List<String> res = new ArrayList<>();
        for (String s : p1) res.add("1" + s);
        for (String s : p2) res.add("2" + s);
        for (String s : p3) res.add("3" + s);
        return res;
    }

    private static void runTestCase(int testNumber, int n) {
        List<String> expectedResult = expected(n);
        List<String> actualResult = StairPaths.solve(n);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: n=" + n + ", paths=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: n=" + n + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running StairPaths tests...");

        runTestCase(1, 3);
        runTestCase(2, 0);
        runTestCase(3, 1);
        runTestCase(4, 2);
        runTestCase(5, 4);
        runTestCase(6, 5);
        runTestCase(7, 6);
        runTestCase(8, 7);
        runTestCase(9, 1);
        runTestCase(10, 2);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}
