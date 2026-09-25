// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseToAnyBase.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AnyBaseToAnyBaseDebugTest {

    public static void main(String[] args) {

        List<TestCase<long[], Long>> testCases = List.of(
            new TestCase<>("Binary to Octal", new long[]{111001L, 2, 8}, 71L),
            new TestCase<>("Octal to Binary", new long[]{1172L, 8, 2}, 1001111010L),
            new TestCase<>("Zero Number", new long[]{0L, 2, 8}, 0L),
            new TestCase<>("Identity Same Base", new long[]{100L, 10, 10}, 100L),
            new TestCase<>("Octal to Binary Reverse", new long[]{71L, 8, 2}, 111001L),
            new TestCase<>("Ternary to Nonary", new long[]{10000L, 3, 9}, 100L),
            new TestCase<>("Quinary to Decimal", new long[]{1000L, 5, 10}, 125L),
            new TestCase<>("Decimal to Binary Byte", new long[]{255L, 10, 2}, 11111111L),
            new TestCase<>("Septenary to Octal", new long[]{2626L, 7, 8}, 1750L),
            new TestCase<>("Binary to Base 4", new long[]{11111111L, 2, 4}, 3333L)
        );

        TestRunner<long[], Long> runner = new TestRunner<>();

        runner.runTests(
            "Any Base to Any Base (DEBUG)",
            testCases,
            input -> AnyBaseToAnyBaseDebug.solve(input[0], (int) input[1], (int) input[2]), 
            false 
        );
    }
}
