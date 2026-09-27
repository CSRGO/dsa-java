// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.OddEvenList.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class OddEvenListDebugTest {

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
            new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5, 2, 4}, "Odd length list of 5 elements"),
            new TestCase(new int[]{2, 1, 3, 5, 6, 4, 7}, new int[]{2, 3, 6, 7, 1, 5, 4}, "Seven elements list"),
            new TestCase(new int[]{}, new int[]{}, "Empty list"),
            new TestCase(new int[]{1}, new int[]{1}, "Single element list"),
            new TestCase(new int[]{1, 2}, new int[]{1, 2}, "Two elements list"),
            new TestCase(new int[]{1, 2, 3}, new int[]{1, 3, 2}, "Three elements list"),
            new TestCase(new int[]{1, 2, 3, 4}, new int[]{1, 3, 2, 4}, "Four elements list with even count"),
            new TestCase(new int[]{10, 20, 30, 40, 50, 60}, new int[]{10, 30, 50, 20, 40, 60}, "Six elements list with multiples of ten"),
            new TestCase(new int[]{-5, -4, -3, -2, -1}, new int[]{-5, -3, -1, -4, -2}, "Negative numbers list"),
            new TestCase(new int[]{7, 7, 8, 8, 9, 9}, new int[]{7, 8, 9, 7, 8, 9}, "List with duplicates at odd and even positions")
        );

        TestRunner.runTests(
            tests,
            t -> OddEvenListDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
