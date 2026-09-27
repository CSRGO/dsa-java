// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AllPaths.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AllPathsDebugTest {

    static class Input {
        final int vtces;
        final int[][] edges;
        final int src;
        final int dest;

        Input(int vtces, int[][] edges, int src, int dest) {
            this.vtces = vtces;
            this.edges = edges;
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, List<String>>> testCases = List.of(
            new TestCase<>(
                "Cycle Graph With Direct Chord",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {0, 3, 40}}, 0, 3),
                List.of("0->1->2->3", "0->3")
            ),
            new TestCase<>(
                "Three Vertices Linear Path",
                new Input(3, new int[][]{{0, 1, 5}, {1, 2, 5}}, 0, 2),
                List.of("0->1->2")
            ),
            new TestCase<>(
                "Disconnected Target Vertex",
                new Input(3, new int[][]{{0, 1, 5}}, 0, 2),
                List.of()
            ),
            new TestCase<>(
                "Source Equals Destination",
                new Input(4, new int[][]{{0, 1, 1}}, 2, 2),
                List.of("2")
            ),
            new TestCase<>(
                "Triangle Graph Dual Paths",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}, 0, 2),
                List.of("0->1->2", "0->2")
            ),
            new TestCase<>(
                "Diamond Graph Symmetric Paths",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {1, 3, 1}, {2, 3, 1}}, 0, 3),
                List.of("0->1->3", "0->2->3")
            ),
            new TestCase<>(
                "Complete Graph Four Vertices",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}, {1, 2, 1}, {1, 3, 1}, {2, 3, 1}}, 0, 3),
                List.of("0->1->2->3", "0->1->3", "0->2->1->3", "0->2->3", "0->3")
            ),
            new TestCase<>(
                "Single Edge Direct Connection",
                new Input(2, new int[][]{{0, 1, 10}}, 0, 1),
                List.of("0->1")
            ),
            new TestCase<>(
                "Reverse Traversal Line Graph",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}}, 3, 0),
                List.of("3->2->1->0")
            ),
            new TestCase<>(
                "Star Topology Leaf To Leaf",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}, 1, 2),
                List.of("1->0->2")
            )
        );

        TestRunner<Input, List<String>> runner = new TestRunner<>();

        runner.runTests(
            "All Paths (DEBUG)",
            testCases,
            input -> AllPathsDebug.solve(input.vtces, input.edges, input.src, input.dest),
            false
        );
    }
}
