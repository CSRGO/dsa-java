// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CloneGraph.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CloneGraphTest {

    static class Input {
        final int[][] adjList;

        Input(int[][] adjList) {
            this.adjList = adjList;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(adjList);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[][]>> testCases = List.of(
            new TestCase<>(
                "Four Node Cycle Graph",
                new Input(new int[][]{{2, 4}, {1, 3}, {2, 4}, {1, 3}}),
                new int[][]{{2, 4}, {1, 3}, {2, 4}, {1, 3}}
            ),
            new TestCase<>(
                "Single Isolated Node Without Neighbors",
                new Input(new int[][]{{}}),
                new int[][]{{}}
            ),
            new TestCase<>(
                "Empty Graph",
                new Input(new int[][]{}),
                new int[][]{}
            ),
            new TestCase<>(
                "Three Node Triangle Graph",
                new Input(new int[][]{{2, 3}, {1, 3}, {1, 2}}),
                new int[][]{{2, 3}, {1, 3}, {1, 2}}
            ),
            new TestCase<>(
                "Two Nodes Connected By Single Edge",
                new Input(new int[][]{{2}, {1}}),
                new int[][]{{2}, {1}}
            ),
            new TestCase<>(
                "Three Nodes Linear Path",
                new Input(new int[][]{{2}, {1, 3}, {2}}),
                new int[][]{{2}, {1, 3}, {2}}
            ),
            new TestCase<>(
                "Star Graph With Center Node One",
                new Input(new int[][]{{2, 3, 4}, {1}, {1}, {1}}),
                new int[][]{{2, 3, 4}, {1}, {1}, {1}}
            ),
            new TestCase<>(
                "Complete Graph Four Vertices",
                new Input(new int[][]{{2, 3, 4}, {1, 3, 4}, {1, 2, 4}, {1, 2, 3}}),
                new int[][]{{2, 3, 4}, {1, 3, 4}, {1, 2, 4}, {1, 2, 3}}
            ),
            new TestCase<>(
                "Five Node Cycle Graph",
                new Input(new int[][]{{2, 5}, {1, 3}, {2, 4}, {3, 5}, {1, 4}}),
                new int[][]{{2, 5}, {1, 3}, {2, 4}, {3, 5}, {1, 4}}
            ),
            new TestCase<>(
                "Four Node Linear Path Graph",
                new Input(new int[][]{{2}, {1, 3}, {2, 4}, {3}}),
                new int[][]{{2}, {1, 3}, {2, 4}, {3}}
            )
        );

        TestRunner<Input, int[][]> runner = new TestRunner<>();

        runner.runTests(
            "Clone Graph",
            testCases,
            input -> CloneGraph.solve(deepCopy(input.adjList)),
            true
        );
    }

    private static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i = i + 1) {
            copy[i] = original[i].clone();
        }
        return copy;
    }
}
