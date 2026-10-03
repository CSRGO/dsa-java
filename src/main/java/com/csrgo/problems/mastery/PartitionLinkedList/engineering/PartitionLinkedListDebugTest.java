// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PartitionLinkedList.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PartitionLinkedListDebugTest {

    static class Input {
        final int[] arr;
        final int x;

        Input(int[] arr, int x) {
            this.arr = arr;
            this.x = x;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", x=" + x;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Six Element List Partitioning",
                new Input(new int[]{1, 4, 3, 2, 5, 2}, 3),
                new int[]{1, 2, 2, 4, 3, 5}
            ),
            new TestCase<>(
                "Two Elements Partitioned Inverted Order",
                new Input(new int[]{2, 1}, 2),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "All Elements Strictly Less Than Threshold",
                new Input(new int[]{1, 2, 3}, 4),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "All Elements Greater Than Or Equal To Threshold",
                new Input(new int[]{5, 6, 7}, 3),
                new int[]{5, 6, 7}
            ),
            new TestCase<>(
                "Empty List Partitioning",
                new Input(new int[]{}, 0),
                new int[]{}
            ),
            new TestCase<>(
                "Single Element Greater Than Threshold",
                new Input(new int[]{1}, 0),
                new int[]{1}
            ),
            new TestCase<>(
                "Single Element Less Than Threshold",
                new Input(new int[]{1}, 2),
                new int[]{1}
            ),
            new TestCase<>(
                "Threshold At Head Node",
                new Input(new int[]{3, 1, 2}, 3),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "List Containing Zero In Elements",
                new Input(new int[]{1, 4, 3, 0, 2, 5, 2}, 3),
                new int[]{1, 0, 2, 2, 4, 3, 5}
            ),
            new TestCase<>(
                "Mixed Negative And Positive Elements",
                new Input(new int[]{10, -5, 20, -10, 0}, 0),
                new int[]{-5, -10, 10, 20, 0}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Partition Linked List (DEBUG)",
            testCases,
            input -> PartitionLinkedListDebug.solve(input.arr.clone(), input.x),
            false
        );
    }
}
