// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeOverlappingIntervals.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MergeOverlappingIntervalsTest {

    public static void main(String[] args) {

        List<TestCase<int[][], int[][]>> testCases = List.of(
            new TestCase<>("Classic Overlapping Pairs", new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}}),
            new TestCase<>("Touching Boundary Intervals", new int[][]{{1, 4}, {4, 5}}, new int[][]{{1, 5}}),
            new TestCase<>("Single Interval", new int[][]{{5, 10}}, new int[][]{{5, 10}}),
            new TestCase<>("No Overlap Disjoint", new int[][]{{1, 2}, {3, 4}, {5, 6}}, new int[][]{{1, 2}, {3, 4}, {5, 6}}),
            new TestCase<>("Complete Enclosure", new int[][]{{1, 10}, {2, 3}, {4, 5}}, new int[][]{{1, 10}}),
            new TestCase<>("Unsorted Input Intervals", new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}}, new int[][]{{1, 10}}),
            new TestCase<>("Chain Merging All Into One", new int[][]{{1, 4}, {0, 2}, {3, 5}}, new int[][]{{0, 5}}),
            new TestCase<>("Identical Duplicate Intervals", new int[][]{{1, 4}, {1, 4}}, new int[][]{{1, 4}}),
            new TestCase<>("Point Intervals Zero Length", new int[][]{{1, 1}, {1, 2}}, new int[][]{{1, 2}}),
            new TestCase<>("Two Disjoint Subsets", new int[][]{{1, 3}, {2, 4}, {7, 9}, {8, 10}}, new int[][]{{1, 4}, {7, 10}})
        );

        TestRunner<int[][], int[][]> runner = new TestRunner<>();

        runner.runTests(
            "Merge Overlapping Intervals",
            testCases,
            input -> MergeOverlappingIntervals.solve(input),
            true
        );
    }
}
