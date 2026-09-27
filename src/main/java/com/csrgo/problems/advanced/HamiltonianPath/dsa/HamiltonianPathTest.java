// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HamiltonianPath.dsa;

import java.util.*;
import com.csrgo.util.*;

public class HamiltonianPathTest {

    static class Input {
        final int vtces;
        final int[][] edges;
        final int src;

        Input(int vtces, int[][] edges, int src) {
            this.vtces = vtces;
            this.edges = edges;
            this.src = src;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, List<String>>> testCases = List.of(
            new TestCase<>(
                "Four Vertices Perimeter Cycle",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 0, 1}}, 0),
                List.of("0123*", "0321*")
            ),
            new TestCase<>(
                "Four Vertices Open Line Path",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}}, 0),
                List.of("0123.")
            ),
            new TestCase<>(
                "Disconnected Graph No Complete Path",
                new Input(4, new int[][]{{0, 1, 1}, {2, 3, 1}}, 0),
                List.of()
            ),
            new TestCase<>(
                "Triangle Complete Graph Both Cycles",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}, 0),
                List.of("012*", "021*")
            ),
            new TestCase<>(
                "Single Vertex Trivial Path",
                new Input(1, new int[][]{}, 0),
                List.of("0.")
            ),
            new TestCase<>(
                "Two Vertices Mutual Cycle",
                new Input(2, new int[][]{{0, 1, 1}}, 0),
                List.of("01*")
            ),
            new TestCase<>(
                "Star Graph Starting From Hub Trapped",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}, 0),
                List.of()
            ),
            new TestCase<>(
                "Line Graph Starting In Middle Trapped",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}}, 1),
                List.of()
            ),
            new TestCase<>(
                "Line Graph Starting From Right End",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}}, 3),
                List.of("3210.")
            ),
            new TestCase<>(
                "Complete Graph Four Vertices All Cycles",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}, {1, 2, 1}, {1, 3, 1}, {2, 3, 1}}, 0),
                List.of("0123*", "0132*", "0213*", "0231*", "0312*", "0321*")
            )
        );

        TestRunner<Input, List<String>> runner = new TestRunner<>();

        runner.runTests(
            "Hamiltonian Path",
            testCases,
            input -> HamiltonianPath.solve(input.vtces, input.edges, input.src),
            true
        );
    }
}
