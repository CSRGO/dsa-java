// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseToDecimal.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AnyBaseToDecimalDebugTest {

    public static void main(String[] args) {

        List<TestCase<long[], Integer>> testCases = List.of(
            new TestCase<>("Octal to Decimal", new long[]{1172L, 8}, 634),
            new TestCase<>("Binary to Decimal", new long[]{111001L, 2}, 57),
            new TestCase<>("Zero Number", new long[]{0L, 8}, 0),
            new TestCase<>("Base 10 Identity", new long[]{100L, 10}, 100),
            new TestCase<>("Base 2 All Ones", new long[]{111L, 2}, 7),
            new TestCase<>("Ternary Power", new long[]{10000L, 3}, 81),
            new TestCase<>("Quinary Power", new long[]{1000L, 5}, 125),
            new TestCase<>("Eight Bits Binary", new long[]{11111111L, 2}, 255),
            new TestCase<>("Septenary to Decimal", new long[]{2626L, 7}, 1000),
            new TestCase<>("Nonary to Decimal", new long[]{14641L, 9}, 10000)
        );

        TestRunner<long[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Any Base to Decimal (DEBUG)",
            testCases,
            input -> AnyBaseToDecimalDebug.solve(input[0], (int) input[1]), 
            false 
        );
    }
}
