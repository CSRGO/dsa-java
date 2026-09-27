// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BridgesInGraph.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BridgesInGraphDebugTest {

    static class Input {
        int vtces;
        int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    private static List<List<Integer>> makeList(int[][] pairs) {
        List<List<Integer>> list = new ArrayList<>();
        for (int[] p : pairs) {
            list.add(Arrays.asList(p[0], p[1]));
        }
        return list;
    }

    public static void main(String[] args) {
        List<TestCase<Input, List<List<Integer>>>> testCases = List.of(
            new TestCase<>(
                "Triangle with One Pendant Edge",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 0}, {1, 3}}),
                makeList(new int[][]{{1, 3}})
            ),
            new TestCase<>(
                "Single Edge Between Two Vertices",
                new Input(2, new int[][]{{0, 1}}),
                makeList(new int[][]{{0, 1}})
            ),
            new TestCase<>(
                "Triangle Cycle Without Bridges",
                new Input(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}),
                makeList(new int[][]{})
            ),
            new TestCase<>(
                "3-Node Linear Path",
                new Input(3, new int[][]{{0, 1}, {1, 2}}),
                makeList(new int[][]{{0, 1}, {1, 2}})
            ),
            new TestCase<>(
                "4-Node Linear Tree",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}}),
                makeList(new int[][]{{0, 1}, {1, 2}, {2, 3}})
            ),
            new TestCase<>(
                "Two Triangles Sharing Common Edge",
                new Input(5, new int[][]{{0, 1}, {1, 2}, {2, 0}, {1, 3}, {3, 4}, {4, 1}}),
                makeList(new int[][]{})
            ),
            new TestCase<>(
                "Triangle Connected to Line",
                new Input(5, new int[][]{{0, 1}, {1, 2}, {2, 0}, {1, 3}, {3, 4}}),
                makeList(new int[][]{{1, 3}, {3, 4}})
            ),
            new TestCase<>(
                "Simple 4-Cycle Ring",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}}),
                makeList(new int[][]{})
            ),
            new TestCase<>(
                "Barbell Graph Connecting Triangles",
                new Input(6, new int[][]{{0, 1}, {1, 2}, {2, 0}, {2, 3}, {3, 4}, {4, 5}, {5, 3}}),
                makeList(new int[][]{{2, 3}})
            ),
            new TestCase<>(
                "Star Graph Hub All Bridges",
                new Input(4, new int[][]{{0, 1}, {0, 2}, {0, 3}}),
                makeList(new int[][]{{0, 1}, {0, 2}, {0, 3}})
            )
        );

        TestRunner<Input, List<List<Integer>>> runner = new TestRunner<>();
        runner.runTests(
            "Bridges in Graph (DEBUG)",
            testCases,
            input -> BridgesInGraphDebug.solve(input.vtces, input.edges),
            false
        );
    }
}
