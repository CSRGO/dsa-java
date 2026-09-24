// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.HollowRhombusPattern.engineering;

import java.util.*;
import com.csrgo.util.*;

public class HollowRhombusPatternDebugTest {

    private static String buildExpected(int n) {
        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            int dist = (i <= mid) ? (i - 1) : (n - i);
            int col1 = mid - dist;
            int col2 = mid + dist;
            for (int sp = 1; sp < col1; sp++) {
                sb.append("\t");
            }
            sb.append("*");
            if (col1 != col2) {
                for (int sp = 1; sp <= col2 - col1; sp++) {
                    sb.append("\t");
                }
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\n"),
            new TestCase<>("Three Rows Smallest Rhombus", 3, "\t*\n*\t\t*\n\t*\n"),
            new TestCase<>("Five Rows Classic Rhombus", 5, "\t\t*\n\t*\t\t*\n*\t\t\t\t*\n\t*\t\t*\n\t\t*\n"),
            new TestCase<>("Seven Rows Mid Rhombus", 7, buildExpected(7)),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Expanded", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Wide", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Large", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Hollow Rhombus Pattern (DEBUG)",
            testCases,
            input -> HollowRhombusPatternDebug.solve(input), 
            false 
        );
    }
}
