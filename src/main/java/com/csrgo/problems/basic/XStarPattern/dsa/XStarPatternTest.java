// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.XStarPattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class XStarPatternTest {

    private static String buildExpected(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int lastCol = Math.max(i, n - i + 1);
            for (int j = 1; j < lastCol; j++) {
                if (i == j || i + j == n + 1) {
                    sb.append("*\t");
                } else {
                    sb.append("\t");
                }
            }
            sb.append("*\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\n"),
            new TestCase<>("Three Rows Smallest X", 3, "*\t\t*\n\t*\n*\t\t*\n"),
            new TestCase<>("Five Rows Classic X", 5, "*\t\t\t\t*\n\t*\t\t*\n\t\t*\n\t*\t\t*\n*\t\t\t\t*\n"),
            new TestCase<>("Seven Rows Mid X", 7, buildExpected(7)),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Expanded", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Wide", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Large", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "X Star Pattern",
            testCases,
            input -> XStarPattern.solve(input), 
            true 
        );
    }
}
