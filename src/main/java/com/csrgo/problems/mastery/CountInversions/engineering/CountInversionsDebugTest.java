// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CountInversions.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CountInversionsDebugTest {

    static class Input {
        final long[] arr;

        Input(long[] arr) {
            this.arr = arr;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Long>> testCases = List.of(
            new TestCase<>(
                "Standard Five Element Sequence",
                new Input(new long[]{2, 4, 1, 3, 5}),
                3L
            ),
            new TestCase<>(
                "Already Sorted Array Zero Inversions",
                new Input(new long[]{2, 3, 4, 5, 6}),
                0L
            ),
            new TestCase<>(
                "All Elements Identical",
                new Input(new long[]{10, 10, 10}),
                0L
            ),
            new TestCase<>(
                "Reversed Five Elements Maximum Inversions",
                new Input(new long[]{5, 4, 3, 2, 1}),
                10L
            ),
            new TestCase<>(
                "Single Element Array",
                new Input(new long[]{1}),
                0L
            ),
            new TestCase<>(
                "Two Elements Inverted",
                new Input(new long[]{2, 1}),
                1L
            ),
            new TestCase<>(
                "Mixed Sequence Five Elements",
                new Input(new long[]{1, 20, 6, 4, 5}),
                5L
            ),
            new TestCase<>(
                "Reversed Powers Of Two Four Elements",
                new Input(new long[]{8, 4, 2, 1}),
                6L
            ),
            new TestCase<>(
                "Large Magnitude Elements Inverted",
                new Input(new long[]{1000000000L, 500000000L, 250000000L}),
                3L
            ),
            new TestCase<>(
                "Three Elements Two Inversions",
                new Input(new long[]{3, 1, 2}),
                2L
            )
        );

        TestRunner<Input, Long> runner = new TestRunner<>();

        runner.runTests(
            "Count Inversions (DEBUG)",
            testCases,
            input -> CountInversionsDebug.solve(input.arr.clone()),
            false
        );
    }
}
