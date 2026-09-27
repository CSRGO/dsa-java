// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KReverse.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class KReverseDebugTest {

    static class Input {
        final int[] arr;
        final int k;

        Input(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
        }
    }

    static class TestCase {
        final Input input;
        final int[] expected;
        final String description;

        TestCase(Input input, int[] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5}, 2), new int[]{2, 1, 4, 3, 5}, "Reversing groups of 2 with 1 leftover"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5}, 3), new int[]{3, 2, 1, 4, 5}, "Reversing groups of 3 with 2 leftovers"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5, 6}, 2), new int[]{2, 1, 4, 3, 6, 5}, "Even length perfectly divided into pairs"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5, 6}, 3), new int[]{3, 2, 1, 6, 5, 4}, "Even length perfectly divided into triplets"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5}, 1), new int[]{1, 2, 3, 4, 5}, "k equals 1 resulting in no changes"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5}, 5), new int[]{5, 4, 3, 2, 1}, "k equals list length completely reversing list"),
            new TestCase(new Input(new int[]{10}, 1), new int[]{10}, "Single element list with k equals 1"),
            new TestCase(new Input(new int[]{1, 2}, 2), new int[]{2, 1}, "Two elements list with k equals 2"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4), new int[]{4, 3, 2, 1, 8, 7, 6, 5}, "Eight elements divided into two groups of 4"),
            new TestCase(new Input(new int[]{1, 2, 3, 4, 5, 6, 7}, 3), new int[]{3, 2, 1, 6, 5, 4, 7}, "Seven elements with k equals 3 and 1 leftover")
        );

        TestRunner.runTests(
            tests,
            t -> KReverseDebug.solve(t.input.arr, t.input.k),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
