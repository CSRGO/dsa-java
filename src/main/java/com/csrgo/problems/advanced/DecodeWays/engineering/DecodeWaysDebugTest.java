// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DecodeWays.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DecodeWaysDebugTest {

    public static void main(String[] args) {
        List<TestCase<String, Integer>> testCases = List.of(
            new TestCase<>("Two Digit Ambiguity", "12", 2),
            new TestCase<>("Three Digit Combinations", "226", 3),
            new TestCase<>("Leading Zero Invalid", "06", 0),
            new TestCase<>("Exact Ten Terminal Zero", "10", 1),
            new TestCase<>("Above Twenty Six Boundary", "27", 1),
            new TestCase<>("Single Zero Impossible", "0", 0),
            new TestCase<>("Five Digit Mixed Terminal Zero", "11106", 2),
            new TestCase<>("Embedded Zero Strict Ten", "2101", 1),
            new TestCase<>("Invalid Double Digit Skip", "283", 1),
            new TestCase<>("Six Digit Alternating Combos", "123123", 9)
        );

        TestRunner<String, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Decode Ways (DEBUG)",
            testCases,
            input -> DecodeWaysDebug.solve(input),
            false
        );
    }
}
