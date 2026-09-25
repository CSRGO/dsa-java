// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseMultiplication.dsa;

import java.util.*;
import com.csrgo.util.*;

public class AnyBaseMultiplicationTest {

    public static void main(String[] args) {

        List<TestCase<long[], Long>> testCases = List.of(
            new TestCase<>("Octal Multiplication", new long[]{2156L, 74L, 8}, 204710L),
            new TestCase<>("Binary Multiplication", new long[]{101L, 11L, 2}, 1111L),
            new TestCase<>("Zero Product", new long[]{0L, 456L, 8}, 0L),
            new TestCase<>("Identity Multiplication", new long[]{456L, 1L, 8}, 456L),
            new TestCase<>("Binary Max Nibble Square", new long[]{1111L, 1111L, 2}, 11100001L),
            new TestCase<>("Base 3 Square", new long[]{22L, 22L, 3}, 2101L),
            new TestCase<>("Base 5 Square", new long[]{44L, 44L, 5}, 4301L),
            new TestCase<>("Base 6 Square", new long[]{55L, 55L, 6}, 5401L),
            new TestCase<>("Base 10 Square", new long[]{99L, 99L, 10}, 9801L),
            new TestCase<>("Base 7 Square", new long[]{66L, 66L, 7}, 6501L)
        );

        TestRunner<long[], Long> runner = new TestRunner<>();

        runner.runTests(
            "Any Base Multiplication",
            testCases,
            input -> AnyBaseMultiplication.solve(input[0], input[1], (int) input[2]), 
            true 
        );
    }
}
