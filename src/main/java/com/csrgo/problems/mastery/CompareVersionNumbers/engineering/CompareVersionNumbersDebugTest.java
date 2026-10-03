// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CompareVersionNumbers.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CompareVersionNumbersDebugTest {

    static class Input {
        final String version1;
        final String version2;

        Input(String version1, String version2) {
            this.version1 = version1;
            this.version2 = version2;
        }

        @Override
        public String toString() {
            return "version1=\"" + version1 + "\", version2=\"" + version2 + "\"";
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Second Revision Greater Multi Digit",
                new Input("1.2", "1.10"),
                -1
            ),
            new TestCase<>(
                "Leading Zeroes Equal Values",
                new Input("1.01", "1.001"),
                0
            ),
            new TestCase<>(
                "Trailing Zero Revisions Equivalent",
                new Input("1.0", "1.0.0.0"),
                0
            ),
            new TestCase<>(
                "Longer Version With Non Zero Revision",
                new Input("1.0.1", "1"),
                1
            ),
            new TestCase<>(
                "Third Revision Comparison",
                new Input("7.5.2.4", "7.5.3"),
                -1
            ),
            new TestCase<>(
                "Major Revision Smaller",
                new Input("0.1", "1.1"),
                -1
            ),
            new TestCase<>(
                "Identical Version Strings",
                new Input("1.1", "1.1"),
                0
            ),
            new TestCase<>(
                "Deep Minor Revision Difference",
                new Input("1.2.3.4.5", "1.2.3.4.4"),
                1
            ),
            new TestCase<>(
                "Fourth Level Revision Difference",
                new Input("2.0.0.1", "2.0.0.2"),
                -1
            ),
            new TestCase<>(
                "Major Level Dominates Later Segments",
                new Input("10.0.0", "9.9.9.9"),
                1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Compare Version Numbers (DEBUG)",
            testCases,
            input -> CompareVersionNumbersDebug.solve(input.version1, input.version2),
            false
        );
    }
}
