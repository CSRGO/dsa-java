// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IsGraphConnected.dsa;

import java.util.*;
import com.csrgo.util.*;

public class IsGraphConnectedTest {

    static class Input {
        final int vtces;
        final int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>(
                "Seven Vertices Disconnected Components",
                new Input(7, new int[][]{{0, 1, 10}, {2, 3, 10}, {4, 5, 10}, {5, 6, 10}, {4, 6, 10}}),
                false
            ),
            new TestCase<>(
                "Four Vertices Continuous Chain",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}}),
                true
            ),
            new TestCase<>(
                "Three Vertices With One Isolated Node",
                new Input(3, new int[][]{{0, 1, 10}}),
                false
            ),
            new TestCase<>(
                "Single Vertex Trivial Case",
                new Input(1, new int[][]{}),
                true
            ),
            new TestCase<>(
                "Zero Vertices Empty Graph",
                new Input(0, new int[][]{}),
                true
            ),
            new TestCase<>(
                "Two Vertices Connected Pair",
                new Input(2, new int[][]{{0, 1, 5}}),
                true
            ),
            new TestCase<>(
                "Two Vertices Disconnected Nodes",
                new Input(2, new int[][]{}),
                false
            ),
            new TestCase<>(
                "Star Topology Centered Hub",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}),
                true
            ),
            new TestCase<>(
                "Triangle Complete Subgraph",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}),
                true
            ),
            new TestCase<>(
                "Five Vertices Perimeter Cycle",
                new Input(5, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}, {4, 0, 1}}),
                true
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Is Graph Connected",
            testCases,
            input -> IsGraphConnected.solve(input.vtces, input.edges),
            true
        );
    }
}
