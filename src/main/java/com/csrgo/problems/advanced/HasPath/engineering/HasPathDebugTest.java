// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HasPath.engineering;

import java.util.*;
import com.csrgo.util.*;

public class HasPathDebugTest {

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
        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>(
                "Connected Seven Vertices Graph",
                new Input(7, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {0, 3, 40}, {3, 4, 2}, {4, 5, 3}, {5, 6, 3}, {4, 6, 8}}, 0, 6),
                true
            ),
            new TestCase<>(
                "Disconnected Seven Vertices Graph",
                new Input(7, new int[][]{{0, 1, 10}, {2, 3, 10}, {4, 5, 10}, {5, 6, 10}}, 0, 6),
                false
            ),
            new TestCase<>(
                "Source Equals Destination",
                new Input(5, new int[][]{{0, 1, 10}, {1, 2, 10}}, 3, 3),
                true
            ),
            new TestCase<>(
                "Direct Single Edge Connection",
                new Input(2, new int[][]{{0, 1, 5}}, 0, 1),
                true
            ),
            new TestCase<>(
                "Isolated Target Vertex",
                new Input(3, new int[][]{{0, 1, 10}}, 0, 2),
                false
            ),
            new TestCase<>(
                "Complete Triangle Cycle",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 2}, {0, 2, 3}}, 0, 2),
                true
            ),
            new TestCase<>(
                "Line Graph Forward Path",
                new Input(5, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}}, 0, 4),
                true
            ),
            new TestCase<>(
                "Line Graph Reverse Path",
                new Input(5, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 0),
                true
            ),
            new TestCase<>(
                "Star Topology Traversal Via Hub",
                new Input(4, new int[][]{{0, 1, 2}, {0, 2, 4}, {0, 3, 6}}, 1, 2),
                true
            ),
            new TestCase<>(
                "Two Independent Clusters",
                new Input(6, new int[][]{{0, 1, 1}, {1, 2, 1}, {3, 4, 1}, {4, 5, 1}}, 1, 4),
                false
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Has Path (DFS) (DEBUG)",
            testCases,
            input -> HasPathDebug.solve(input.vtces, input.edges, input.src, input.dest),
            false
        );
    }
}
