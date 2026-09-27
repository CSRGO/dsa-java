// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CountABCSubsequences.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CountABCSubsequencesDebugTest {

    public static void main(String[] args) {
        List<TestCase<String, Integer>> testCases = List.of(
            new TestCase<>("Classic Interleaved Repeating Triplet", "abcabc", 7),
            new TestCase<>("Single A Single B Double C", "abcc", 3),
            new TestCase<>("Minimal Unit Triplet", "abc", 1),
            new TestCase<>("Double A Single B Single C", "aabc", 3),
            new TestCase<>("Single A Double B Single C", "abbc", 3),
            new TestCase<>("Double A Double B Double C", "aabbcc", 27),
            new TestCase<>("Reversed Order Impossible", "cba", 0),
            new TestCase<>("Single Character Repeating", "aaaa", 0),
            new TestCase<>("Prefix Without Terminal C", "ab", 0),
            new TestCase<>("Irrelevant Characters Interspersed", "abcdeabc", 7)
        );

        TestRunner<String, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Count ABC Subsequences (DEBUG)",
            testCases,
            input -> CountABCSubsequencesDebug.solve(input),
            false
        );
    }
}
