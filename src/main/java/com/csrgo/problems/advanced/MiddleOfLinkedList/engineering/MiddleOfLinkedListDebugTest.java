// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MiddleOfLinkedList.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class MiddleOfLinkedListDebugTest {

    static class TestCase {
        final int[] input;
        final int expected;
        final String description;

        TestCase(int[] input, int expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[]{1, 2, 3, 4, 5}, 3, "Odd length list of 5 elements"),
            new TestCase(new int[]{1, 2, 3, 4, 5, 6}, 4, "Even length list of 6 elements returning second middle"),
            new TestCase(new int[]{10}, 10, "Single element list"),
            new TestCase(new int[]{10, 20}, 20, "Two elements list returning second element"),
            new TestCase(new int[]{7, 14, 21}, 14, "Three elements list"),
            new TestCase(new int[]{1, 3, 5, 7}, 5, "Four elements list returning second middle"),
            new TestCase(new int[]{100, 200, 300, 400, 500, 600, 700}, 400, "Seven elements list"),
            new TestCase(new int[]{5, 10, 15, 20, 25, 30, 35, 40}, 25, "Eight elements list"),
            new TestCase(new int[]{9, 8, 7, 6, 5}, 7, "Odd descending sequence"),
            new TestCase(new int[]{42, 43, 44, 45, 46, 47, 48, 49, 50, 51}, 47, "Ten elements list returning second middle")
        );

        TestRunner.runTests(
            tests,
            t -> MiddleOfLinkedListDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
