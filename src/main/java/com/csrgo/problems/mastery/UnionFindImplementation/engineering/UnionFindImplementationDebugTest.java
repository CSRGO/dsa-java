// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UnionFindImplementation.engineering;

import java.util.*;
import com.csrgo.util.*;

public class UnionFindImplementationDebugTest {

    static class Input {
        int n;
        int[][] operations;

        Input(int n, int[][] operations) {
            this.n = n;
            this.operations = operations;
        }

        @Override
        public String toString() {
            return "n=" + n + ", operations=" + Arrays.deepToString(operations);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, boolean[]>> testCases = List.of(
            new TestCase<>(
                "Multiple Component Merges Transitive Queries",
                new Input(5, new int[][]{{1, 0, 1}, {1, 2, 3}, {2, 0, 1}, {2, 0, 2}, {1, 1, 2}, {2, 0, 3}}),
                new boolean[]{true, false, true}
            ),
            new TestCase<>(
                "All Elements Disconnected Queries",
                new Input(3, new int[][]{{2, 0, 1}, {2, 1, 2}, {2, 0, 2}}),
                new boolean[]{false, false, false}
            ),
            new TestCase<>(
                "Linear Chain Union End To End Connectivity",
                new Input(4, new int[][]{{1, 0, 1}, {1, 1, 2}, {1, 2, 3}, {2, 0, 3}}),
                new boolean[]{true}
            ),
            new TestCase<>(
                "Minimal Pair Connected",
                new Input(2, new int[][]{{1, 0, 1}, {2, 0, 1}}),
                new boolean[]{true}
            ),
            new TestCase<>(
                "Three Components Merged In Stages",
                new Input(6, new int[][]{{1, 0, 1}, {1, 2, 3}, {1, 4, 5}, {2, 1, 3}, {2, 0, 5}, {1, 3, 4}, {2, 2, 5}}),
                new boolean[]{false, false, true}
            ),
            new TestCase<>(
                "Single Node Self Connection",
                new Input(1, new int[][]{{2, 0, 0}}),
                new boolean[]{true}
            ),
            new TestCase<>(
                "Redundant Union Same Pair",
                new Input(4, new int[][]{{1, 0, 1}, {1, 0, 1}, {2, 0, 1}}),
                new boolean[]{true}
            ),
            new TestCase<>(
                "No Operations Executed",
                new Input(5, new int[][]{}),
                new boolean[]{}
            ),
            new TestCase<>(
                "Subset Component Queries",
                new Input(3, new int[][]{{1, 0, 2}, {2, 0, 1}, {2, 0, 2}}),
                new boolean[]{false, true}
            ),
            new TestCase<>(
                "Tree Structure Union Query Sequence",
                new Input(4, new int[][]{{1, 0, 1}, {1, 2, 3}, {2, 0, 2}, {1, 0, 3}, {2, 1, 2}}),
                new boolean[]{false, true}
            )
        );

        TestRunner<Input, boolean[]> runner = new TestRunner<>();

        runner.runTests(
            "Union Find Implementation (Debug)",
            testCases,
            input -> UnionFindImplementationDebug.solve(input.n, input.operations),
            false
        );
    }
}
