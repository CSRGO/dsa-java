// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KruskalAlgorithm.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class KruskalAlgorithmDebugTest {

    static class Input {
        int vtces;
        int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard 4-Node Graph",
                new Input(4, new int[][]{{0, 1, 10}, {0, 2, 6}, {0, 3, 5}, {1, 3, 15}, {2, 3, 4}}),
                19
            ),
            new TestCase<>(
                "Triangle with Redundant Edge",
                new Input(3, new int[][]{{0, 1, 5}, {1, 2, 3}, {0, 2, 1}}),
                4
            ),
            new TestCase<>(
                "Single Vertex No Edges Needed",
                new Input(1, new int[][]{}),
                0
            ),
            new TestCase<>(
                "Single Edge Connecting Two Vertices",
                new Input(2, new int[][]{{0, 1, 7}}),
                7
            ),
            new TestCase<>(
                "Equal Weight Triangle",
                new Input(3, new int[][]{{0, 1, 2}, {1, 2, 2}, {0, 2, 2}}),
                4
            ),
            new TestCase<>(
                "Simple Linear Path",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 2}, {2, 3, 3}}),
                6
            ),
            new TestCase<>(
                "Complex 5-Node Interconnected Network",
                new Input(5, new int[][]{{0, 1, 1}, {0, 2, 7}, {1, 2, 5}, {1, 3, 4}, {2, 3, 1}, {3, 4, 2}, {2, 4, 3}}),
                8
            ),
            new TestCase<>(
                "Dense Diamond Diagonal Cross Shortcuts",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {3, 0, 10}, {0, 2, 1}, {1, 3, 1}}),
                12
            ),
            new TestCase<>(
                "Parallel Edges Between Same Node Pair",
                new Input(3, new int[][]{{0, 1, 100}, {0, 1, 50}, {1, 2, 30}}),
                80
            ),
            new TestCase<>(
                "6-Node Multi-Cycle Graph",
                new Input(6, new int[][]{{0, 1, 4}, {0, 2, 4}, {1, 2, 2}, {2, 3, 3}, {2, 5, 2}, {2, 4, 4}, {3, 4, 3}, {5, 4, 3}}),
                14
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();
        runner.runTests(
            "Kruskal Algorithm (DEBUG)",
            testCases,
            input -> KruskalAlgorithmDebug.solve(input.vtces, input.edges),
            false
        );
    }
}
