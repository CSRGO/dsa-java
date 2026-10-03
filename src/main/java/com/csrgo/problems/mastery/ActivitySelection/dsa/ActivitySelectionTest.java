// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ActivitySelection.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ActivitySelectionTest {

    static class Input {
        final int[] start;
        final int[] end;

        Input(int[] start, int[] end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "start=" + Arrays.toString(start) + ", end=" + Arrays.toString(end);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Four Activities Standard Interval Schedule",
                new Input(new int[]{1, 3, 2, 5}, new int[]{2, 4, 3, 6}),
                3
            ),
            new TestCase<>(
                "Six Activities Classic Greedy Example",
                new Input(new int[]{1, 3, 0, 5, 8, 5}, new int[]{2, 4, 6, 7, 9, 9}),
                4
            ),
            new TestCase<>(
                "Three Activities Border Point Touch",
                new Input(new int[]{10, 12, 20}, new int[]{20, 25, 30}),
                2
            ),
            new TestCase<>(
                "Single Activity Trivial Case",
                new Input(new int[]{1}, new int[]{2}),
                1
            ),
            new TestCase<>(
                "Completely Overlapping Activities",
                new Input(new int[]{1, 1, 1}, new int[]{5, 5, 5}),
                1
            ),
            new TestCase<>(
                "Four Daisy Chained Sequential Activities",
                new Input(new int[]{1, 2, 3, 4}, new int[]{2, 3, 4, 5}),
                4
            ),
            new TestCase<>(
                "Three Widely Disjoint Activities",
                new Input(new int[]{1, 10, 20}, new int[]{5, 15, 25}),
                3
            ),
            new TestCase<>(
                "Nested Intervals Selection",
                new Input(new int[]{1, 2, 3}, new int[]{10, 8, 5}),
                1
            ),
            new TestCase<>(
                "Two Independent Activities",
                new Input(new int[]{1, 5}, new int[]{4, 8}),
                2
            ),
            new TestCase<>(
                "Seven Activities Complex Scheduling",
                new Input(new int[]{1, 2, 3, 4, 7, 8, 9}, new int[]{3, 5, 4, 7, 8, 9, 10}),
                6
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Activity Selection",
            testCases,
            input -> ActivitySelection.solve(input.start.clone(), input.end.clone()),
            true
        );
    }
}
