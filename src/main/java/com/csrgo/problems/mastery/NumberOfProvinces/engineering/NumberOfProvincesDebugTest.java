// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfProvinces.engineering;

import java.util.*;
import com.csrgo.util.*;

public class NumberOfProvincesDebugTest {

    static class Input {
        int[][] isConnected;

        Input(int[][] isConnected) {
            this.isConnected = isConnected;
        }

        @Override
        public String toString() {
            return "isConnected=" + Arrays.deepToString(isConnected);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Two Provinces Three Cities",
                new Input(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}),
                2
            ),
            new TestCase<>(
                "Three Completely Isolated Cities",
                new Input(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}),
                3
            ),
            new TestCase<>(
                "Single Fully Connected Component",
                new Input(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}),
                1
            ),
            new TestCase<>(
                "Single City Only",
                new Input(new int[][]{{1}}),
                1
            ),
            new TestCase<>(
                "Two Disjoint Pairs Of Four Cities",
                new Input(new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}}),
                2
            ),
            new TestCase<>(
                "Empty Matrix Zero Provinces",
                new Input(new int[][]{}),
                0
            ),
            new TestCase<>(
                "Linear Chain Of Connected Cities",
                new Input(new int[][]{{1, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 1, 1}, {0, 0, 1, 1}}),
                1
            ),
            new TestCase<>(
                "Two Independent Cities",
                new Input(new int[][]{{1, 0}, {0, 1}}),
                2
            ),
            new TestCase<>(
                "Two Mutually Connected Cities",
                new Input(new int[][]{{1, 1}, {1, 1}}),
                1
            ),
            new TestCase<>(
                "Five Isolated Cities",
                new Input(new int[][]{
                    {1, 0, 0, 0, 0},
                    {0, 1, 0, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 0, 1, 0},
                    {0, 0, 0, 0, 1}
                }),
                5
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Number of Provinces (Debug)",
            testCases,
            input -> NumberOfProvincesDebug.solve(input.isConnected),
            false
        );
    }
}
