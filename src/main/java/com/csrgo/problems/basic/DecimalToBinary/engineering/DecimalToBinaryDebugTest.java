// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DecimalToBinary.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DecimalToBinaryDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Long>> testCases = List.of(
            new TestCase<>("Zero case", 0, 0L),
            new TestCase<>("Single digit odd", 7, 111L),
            new TestCase<>("Single digit even", 6, 110L),
            new TestCase<>("Power of 2", 16, 10000L),
            new TestCase<>("Mixed binary", 13, 1101L),
            new TestCase<>("Power of 2 minus 1", 31, 11111L),
            new TestCase<>("Two digits", 10, 1010L),
            new TestCase<>("High Value", 63, 111111L),
            new TestCase<>("High Value 2", 100, 1100100L),
            new TestCase<>("Minimal Input", 1, 1L)
        );

        TestRunner<Integer, Long> runner = new TestRunner<>();

        runner.runTests(
            "Decimal to Binary",
            testCases,
            input -> DecimalToBinaryDebug.solve(input), 
            false 
        );
    }
}
