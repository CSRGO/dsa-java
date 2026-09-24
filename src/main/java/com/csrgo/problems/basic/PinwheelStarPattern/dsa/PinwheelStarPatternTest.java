// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PinwheelStarPattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PinwheelStarPatternTest {

    private static String buildExpected(int n) {
        if (n <= 0 || n % 2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            int lastCol = (i > mid && i < n) ? mid : n;
            for (int j = 1; j <= lastCol; j++) {
                boolean isStar = false;
                if (i == mid || j == mid) {
                    isStar = true;
                } else if (i == 1 && j <= mid) {
                    isStar = true;
                } else if (j == n && i <= mid) {
                    isStar = true;
                } else if (j == 1 && i >= mid) {
                    isStar = true;
                } else if (i == n && j >= mid) {
                    isStar = true;
                }
                if (isStar) {
                    sb.append("*");
                }
                if (j < lastCol) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\n"),
            new TestCase<>("Three Rows Small Pinwheel", 3, "*\t*\t*\n*\t*\t*\n*\t*\t*\n"),
            new TestCase<>("Five Rows Standard Example", 5, "*\t*\t*\t\t*\n\t\t*\t\t*\n*\t*\t*\t*\t*\n*\t\t*\n*\t\t*\t*\t*\n"),
            new TestCase<>("Seven Rows Rotational Cross", 7, buildExpected(7)),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Wide", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Large", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Scaled Up", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Pinwheel Star Pattern",
            testCases,
            input -> PinwheelStarPattern.solve(input), 
            true 
        );
    }
}
