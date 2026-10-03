// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JobSequencingProblem.dsa;

import java.util.*;
import com.csrgo.util.*;

public class JobSequencingProblemTest {

    static class Input {
        final int[][] jobs;

        Input(int[][] jobs) {
            this.jobs = jobs;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(jobs);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Four Jobs With Conflicting Deadlines",
                new Input(new int[][]{{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}}),
                new int[]{2, 60}
            ),
            new TestCase<>(
                "Five Jobs Two Time Units Available",
                new Input(new int[][]{{1, 2, 100}, {2, 1, 19}, {3, 2, 27}, {4, 1, 25}, {5, 1, 15}}),
                new int[]{2, 127}
            ),
            new TestCase<>(
                "Three Non Overlapping Deadlines",
                new Input(new int[][]{{1, 3, 50}, {2, 1, 10}, {3, 2, 20}}),
                new int[]{3, 80}
            ),
            new TestCase<>(
                "Single Job In Pool",
                new Input(new int[][]{{1, 1, 50}}),
                new int[]{1, 50}
            ),
            new TestCase<>(
                "All Jobs With Unit Deadline",
                new Input(new int[][]{{1, 1, 20}, {2, 1, 10}, {3, 1, 30}}),
                new int[]{1, 30}
            ),
            new TestCase<>(
                "Large Deadlines For All Jobs",
                new Input(new int[][]{{1, 5, 10}, {2, 5, 20}, {3, 5, 30}}),
                new int[]{3, 60}
            ),
            new TestCase<>(
                "Four Jobs Strict Deadline Bounds",
                new Input(new int[][]{{1, 2, 50}, {2, 2, 60}, {3, 3, 20}, {4, 3, 30}}),
                new int[]{3, 140}
            ),
            new TestCase<>(
                "Four Jobs Varied Deadlines And Profits",
                new Input(new int[][]{{1, 4, 70}, {2, 1, 80}, {3, 1, 30}, {4, 2, 100}}),
                new int[]{3, 250}
            ),
            new TestCase<>(
                "Two Jobs Identical Profit And Deadline",
                new Input(new int[][]{{1, 1, 100}, {2, 1, 100}}),
                new int[]{1, 100}
            ),
            new TestCase<>(
                "Five Jobs Staggered Deadlines",
                new Input(new int[][]{{1, 2, 80}, {2, 1, 90}, {3, 3, 70}, {4, 2, 60}, {5, 1, 50}}),
                new int[]{3, 240}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Job Sequencing Problem",
            testCases,
            input -> JobSequencingProblem.solve(deepCopy(input.jobs)),
            true
        );
    }

    private static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i = i + 1) {
            copy[i] = original[i].clone();
        }
        return copy;
    }
}
