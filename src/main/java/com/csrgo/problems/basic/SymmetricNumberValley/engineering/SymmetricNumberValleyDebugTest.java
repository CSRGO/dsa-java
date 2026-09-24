// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SymmetricNumberValley.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SymmetricNumberValleyDebugTest {

    private static String buildExpected(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j);
                if (j < i) {
                    sb.append("\t");
                }
            }
            if (i < n) {
                int gap = 2 * (n - i);
                for (int g = 1; g <= gap; g++) {
                    sb.append("\t");
                }
                for (int j = i; j >= 1; j--) {
                    sb.append(j);
                    if (j > 1) {
                        sb.append("\t");
                    }
                }
            } else if (n > 1) {
                sb.append("\t");
                for (int j = n - 1; j >= 1; j--) {
                    sb.append(j);
                    if (j > 1) {
                        sb.append("\t");
                    }
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Peak Base Case", 1, "1\n"),
            new TestCase<>("Two Rows Smallest Valley", 2, "1\t\t1\n1\t2\t1\n"),
            new TestCase<>("Three Rows Valley Step", 3, "1\t\t\t\t1\n1\t2\t\t2\t1\n1\t2\t3\t2\t1\n"),
            new TestCase<>("Four Rows Standard Example", 4, "1\t\t\t\t\t\t1\n1\t2\t\t\t\t2\t1\n1\t2\t3\t\t3\t2\t1\n1\t2\t3\t4\t3\t2\t1\n"),
            new TestCase<>("Five Rows Wide Valley", 5, buildExpected(5)),
            new TestCase<>("Six Rows Stepped", 6, buildExpected(6)),
            new TestCase<>("Seven Rows Scaling", 7, buildExpected(7)),
            new TestCase<>("Ten Rows Double Digit Valley", 10, buildExpected(10)),
            new TestCase<>("Fifteen Rows Large", 15, buildExpected(15)),
            new TestCase<>("Twenty Rows Boundary Check", 20, buildExpected(20))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Symmetric Number Valley (DEBUG)",
            testCases,
            input -> SymmetricNumberValleyDebug.solve(input), 
            false 
        );
    }
}
