// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InsertInterval.dsa;

import java.util.*;
import com.csrgo.util.*;

public class InsertIntervalTest {

    static class Input {
        final int[][] intervals;
        final int[] newInterval;

        Input(int[][] intervals, int[] newInterval) {
            this.intervals = intervals;
            this.newInterval = newInterval;
        }

        @Override
        public String toString() {
            return "intervals=" + Arrays.deepToString(intervals) + ", newInterval=" + Arrays.toString(newInterval);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[][]>> testCases = List.of(
            new TestCase<>("Classic Two Intervals Merge", new Input(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}), new int[][]{{1, 5}, {6, 9}}),
            new TestCase<>("Multi Interval Span", new Input(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}), new int[][]{{1, 2}, {3, 10}, {12, 16}}),
            new TestCase<>("Empty Existing Intervals", new Input(new int[][]{}, new int[]{5, 7}), new int[][]{{5, 7}}),
            new TestCase<>("Insert At Beginning Disjoint", new Input(new int[][]{{3, 5}, {6, 9}}, new int[]{1, 2}), new int[][]{{1, 2}, {3, 5}, {6, 9}}),
            new TestCase<>("Insert At End Disjoint", new Input(new int[][]{{1, 2}, {3, 5}}, new int[]{6, 8}), new int[][]{{1, 2}, {3, 5}, {6, 8}}),
            new TestCase<>("Touches Left Boundary", new Input(new int[][]{{1, 5}}, new int[]{5, 7}), new int[][]{{1, 7}}),
            new TestCase<>("Touches Right Boundary", new Input(new int[][]{{5, 7}}, new int[]{1, 5}), new int[][]{{1, 7}}),
            new TestCase<>("Fully Encompasses All", new Input(new int[][]{{2, 3}, {5, 6}, {8, 9}}, new int[]{1, 10}), new int[][]{{1, 10}}),
            new TestCase<>("Fully Contained Within Single Interval", new Input(new int[][]{{1, 10}}, new int[]{3, 4}), new int[][]{{1, 10}}),
            new TestCase<>("Point Insertion", new Input(new int[][]{{1, 5}}, new int[]{2, 3}), new int[][]{{1, 5}})
        );

        TestRunner<Input, int[][]> runner = new TestRunner<>();

        runner.runTests(
            "Insert Interval",
            testCases,
            input -> InsertInterval.solve(input.intervals, input.newInterval), 
            true 
        );
    }
}
