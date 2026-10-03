// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RedundantConnection.dsa;

import java.util.*;
import com.csrgo.util.*;

public class RedundantConnectionTest {

    static class Input {
        int[][] edges;

        Input(int[][] edges) {
            this.edges = edges;
        }

        @Override
        public String toString() {
            return "edges=" + Arrays.deepToString(edges);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Triangle Graph Third Edge Closes Cycle",
                new Input(new int[][]{{1, 2}, {1, 3}, {2, 3}}),
                new int[]{2, 3}
            ),
            new TestCase<>(
                "Five Node Graph Cycle At Four",
                new Input(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}),
                new int[]{1, 4}
            ),
            new TestCase<>(
                "Sequential Triangle Cycle Closing Edge",
                new Input(new int[][]{{1, 2}, {2, 3}, {1, 3}}),
                new int[]{1, 3}
            ),
            new TestCase<>(
                "Offset Node Indexing Two To Five",
                new Input(new int[][]{{2, 3}, {3, 4}, {4, 5}, {2, 5}}),
                new int[]{2, 5}
            ),
            new TestCase<>(
                "Three Vertices Cycle",
                new Input(new int[][]{{1, 3}, {3, 4}, {1, 4}}),
                new int[]{1, 4}
            ),
            new TestCase<>(
                "Direct Three Cycle Last Edge",
                new Input(new int[][]{{1, 2}, {2, 3}, {3, 1}}),
                new int[]{3, 1}
            ),
            new TestCase<>(
                "Permuted Four Cycle Closing At Back",
                new Input(new int[][]{{1, 4}, {4, 2}, {2, 3}, {3, 1}}),
                new int[]{3, 1}
            ),
            new TestCase<>(
                "Empty Edge List",
                new Input(new int[][]{}),
                new int[]{}
            ),
            new TestCase<>(
                "Diamond Graph Redundant Edge",
                new Input(new int[][]{{1, 2}, {1, 3}, {3, 4}, {2, 4}}),
                new int[]{2, 4}
            ),
            new TestCase<>(
                "Pentagon Ring Closes At Last Edge",
                new Input(new int[][]{{1, 5}, {5, 2}, {2, 3}, {3, 4}, {4, 5}}),
                new int[]{4, 5}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Redundant Connection",
            testCases,
            input -> RedundantConnection.solve(input.edges),
            true
        );
    }
}
