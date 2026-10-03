// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumPlatforms.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MinimumPlatformsTest {

    static class Input {
        final int[] arr;
        final int[] dep;

        Input(int[] arr, int[] dep) {
            this.arr = arr;
            this.dep = dep;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", dep=" + Arrays.toString(dep);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Six Trains Overlapping Peak Three",
                new Input(new int[]{900, 940, 950, 1100, 1500, 1800}, new int[]{910, 1200, 1120, 1130, 1900, 2000}),
                3
            ),
            new TestCase<>(
                "Three Trains Fully Sequential One Platform",
                new Input(new int[]{900, 1235, 1100}, new int[]{1000, 1240, 1200}),
                1
            ),
            new TestCase<>(
                "Single Train Station",
                new Input(new int[]{100}, new int[]{200}),
                1
            ),
            new TestCase<>(
                "Arrival Exact Match With Departure",
                new Input(new int[]{900, 910}, new int[]{910, 920}),
                2
            ),
            new TestCase<>(
                "All Trains Arrive Before First Departure",
                new Input(new int[]{100, 200, 300}, new int[]{400, 500, 600}),
                3
            ),
            new TestCase<>(
                "Strictly Disjoint Times",
                new Input(new int[]{100, 201, 301}, new int[]{200, 300, 400}),
                1
            ),
            new TestCase<>(
                "Two Separate Overlapping Clusters",
                new Input(new int[]{100, 150, 300, 350}, new int[]{200, 250, 400, 450}),
                2
            ),
            new TestCase<>(
                "Simultaneous Identical Arrivals",
                new Input(new int[]{500, 500, 500, 500}, new int[]{600, 600, 600, 600}),
                4
            ),
            new TestCase<>(
                "Six Trains Staggered Peak Four",
                new Input(new int[]{100, 140, 150, 200, 215, 400}, new int[]{110, 300, 220, 230, 315, 600}),
                4
            ),
            new TestCase<>(
                "Two Trains Overlapping Window",
                new Input(new int[]{10, 15}, new int[]{20, 25}),
                2
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Minimum Platforms",
            testCases,
            input -> MinimumPlatforms.solve(input.arr.clone(), input.dep.clone()),
            true
        );
    }
}
