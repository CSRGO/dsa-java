// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LongestConsecutiveSequence.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LongestConsecutiveSequenceDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Classic Unsorted Array", new int[]{100, 4, 200, 1, 3, 2}, 4),
            new TestCase<>("Long Sequence With Duplicates", new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9),
            new TestCase<>("Empty Array Returns Zero", new int[]{}, 0),
            new TestCase<>("Single Element Array", new int[]{7}, 1),
            new TestCase<>("Already Sorted Consecutive Array", new int[]{1, 2, 3, 4, 5}, 5),
            new TestCase<>("Negative Integers Sequence", new int[]{-3, -2, -1, 0, 1}, 5),
            new TestCase<>("Disjoint Individual Elements", new int[]{10, 30, 50, 70}, 1),
            new TestCase<>("All Identical Elements", new int[]{9, 9, 9, 9}, 1),
            new TestCase<>("Multiple Competing Disjoint Sequences", new int[]{10, 11, 12, 1, 2, 3, 4, 20, 21}, 4),
            new TestCase<>("Boundary Extreme Values", new int[]{0, -1, 1, 2, -2}, 5)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Longest Consecutive Sequence (DEBUG)",
            testCases,
            input -> LongestConsecutiveSequenceDebug.solve(input),
            false
        );
    }
}
