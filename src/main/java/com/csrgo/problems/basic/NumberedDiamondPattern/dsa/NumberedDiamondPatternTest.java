// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.NumberedDiamondPattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class NumberedDiamondPatternTest {

    private static String buildExpected(int n) {
        if (n <= 0 || n % 2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            int r = (i <= mid) ? i : (n - i + 1);
            for (int sp = 1; sp <= mid - r; sp++) {
                sb.append("\t");
            }
            int val = r;
            int count = 2 * r - 1;
            for (int j = 1; j <= count; j++) {
                sb.append(val);
                if (j < r) {
                    val++;
                } else {
                    val--;
                }
                if (j < count) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "1\n"),
            new TestCase<>("Three Rows Smallest Diamond", 3, "\t1\n2\t3\t2\n\t1\n"),
            new TestCase<>("Five Rows Classic Diamond", 5, "\t\t1\n\t2\t3\t2\n3\t4\t5\t4\t3\n\t2\t3\t2\n\t\t1\n"),
            new TestCase<>("Seven Rows Mid Diamond", 7, buildExpected(7)),
            new TestCase<>("Nine Rows Stepped", 9, buildExpected(9)),
            new TestCase<>("Eleven Rows Scaled", 11, buildExpected(11)),
            new TestCase<>("Thirteen Rows Expanded", 13, buildExpected(13)),
            new TestCase<>("Fifteen Rows Wide", 15, buildExpected(15)),
            new TestCase<>("Seventeen Rows Large", 17, buildExpected(17)),
            new TestCase<>("Nineteen Rows Max Constraint", 19, buildExpected(19))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Numbered Diamond Pattern",
            testCases,
            input -> NumberedDiamondPattern.solve(input), 
            true 
        );
    }
}
