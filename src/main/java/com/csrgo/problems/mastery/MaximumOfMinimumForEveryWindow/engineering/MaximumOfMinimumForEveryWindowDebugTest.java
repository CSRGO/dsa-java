// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaximumOfMinimumForEveryWindow.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MaximumOfMinimumForEveryWindowDebugTest {

    static class Input {
        final int[] arr;

        Input(int[] arr) {
            this.arr = arr;
        }

        @Override
        public String toString() {
            return Arrays.toString(arr);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Seven Elements Mixed Windows",
                new Input(new int[]{10, 20, 30, 50, 10, 70, 30}),
                new int[]{70, 30, 20, 10, 10, 10, 10}
            ),
            new TestCase<>(
                "Three Elements Strictly Increasing",
                new Input(new int[]{10, 20, 30}),
                new int[]{30, 20, 10}
            ),
            new TestCase<>(
                "Single Element Array",
                new Input(new int[]{10}),
                new int[]{10}
            ),
            new TestCase<>(
                "All Elements Identical",
                new Input(new int[]{3, 3, 3, 3}),
                new int[]{3, 3, 3, 3}
            ),
            new TestCase<>(
                "Five Elements Strictly Increasing",
                new Input(new int[]{1, 2, 3, 4, 5}),
                new int[]{5, 4, 3, 2, 1}
            ),
            new TestCase<>(
                "Five Elements Strictly Decreasing",
                new Input(new int[]{5, 4, 3, 2, 1}),
                new int[]{5, 4, 3, 2, 1}
            ),
            new TestCase<>(
                "Valley Pattern Three Elements",
                new Input(new int[]{2, 1, 2}),
                new int[]{2, 1, 1}
            ),
            new TestCase<>(
                "Five Elements Mountain Valley Mixed",
                new Input(new int[]{4, 2, 3, 1, 5}),
                new int[]{5, 2, 2, 1, 1}
            ),
            new TestCase<>(
                "Two Elements Distinct",
                new Input(new int[]{100, 200}),
                new int[]{200, 100}
            ),
            new TestCase<>(
                "Alternating Five Elements",
                new Input(new int[]{7, 6, 8, 5, 9}),
                new int[]{9, 6, 6, 5, 5}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Maximum of Minimum for Every Window (Debug)",
            testCases,
            input -> MaximumOfMinimumForEveryWindowDebug.solve(input.arr.clone()),
            false
        );
    }
}
