// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConnectRopesWithMinimumCost.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ConnectRopesWithMinimumCostDebugTest {

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
                "Four Ropes Classic Huffman Example",
                new Input(new int[]{4, 3, 2, 6}),
                29
            ),
            new TestCase<>(
                "Five Ropes Linear Increasing",
                new Input(new int[]{1, 2, 3, 4, 5}),
                33
            ),
            new TestCase<>(
                "Single Rope Zero Cost",
                new Input(new int[]{5}),
                0
            ),
            new TestCase<>(
                "Two Ropes Simple Connection",
                new Input(new int[]{2, 3}),
                5
            ),
            new TestCase<>(
                "Four Identical Small Ropes",
                new Input(new int[]{1, 1, 1, 1}),
                8
            ),
            new TestCase<>(
                "Three Ropes Decade Values",
                new Input(new int[]{10, 20, 30}),
                90
            ),
            new TestCase<>(
                "Four Ropes Arbitrary Order",
                new Input(new int[]{5, 4, 2, 8}),
                36
            ),
            new TestCase<>(
                "Pairs Of Equal Length Ropes",
                new Input(new int[]{2, 2, 3, 3}),
                20
            ),
            new TestCase<>(
                "Hundreds Scale Four Ropes",
                new Input(new int[]{100, 200, 300, 400}),
                1900
            ),
            new TestCase<>(
                "Five Ropes Mixed Lengths",
                new Input(new int[]{6, 5, 2, 3, 9}),
                55
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Connect Ropes with Minimum Cost (Debug)",
            testCases,
            input -> ConnectRopesWithMinimumCostDebug.solve(input.arr.clone()),
            false
        );
    }
}
