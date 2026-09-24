// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.HollowDiamondPattern.engineering;

import java.util.*;
import com.csrgo.util.*;

public class HollowDiamondPatternDebugTest {

    private static String buildExpected(int n) {
        StringBuilder sb = new StringBuilder();
        int stars = n / 2 + 1;
        int spaces = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                sb.append("*");
                sb.append("\t");
            }
            for (int j = 1; j <= spaces; j++) {
                sb.append("\t");
            }
            for (int j = 1; j <= stars; j++) {
                sb.append("*");
                if (j < stars) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
            if (i <= n / 2) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\t\t*\n"),
            new TestCase<>("Three Rows Smallest Frame", 3, "*\t*\t\t*\t*\n*\t\t\t\t*\n*\t*\t\t*\t*\n"),
            new TestCase<>("Five Rows Classic Hollow Diamond", 5, buildExpected(5)),
            new TestCase<>("Seven Rows Mid Frame", 7, buildExpected(7)),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Expanded", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Wide", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Large", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Hollow Diamond Pattern (DEBUG)",
            testCases,
            input -> HollowDiamondPatternDebug.solve(input), 
            false 
        );
    }
}
