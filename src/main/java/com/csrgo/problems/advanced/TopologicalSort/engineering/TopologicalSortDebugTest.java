// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TopologicalSort.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class TopologicalSortDebugTest {

    static class Input {
        int vtces;
        int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard DAG",
                new Input(6, new int[][]{{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}}),
                new int[]{4, 5, 0, 2, 3, 1}
            ),
            new TestCase<>(
                "Diamond DAG",
                new Input(4, new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}}),
                new int[]{0, 1, 2, 3}
            ),
            new TestCase<>(
                "Single Vertex No Edges",
                new Input(1, new int[][]{}),
                new int[]{0}
            ),
            new TestCase<>(
                "Linear Chain",
                new Input(3, new int[][]{{0, 1}, {1, 2}}),
                new int[]{0, 1, 2}
            ),
            new TestCase<>(
                "Reverse Linear Chain",
                new Input(3, new int[][]{{2, 1}, {1, 0}}),
                new int[]{2, 1, 0}
            ),
            new TestCase<>(
                "Disconnected Vertices",
                new Input(4, new int[][]{}),
                new int[]{0, 1, 2, 3}
            ),
            new TestCase<>(
                "Multiple Sources Converging To Sink",
                new Input(5, new int[][]{{0, 4}, {1, 4}, {2, 4}, {3, 4}}),
                new int[]{0, 1, 2, 3, 4}
            ),
            new TestCase<>(
                "Multiple Dependencies",
                new Input(4, new int[][]{{0, 3}, {1, 2}, {2, 3}}),
                new int[]{0, 1, 2, 3}
            ),
            new TestCase<>(
                "Two Paths Merging Then Extending",
                new Input(5, new int[][]{{0, 1}, {0, 2}, {2, 3}, {1, 3}, {3, 4}}),
                new int[]{0, 1, 2, 3, 4}
            ),
            new TestCase<>(
                "Multi-Layer DAG",
                new Input(6, new int[][]{{2, 0}, {2, 1}, {3, 0}, {3, 4}, {4, 5}, {1, 5}}),
                new int[]{2, 1, 3, 0, 4, 5}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();
        runner.runTests(
            "Topological Sort (DEBUG)",
            testCases,
            input -> TopologicalSortDebug.solve(input.vtces, input.edges),
            false
        );
    }
}
