// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ConnectedComponents.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ConnectedComponentsTest {

    static class Input {
        final int vtces;
        final int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, List<List<Integer>>>> testCases = List.of(
            new TestCase<>(
                "Seven Vertices Three Components",
                new Input(7, new int[][]{{0, 1, 10}, {2, 3, 10}, {4, 5, 10}, {5, 6, 10}, {4, 6, 10}}),
                List.of(List.of(0, 1), List.of(2, 3), List.of(4, 5, 6))
            ),
            new TestCase<>(
                "Four Vertices Two Pairs",
                new Input(4, new int[][]{{0, 1, 1}, {2, 3, 1}}),
                List.of(List.of(0, 1), List.of(2, 3))
            ),
            new TestCase<>(
                "Three Completely Isolated Vertices",
                new Input(3, new int[][]{}),
                List.of(List.of(0), List.of(1), List.of(2))
            ),
            new TestCase<>(
                "Single Fully Connected Component",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}),
                List.of(List.of(0, 1, 2))
            ),
            new TestCase<>(
                "Single Vertex Graph",
                new Input(1, new int[][]{}),
                List.of(List.of(0))
            ),
            new TestCase<>(
                "Two Vertices Single Edge",
                new Input(2, new int[][]{{0, 1, 5}}),
                List.of(List.of(0, 1))
            ),
            new TestCase<>(
                "Star Topology Single Component",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}),
                List.of(List.of(0, 1, 2, 3))
            ),
            new TestCase<>(
                "One Connected Pair One Isolated Vertex",
                new Input(3, new int[][]{{0, 1, 2}}),
                List.of(List.of(0, 1), List.of(2))
            ),
            new TestCase<>(
                "Four Components Across Six Vertices",
                new Input(6, new int[][]{{0, 1, 1}, {2, 3, 1}}),
                List.of(List.of(0, 1), List.of(2, 3), List.of(4), List.of(5))
            ),
            new TestCase<>(
                "Five Vertices Sequential Line Graph",
                new Input(5, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}}),
                List.of(List.of(0, 1, 2, 3, 4))
            )
        );

        TestRunner<Input, List<List<Integer>>> runner = new TestRunner<>();

        runner.runTests(
            "Connected Components",
            testCases,
            input -> ConnectedComponents.solve(input.vtces, input.edges),
            true
        );
    }
}
