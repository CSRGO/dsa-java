// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DigitFrequency.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DigitFrequencyDebugTest {

    public static void main(String[] args) {

        List<TestCase<long[], Integer>> testCases = List.of(
            new TestCase<>("Multiple Occurrences", new long[]{994543234L, 4}, 3),
            new TestCase<>("Multiple Zeros", new long[]{100050L, 0}, 4),
            new TestCase<>("Zero Number Target Zero", new long[]{0L, 0}, 1),
            new TestCase<>("Zero Number Target Non-Zero", new long[]{0L, 7}, 0),
            new TestCase<>("All Identical Digits", new long[]{7777777L, 7}, 7),
            new TestCase<>("Single Occurrence", new long[]{123456789L, 5}, 1),
            new TestCase<>("Absent Digit", new long[]{123456789L, 0}, 0),
            new TestCase<>("Large Long Number", new long[]{9876543210L, 9}, 1),
            new TestCase<>("Repeated Triplet Digits", new long[]{111222333444555L, 1}, 3),
            new TestCase<>("Quintillion Boundary Max Zeros", new long[]{1000000000000000000L, 0}, 18)
        );

        TestRunner<long[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Digit Frequency (DEBUG)",
            testCases,
            input -> DigitFrequencyDebug.solve(input[0], (int) input[1]), 
            false 
        );
    }
}
