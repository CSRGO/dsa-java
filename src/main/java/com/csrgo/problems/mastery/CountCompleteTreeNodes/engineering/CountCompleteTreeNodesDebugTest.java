// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CountCompleteTreeNodes.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CountCompleteTreeNodesDebugTest {

    static class Input {
        final int[] arr;

        Input(int[] arr) {
            this.arr = arr;
        }

        @Override
        public String toString() {
            return Arrays.toString(arr);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Six Nodes Complete Binary Tree",
                new Input(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, -1}),
                6
            ),
            new TestCase<>(
                "Empty Binary Tree",
                new Input(new int[]{}),
                0
            ),
            new TestCase<>(
                "Single Root Node",
                new Input(new int[]{1, -1, -1}),
                1
            ),
            new TestCase<>(
                "Two Nodes Complete Tree",
                new Input(new int[]{1, 2, -1, -1, -1}),
                2
            ),
            new TestCase<>(
                "Three Nodes Perfect Tree",
                new Input(new int[]{1, 2, -1, -1, 3, -1, -1}),
                3
            ),
            new TestCase<>(
                "Four Nodes Complete Tree",
                new Input(new int[]{1, 2, 4, -1, -1, -1, 3, -1, -1}),
                4
            ),
            new TestCase<>(
                "Five Nodes Complete Tree",
                new Input(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1}),
                5
            ),
            new TestCase<>(
                "Seven Nodes Perfect Binary Tree",
                new Input(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1}),
                7
            ),
            new TestCase<>(
                "Eight Nodes Complete Tree",
                new Input(new int[]{1, 2, 4, 8, -1, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1}),
                8
            ),
            new TestCase<>(
                "Nine Nodes Complete Tree",
                new Input(new int[]{1, 2, 4, 8, -1, -1, 9, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1}),
                9
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Count Complete Tree Nodes (Debug)",
            testCases,
            input -> CountCompleteTreeNodesDebug.solve(input.arr.clone()),
            false
        );
    }
}
