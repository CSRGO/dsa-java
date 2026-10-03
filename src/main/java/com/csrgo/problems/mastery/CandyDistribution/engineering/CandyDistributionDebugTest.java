// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CandyDistribution.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CandyDistributionDebugTest {

    static class Input {
        final int[] ratings;

        Input(int[] ratings) {
            this.ratings = ratings;
        }

        @Override
        public String toString() {
            return Arrays.toString(ratings);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Three Elements Valley Shape",
                new Input(new int[]{1, 0, 2}),
                5
            ),
            new TestCase<>(
                "Equal Adjacent Ratings Non Strict",
                new Input(new int[]{1, 2, 2}),
                4
            ),
            new TestCase<>(
                "Single Child Trivial",
                new Input(new int[]{1}),
                1
            ),
            new TestCase<>(
                "Five Elements Strictly Increasing",
                new Input(new int[]{1, 2, 3, 4, 5}),
                15
            ),
            new TestCase<>(
                "Five Elements Strictly Decreasing",
                new Input(new int[]{5, 4, 3, 2, 1}),
                15
            ),
            new TestCase<>(
                "All Four Children Equal Ratings",
                new Input(new int[]{2, 2, 2, 2}),
                4
            ),
            new TestCase<>(
                "Symmetric Deep Valley Five Elements",
                new Input(new int[]{3, 2, 1, 2, 3}),
                11
            ),
            new TestCase<>(
                "Symmetric High Peak Five Elements",
                new Input(new int[]{1, 2, 3, 2, 1}),
                9
            ),
            new TestCase<>(
                "Alternating Peaks And Plateaus",
                new Input(new int[]{1, 3, 2, 2, 1}),
                7
            ),
            new TestCase<>(
                "Seven Children Steep Mountain Slope",
                new Input(new int[]{1, 6, 10, 8, 7, 3, 2}),
                18
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Candy Distribution (Debug)",
            testCases,
            input -> CandyDistributionDebug.solve(input.ratings.clone()),
            false
        );
    }
}
