// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.IsCyclic.engineering;

import java.util.*;
import com.csrgo.util.*;

public class IsCyclicDebugTest {

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
                "Four Vertices Perimeter Cycle",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {0, 3, 40}}),
                true
            ),
            new TestCase<>(
                "Four Vertices Linear Chain Tree",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}}),
                false
            ),
            new TestCase<>(
                "Single Isolated Vertex",
                new Input(1, new int[][]{}),
                false
            ),
            new TestCase<>(
                "Two Vertices Single Edge Tree",
                new Input(2, new int[][]{{0, 1, 5}}),
                false
            ),
            new TestCase<>(
                "Triangle Minimal Cycle",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}),
                true
            ),
            new TestCase<>(
                "Disconnected Graph Cycle In Subcomponent",
                new Input(6, new int[][]{{0, 1, 1}, {2, 3, 1}, {3, 4, 1}, {4, 2, 1}}),
                true
            ),
            new TestCase<>(
                "Disconnected Forest With Two Trees",
                new Input(6, new int[][]{{0, 1, 1}, {1, 2, 1}, {3, 4, 1}, {4, 5, 1}}),
                false
            ),
            new TestCase<>(
                "Star Topology Acyclic Tree",
                new Input(5, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}, {0, 4, 1}}),
                false
            ),
            new TestCase<>(
                "Complete Graph Four Vertices Multiple Cycles",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}, {1, 2, 1}, {1, 3, 1}, {2, 3, 1}}),
                true
            ),
            new TestCase<>(
                "Two Disconnected Nodes No Edges",
                new Input(2, new int[][]{}),
                false
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Is Cyclic (DEBUG)",
            testCases,
            input -> IsCyclicDebug.solve(input.vtces, input.edges),
            false
        );
    }
}
