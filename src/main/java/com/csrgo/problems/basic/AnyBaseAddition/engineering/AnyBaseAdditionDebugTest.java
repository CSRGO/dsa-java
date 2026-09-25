// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseAddition.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AnyBaseAdditionDebugTest {

    public static void main(String[] args) {

        List<TestCase<long[], Long>> testCases = List.of(
            new TestCase<>("Octal Addition", new long[]{236L, 754L, 8}, 1212L),
            new TestCase<>("Binary Addition", new long[]{1010L, 1100L, 2}, 10110L),
            new TestCase<>("Both Zero", new long[]{0L, 0L, 8}, 0L),
            new TestCase<>("Identity Zero Addition", new long[]{346L, 0L, 7}, 346L),
            new TestCase<>("Octal Cascading Carry", new long[]{777L, 1L, 8}, 1000L),
            new TestCase<>("Binary Cascading Carry", new long[]{1111L, 1L, 2}, 10000L),
            new TestCase<>("Base 3 Addition", new long[]{121L, 212L, 3}, 1110L),
            new TestCase<>("Base 6 Addition", new long[]{345L, 432L, 6}, 1221L),
            new TestCase<>("Base 10 Addition", new long[]{9999L, 1L, 10}, 10000L),
            new TestCase<>("Base 5 Multi-Carry", new long[]{444444L, 444444L, 5}, 1444443L)
        );

        TestRunner<long[], Long> runner = new TestRunner<>();

        runner.runTests(
            "Any Base Addition (DEBUG)",
            testCases,
            input -> AnyBaseAdditionDebug.solve(input[0], input[1], (int) input[2]), 
            false 
        );
    }
}
