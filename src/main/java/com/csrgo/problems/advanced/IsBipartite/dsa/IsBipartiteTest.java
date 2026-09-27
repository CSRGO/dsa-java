// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IsBipartite.dsa;

import java.util.*;
import com.csrgo.util.*;

public class IsBipartiteTest {

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
                "Four Vertices Even Cycle",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 0, 1}}),
                true
            ),
            new TestCase<>(
                "Three Vertices Odd Cycle",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}),
                false
            ),
            new TestCase<>(
                "Single Isolated Vertex Trivial Bipartite",
                new Input(1, new int[][]{}),
                true
            ),
            new TestCase<>(
                "Two Vertices Connected Pair",
                new Input(2, new int[][]{{0, 1, 1}}),
                true
            ),
            new TestCase<>(
                "Disconnected Graph Containing Odd Cycle",
                new Input(6, new int[][]{{0, 1, 1}, {2, 3, 1}, {3, 4, 1}, {4, 2, 1}}),
                false
            ),
            new TestCase<>(
                "Disconnected Graph With Even Components",
                new Input(6, new int[][]{{0, 1, 1}, {2, 3, 1}, {3, 4, 1}, {4, 5, 1}, {5, 2, 1}}),
                true
            ),
            new TestCase<>(
                "Star Topology Tree Always Bipartite",
                new Input(5, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}, {0, 4, 1}}),
                true
            ),
            new TestCase<>(
                "Complete Bipartite Structure K23",
                new Input(5, new int[][]{{0, 2, 1}, {0, 3, 1}, {0, 4, 1}, {1, 2, 1}, {1, 3, 1}, {1, 4, 1}}),
                true
            ),
            new TestCase<>(
                "Five Vertices Odd Cycle Length Five",
                new Input(5, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}, {4, 0, 1}}),
                false
            ),
            new TestCase<>(
                "Line Graph Five Vertices Acyclic",
                new Input(5, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}}),
                true
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Is Bipartite",
            testCases,
            input -> IsBipartite.solve(input.vtces, input.edges),
            true
        );
    }
}
