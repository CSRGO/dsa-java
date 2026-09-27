// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrimsAlgorithm.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PrimsAlgorithmDebugTest {

    static class Input {
        final int vtces;
        final int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Four Vertices Graph",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 2}, {2, 3, 3}, {0, 3, 4}, {0, 2, 5}}),
                6
            ),
            new TestCase<>(
                "Three Vertices With Disconnected Node",
                new Input(3, new int[][]{{0, 1, 5}}),
                -1
            ),
            new TestCase<>(
                "Single Vertex Trivial Weight Zero",
                new Input(1, new int[][]{}),
                0
            ),
            new TestCase<>(
                "Two Vertices Direct Edge",
                new Input(2, new int[][]{{0, 1, 8}}),
                8
            ),
            new TestCase<>(
                "Triangle Graph Smallest Two Edges",
                new Input(3, new int[][]{{0, 1, 3}, {1, 2, 4}, {0, 2, 2}}),
                5
            ),
            new TestCase<>(
                "Complete Graph Four Vertices MST",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 2}, {2, 3, 3}, {3, 0, 4}, {0, 2, 5}, {1, 3, 6}}),
                6
            ),
            new TestCase<>(
                "Disconnected Forest No Spanning Tree",
                new Input(4, new int[][]{{0, 1, 2}, {2, 3, 4}}),
                -1
            ),
            new TestCase<>(
                "Star Topology Spanning All Rays",
                new Input(4, new int[][]{{0, 1, 10}, {0, 2, 20}, {0, 3, 30}}),
                60
            ),
            new TestCase<>(
                "Five Vertices Perimeter Cycle MST",
                new Input(5, new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 0, 1}}),
                10
            ),
            new TestCase<>(
                "Parallel Edges Picks Minimal Weight",
                new Input(3, new int[][]{{0, 1, 10}, {0, 1, 2}, {1, 2, 4}}),
                6
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Prim's Algorithm (DEBUG)",
            testCases,
            input -> PrimsAlgorithmDebug.solve(input.vtces, input.edges),
            false
        );
    }
}
