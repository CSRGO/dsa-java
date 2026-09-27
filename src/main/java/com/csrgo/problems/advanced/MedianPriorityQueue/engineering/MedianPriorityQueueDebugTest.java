// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MedianPriorityQueue.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MedianPriorityQueueDebugTest {

    static class Input {
        final String[] operations;
        final int[] values;

        Input(String[] operations, int[] values) {
            this.operations = operations;
            this.values = values;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Basic Sequence With Add Peek Remove",
                new Input(new String[]{"add", "add", "peek", "add", "peek", "remove", "peek"}, new int[]{10, 20, 0, 30, 0, 0, 0}),
                new int[]{10, 20, 20, 10}),
            new TestCase<>("Single Element Operations",
                new Input(new String[]{"add", "peek", "remove", "peek"}, new int[]{5, 0, 0, 0}),
                new int[]{5, 5, -1}),
            new TestCase<>("Empty Queue Initial Peek",
                new Input(new String[]{"peek", "remove"}, new int[]{0, 0}),
                new int[]{-1, -1}),
            new TestCase<>("Strictly Decreasing Additions",
                new Input(new String[]{"add", "add", "add", "peek"}, new int[]{30, 20, 10, 0}),
                new int[]{20}),
            new TestCase<>("Strictly Increasing Additions",
                new Input(new String[]{"add", "add", "add", "peek"}, new int[]{10, 20, 30, 0}),
                new int[]{20}),
            new TestCase<>("Even Count Middle Element Selection",
                new Input(new String[]{"add", "add", "add", "add", "peek"}, new int[]{10, 20, 30, 40, 0}),
                new int[]{20}),
            new TestCase<>("Interleaved Add And Remove Balancing",
                new Input(new String[]{"add", "add", "remove", "add", "peek"}, new int[]{5, 15, 0, 25, 0}),
                new int[]{5, 15}),
            new TestCase<>("Duplicate Values In Queue",
                new Input(new String[]{"add", "add", "add", "peek", "remove", "peek"}, new int[]{7, 7, 7, 0, 0, 0}),
                new int[]{7, 7, 7}),
            new TestCase<>("Negative Numbers In Stream",
                new Input(new String[]{"add", "add", "add", "peek"}, new int[]{-10, -20, 0, 0}),
                new int[]{-10}),
            new TestCase<>("Drain Entire Queue Until Empty",
                new Input(new String[]{"add", "add", "remove", "remove", "peek"}, new int[]{1, 2, 0, 0, 0}),
                new int[]{1, 2, -1})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Median Priority Queue (DEBUG)",
            testCases,
            input -> MedianPriorityQueueDebug.solve(input.operations, input.values),
            false
        );
    }
}
