// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DijkstraAlgorithm.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DijkstraAlgorithmDebugTest {

    static class Input {
        final int vtces;
        final int[][] edges;
        final int src;

        Input(int vtces, int[][] edges, int src) {
            this.vtces = vtces;
            this.edges = edges;
            this.src = src;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Four Vertices Graph",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 20}, {0, 2, 40}, {2, 3, 30}}, 0),
                new int[]{0, 10, 30, 60}
            ),
            new TestCase<>(
                "Three Vertices With Unreachable Node",
                new Input(3, new int[][]{{0, 1, 5}}, 0),
                new int[]{0, 5, -1}
            ),
            new TestCase<>(
                "Single Vertex Trivial Zero Distance",
                new Input(1, new int[][]{}, 0),
                new int[]{0}
            ),
            new TestCase<>(
                "Two Vertices Direct Edge Forward",
                new Input(2, new int[][]{{0, 1, 7}}, 0),
                new int[]{0, 7}
            ),
            new TestCase<>(
                "Two Vertices Direct Edge Reverse Source",
                new Input(2, new int[][]{{0, 1, 7}}, 1),
                new int[]{7, 0}
            ),
            new TestCase<>(
                "Triangle Graph Indirect Path Cheaper",
                new Input(3, new int[][]{{0, 1, 2}, {1, 2, 3}, {0, 2, 10}}, 0),
                new int[]{0, 2, 5}
            ),
            new TestCase<>(
                "Disconnected Graph Isolated Subgraph",
                new Input(4, new int[][]{{0, 1, 10}, {2, 3, 10}}, 0),
                new int[]{0, 10, -1, -1}
            ),
            new TestCase<>(
                "Diamond Graph Alternate Route Minimum",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 4}, {1, 3, 5}, {2, 3, 1}}, 0),
                new int[]{0, 1, 4, 5}
            ),
            new TestCase<>(
                "Star Topology Traversal Across Center",
                new Input(4, new int[][]{{0, 1, 10}, {0, 2, 20}, {0, 3, 30}}, 1),
                new int[]{10, 0, 30, 40}
            ),
            new TestCase<>(
                "Zero Weight Edge Inclusion",
                new Input(3, new int[][]{{0, 1, 0}, {1, 2, 5}, {0, 2, 7}}, 0),
                new int[]{0, 0, 5}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Dijkstra Algorithm (DEBUG)",
            testCases,
            input -> DijkstraAlgorithmDebug.solve(input.vtces, input.edges, input.src),
            false
        );
    }
}
