// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveDuplicates.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class RemoveDuplicatesDebugTest {

    static class TestCase {
        final int[] input;
        final int[] expected;
        final String description;

        TestCase(int[] input, int[] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[]{1, 1, 2}, new int[]{1, 2}, "Single pair of duplicates at head"),
            new TestCase(new int[]{1, 1, 2, 3, 3}, new int[]{1, 2, 3}, "Duplicates at beginning and end"),
            new TestCase(new int[]{}, new int[]{}, "Empty list"),
            new TestCase(new int[]{5}, new int[]{5}, "Single element list"),
            new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, "Already distinct elements"),
            new TestCase(new int[]{2, 2, 2, 2, 2}, new int[]{2}, "All duplicate elements"),
            new TestCase(new int[]{-3, -3, -2, -1, -1, 0}, new int[]{-3, -2, -1, 0}, "Negative numbers with duplicates"),
            new TestCase(new int[]{1, 1, 1, 2, 3, 3, 3, 4}, new int[]{1, 2, 3, 4}, "Triplicate values scattered"),
            new TestCase(new int[]{10, 20, 20, 30, 40, 40, 50}, new int[]{10, 20, 30, 40, 50}, "Alternating distinct and duplicates"),
            new TestCase(new int[]{0, 0, 0}, new int[]{0}, "Multiple zero duplicates")
        );

        TestRunner.runTests(
            tests,
            t -> RemoveDuplicatesDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
