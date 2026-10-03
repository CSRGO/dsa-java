// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.BinaryTreeCameras.dsa;

import java.util.*;
import com.csrgo.util.*;

public class BinaryTreeCamerasTest {

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
                "Four Nodes Tree With Camera On Parent Of Leaves",
                new Input(new int[]{0, 0, 0, -1, -1, 0, -1, -1, -1}),
                1
            ),
            new TestCase<>(
                "Chain With Two Cameras Required",
                new Input(new int[]{0, 0, 0, -1, -1, -1, -1}),
                2
            ),
            new TestCase<>(
                "Single Node Isolated",
                new Input(new int[]{0, -1, -1}),
                1
            ),
            new TestCase<>(
                "Empty Tree",
                new Input(new int[]{}),
                0
            ),
            new TestCase<>(
                "Three Nodes Balanced Tree",
                new Input(new int[]{0, 0, -1, -1, 0, -1, -1}),
                1
            ),
            new TestCase<>(
                "Left Skewed Four Nodes Chain",
                new Input(new int[]{0, 0, 0, 0, -1, -1, -1, -1, -1}),
                2
            ),
            new TestCase<>(
                "Left Skewed Five Nodes Chain",
                new Input(new int[]{0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1}),
                2
            ),
            new TestCase<>(
                "Two Nodes Root And Left Child",
                new Input(new int[]{0, 0, -1, -1, -1}),
                1
            ),
            new TestCase<>(
                "Two Nodes Root And Right Child",
                new Input(new int[]{0, -1, 0, -1, -1}),
                1
            ),
            new TestCase<>(
                "Perfect Binary Tree Seven Nodes",
                new Input(new int[]{0, 0, 0, -1, -1, 0, -1, -1, 0, 0, -1, -1, 0, -1, -1}),
                2
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Binary Tree Cameras",
            testCases,
            input -> BinaryTreeCameras.solve(input.arr.clone()),
            true
        );
    }
}
