// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FlattenMultilevelDoublyLinkedList.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FlattenMultilevelDoublyLinkedListDebugTest {

    static class Input {
        final int[][] nodes;

        Input(int[][] nodes) {
            this.nodes = nodes;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(nodes);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Multilevel Doubly Linked List",
                new Input(new int[][]{
                    {1, -1}, {2, -1}, {3, 6}, {4, -1}, {5, -1}, {6, -1},
                    {7, -1}, {8, 10}, {9, -1}, {10, -1}, {11, -1}, {12, -1}
                }),
                new int[]{1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6}
            ),
            new TestCase<>(
                "Three Nodes With First Having Child",
                new Input(new int[][]{
                    {1, 2}, {2, -1}, {3, -1}
                }),
                new int[]{1, 3, 2}
            ),
            new TestCase<>(
                "Empty Multilevel List",
                new Input(new int[][]{}),
                new int[]{}
            ),
            new TestCase<>(
                "Single Node With No Child",
                new Input(new int[][]{
                    {5, -1}
                }),
                new int[]{5}
            ),
            new TestCase<>(
                "Linear List Without Any Children",
                new Input(new int[][]{
                    {10, -1}, {20, -1}, {30, -1}
                }),
                new int[]{10, 20, 30}
            ),
            new TestCase<>(
                "Every Node Having A Child Chain",
                new Input(new int[][]{
                    {1, 1}, {2, 2}, {3, -1}
                }),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Two Level List With Child At Last Node",
                new Input(new int[][]{
                    {1, -1}, {2, 2}, {3, -1}
                }),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Deep Child Branch Then Continuing Level",
                new Input(new int[][]{
                    {1, 3}, {2, -1}, {3, -1}, {4, -1}, {5, -1}
                }),
                new int[]{1, 4, 5, 2, 3}
            ),
            new TestCase<>(
                "Negative Node Values Handled Properly",
                new Input(new int[][]{
                    {-1, 1}, {-2, -1}
                }),
                new int[]{-1, -2}
            ),
            new TestCase<>(
                "Complex Multi Branch Flattening",
                new Input(new int[][]{
                    {10, 3}, {20, -1}, {30, -1}, {15, -1}, {25, -1}
                }),
                new int[]{10, 15, 25, 20, 30}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Flatten Multilevel Doubly Linked List (Debug)",
            testCases,
            input -> FlattenMultilevelDoublyLinkedListDebug.solve(input.nodes),
            false
        );
    }
}
