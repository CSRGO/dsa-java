// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BellmanFord.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class BellmanFordTest {

    static class Input {
        int vtces;
        int[][] edges;
        int src;

        Input(int vtces, int[][] edges, int src) {
            this.vtces = vtces;
            this.edges = edges;
            this.src = src;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Graph With Negative Edge",
                new Input(4, new int[][]{{0, 1, 4}, {0, 2, 5}, {1, 3, 2}, {2, 1, -2}, {2, 3, 4}}, 0),
                new int[]{0, 3, 5, 5}
            ),
            new TestCase<>(
                "Reachable Negative Weight Cycle",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, -2}, {2, 0, -1}}, 0),
                new int[]{-1}
            ),
            new TestCase<>(
                "Single Vertex Graph",
                new Input(1, new int[][]{}, 0),
                new int[]{0}
            ),
            new TestCase<>(
                "Simple Positive Weights Linear Path",
                new Input(3, new int[][]{{0, 1, 5}, {1, 2, 3}}, 0),
                new int[]{0, 5, 8}
            ),
            new TestCase<>(
                "Unreachable Source Vertex",
                new Input(3, new int[][]{{0, 1, 5}, {1, 2, 3}}, 1),
                new int[]{100000000, 0, 3}
            ),
            new TestCase<>(
                "Consecutive Negative Edges Without Cycle",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, -1}, {2, 3, -1}}, 0),
                new int[]{0, 1, 0, -1}
            ),
            new TestCase<>(
                "Parallel Edges With Different Weights",
                new Input(2, new int[][]{{0, 1, 10}, {0, 1, 5}}, 0),
                new int[]{0, 5}
            ),
            new TestCase<>(
                "Shortcut Through Negative Edge",
                new Input(3, new int[][]{{0, 1, 2}, {0, 2, 8}, {1, 2, -4}}, 0),
                new int[]{0, 2, -2}
            ),
            new TestCase<>(
                "Unreachable Negative Cycle Safe Path",
                new Input(4, new int[][]{{1, 2, -1}, {2, 3, -2}, {3, 1, -1}}, 0),
                new int[]{0, 100000000, 100000000, 100000000}
            ),
            new TestCase<>(
                "Two-Node Negative Cycle",
                new Input(3, new int[][]{{0, 1, 3}, {1, 0, -4}}, 0),
                new int[]{-1}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();
        runner.runTests(
            "Bellman Ford",
            testCases,
            input -> BellmanFord.solve(input.vtces, input.edges, input.src),
            true
        );
    }
}
