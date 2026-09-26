// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.NonOverlappingIntervals.dsa;

import java.util.*;
import com.csrgo.util.*;

public class NonOverlappingIntervalsTest {

    static class Input {
        final int[][] intervals;

        Input(int[][] intervals) {
            this.intervals = intervals;
        }

        @Override
        public String toString() {
            return "intervals=" + Arrays.deepToString(intervals);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Classic Four Intervals One Removal", new Input(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}), 1),
            new TestCase<>("Three Identical Intervals", new Input(new int[][]{{1, 2}, {1, 2}, {1, 2}}), 2),
            new TestCase<>("Already Disjoint Adjacent", new Input(new int[][]{{1, 2}, {2, 3}}), 0),
            new TestCase<>("Single Interval", new Input(new int[][]{{1, 5}}), 0),
            new TestCase<>("One Huge Encompassing Interval", new Input(new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}}), 2),
            new TestCase<>("Negative Coordinates", new Input(new int[][]{{-50, -20}, {-30, -10}, {-20, 0}}), 1),
            new TestCase<>("Disjoint Dispersed", new Input(new int[][]{{1, 2}, {5, 6}, {10, 11}}), 0),
            new TestCase<>("All Overlapping Star", new Input(new int[][]{{1, 10}, {2, 10}, {3, 10}, {4, 10}}), 3),
            new TestCase<>("Touch At Endpoint", new Input(new int[][]{{1, 3}, {3, 5}, {5, 7}}), 0),
            new TestCase<>("Chain With Nesting", new Input(new int[][]{{1, 4}, {2, 3}, {3, 4}}), 1)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Non Overlapping Intervals",
            testCases,
            input -> NonOverlappingIntervals.solve(input.intervals), 
            true 
        );
    }
}
