// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FoldLinkedList.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class FoldLinkedListTest {

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
            new TestCase(new int[]{1, 2, 3, 4}, new int[]{1, 4, 2, 3}, "Four elements even length"),
            new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{1, 5, 2, 4, 3}, "Five elements odd length"),
            new TestCase(new int[]{}, new int[]{}, "Empty list"),
            new TestCase(new int[]{1}, new int[]{1}, "Single element list"),
            new TestCase(new int[]{1, 2}, new int[]{1, 2}, "Two elements list remains unchanged"),
            new TestCase(new int[]{1, 2, 3}, new int[]{1, 3, 2}, "Three elements list"),
            new TestCase(new int[]{10, 20, 30, 40, 50, 60}, new int[]{10, 60, 20, 50, 30, 40}, "Six elements multiples of ten"),
            new TestCase(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, "Four identical elements"),
            new TestCase(new int[]{-3, -2, -1, 0, 1}, new int[]{-3, 1, -2, 0, -1}, "Negative and positive elements odd length"),
            new TestCase(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 7, 2, 6, 3, 5, 4}, "Seven elements list")
        );

        TestRunner.runTests(
            tests,
            t -> FoldLinkedList.solve(t.input),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
