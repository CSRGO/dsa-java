// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MergeIntervals.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MergeIntervalsDebugTest {

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

        List<TestCase<Input, int[][]>> testCases = List.of(
            new TestCase<>("Classic Four Intervals", new Input(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}), new int[][]{{1, 6}, {8, 10}, {15, 18}}),
            new TestCase<>("Touching Boundaries", new Input(new int[][]{{1, 4}, {4, 5}}), new int[][]{{1, 5}}),
            new TestCase<>("Single Interval", new Input(new int[][]{{1, 4}}), new int[][]{{1, 4}}),
            new TestCase<>("Completely Contained Interval", new Input(new int[][]{{1, 10}, {2, 3}, {4, 5}}), new int[][]{{1, 10}}),
            new TestCase<>("Already Disjoint Sorted", new Input(new int[][]{{1, 2}, {3, 4}, {5, 6}}), new int[][]{{1, 2}, {3, 4}, {5, 6}}),
            new TestCase<>("Unsorted Overlapping", new Input(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}}), new int[][]{{1, 10}}),
            new TestCase<>("Point Intervals", new Input(new int[][]{{1, 1}, {1, 2}, {2, 2}}), new int[][]{{1, 2}}),
            new TestCase<>("Two Overlapping Reversed", new Input(new int[][]{{6, 8}, {1, 9}, {2, 4}, {4, 7}}), new int[][]{{1, 9}}),
            new TestCase<>("Identical Duplicate Intervals", new Input(new int[][]{{1, 3}, {1, 3}, {1, 3}}), new int[][]{{1, 3}}),
            new TestCase<>("Chain With Last Separated", new Input(new int[][]{{1, 3}, {2, 4}, {3, 5}, {7, 8}}), new int[][]{{1, 5}, {7, 8}})
        );

        TestRunner<Input, int[][]> runner = new TestRunner<>();

        runner.runTests(
            "Merge Intervals [DEBUG]",
            testCases,
            input -> MergeIntervalsDebug.solve(input.intervals), 
            false 
        );
    }
}
