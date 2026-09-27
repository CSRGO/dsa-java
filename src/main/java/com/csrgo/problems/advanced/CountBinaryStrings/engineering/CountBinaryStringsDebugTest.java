// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CountBinaryStrings.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CountBinaryStringsDebugTest {

    public static void main(String[] args) {
        List<TestCase<Integer, Integer>> testCases = List.of(
            new TestCase<>("Unit Length Binary Strings", 1, 2),
            new TestCase<>("Length Two Excludes Double Zero", 2, 3),
            new TestCase<>("Length Three Permutations", 3, 5),
            new TestCase<>("Length Four Binary Combinations", 4, 8),
            new TestCase<>("Length Five Consecutive States", 5, 13),
            new TestCase<>("Length Six Sequence Scaling", 6, 21),
            new TestCase<>("Length Seven Fibonacci Mapping", 7, 34),
            new TestCase<>("Length Eight Combinatorial Growth", 8, 55),
            new TestCase<>("Length Ten Standard Midpoint", 10, 144),
            new TestCase<>("Length Fifteen Extended Range", 15, 1597)
        );

        TestRunner<Integer, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Count Binary Strings (DEBUG)",
            testCases,
            input -> CountBinaryStringsDebug.solve(input),
            false
        );
    }
}
