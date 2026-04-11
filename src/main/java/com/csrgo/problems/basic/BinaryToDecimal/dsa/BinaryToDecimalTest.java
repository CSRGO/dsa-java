// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BinaryToDecimal.dsa;

import java.util.*;
import com.csrgo.util.*;

public class BinaryToDecimalTest {

    public static void main(String[] args) {

        List<TestCase<Long, Integer>> testCases = List.of(
            new TestCase<>("Zero case", 0L, 0),
            new TestCase<>("Single bit 1", 1L, 1),
            new TestCase<>("Power of 2 (4)", 100L, 4),
            new TestCase<>("Full house", 111L, 7),
            new TestCase<>("Mixed 1", 1101L, 13),
            new TestCase<>("Mixed 2", 1010L, 10),
            new TestCase<>("Large binary 1", 100000L, 32),
            new TestCase<>("Large binary 2", 111111L, 63),
            new TestCase<>("High Value", 1111111111L, 1023),
            new TestCase<>("Alternate bits", 101010L, 42)
        );

        TestRunner<Long, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Binary to Decimal",
            testCases,
            input -> BinaryToDecimal.solve(input), 
            true 
        );
    }
}
