// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseSubtraction.dsa;

import java.util.*;
import com.csrgo.util.*;

public class AnyBaseSubtractionTest {

    public static void main(String[] args) {

        List<TestCase<long[], Long>> testCases = List.of(
            new TestCase<>("Octal Subtraction", new long[]{1212L, 236L, 8}, 754L),
            new TestCase<>("Binary Subtraction", new long[]{10110L, 1100L, 2}, 1010L),
            new TestCase<>("Both Zero", new long[]{0L, 0L, 8}, 0L),
            new TestCase<>("Identical Numbers", new long[]{754L, 754L, 8}, 0L),
            new TestCase<>("Octal Cascading Borrow", new long[]{1000L, 1L, 8}, 777L),
            new TestCase<>("Binary Cascading Borrow", new long[]{10000L, 1L, 2}, 1111L),
            new TestCase<>("Base 3 Subtraction", new long[]{1110L, 121L, 3}, 212L),
            new TestCase<>("Base 6 Subtraction", new long[]{1221L, 432L, 6}, 345L),
            new TestCase<>("Base 10 Subtraction", new long[]{10000L, 1L, 10}, 9999L),
            new TestCase<>("Base 5 Multi-Borrow", new long[]{1444443L, 444444L, 5}, 444444L)
        );

        TestRunner<long[], Long> runner = new TestRunner<>();

        runner.runTests(
            "Any Base Subtraction",
            testCases,
            input -> AnyBaseSubtraction.solve(input[0], input[1], (int) input[2]), 
            true 
        );
    }
}
