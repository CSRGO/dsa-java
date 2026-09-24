// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DiamondStarPattern.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DiamondStarPatternDebugTest {

    private static String buildExpected(int n) {
        StringBuilder sb = new StringBuilder();
        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= spaces; sp++) {
                sb.append("\t");
            }
            for (int st = 1; st <= stars; st++) {
                sb.append("*");
                if (st < stars) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
            if (i <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\n"),
            new TestCase<>("Three Rows Smallest Diamond", 3, "\t*\n*\t*\t*\n\t*\n"),
            new TestCase<>("Five Rows Classic Diamond", 5, "\t\t*\n\t*\t*\t*\n*\t*\t*\t*\t*\n\t*\t*\t*\n\t\t*\n"),
            new TestCase<>("Seven Rows Mid Diamond", 7, "\t\t\t*\n\t\t*\t*\t*\n\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\n\t*\t*\t*\t*\t*\n\t\t*\t*\t*\n\t\t\t*\n"),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Expanded", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Wide", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Large", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Diamond Star Pattern (DEBUG)",
            testCases,
            input -> DiamondStarPatternDebug.solve(input), 
            false 
        );
    }
}
