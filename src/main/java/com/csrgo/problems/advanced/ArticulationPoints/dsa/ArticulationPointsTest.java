// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ArticulationPoints.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class ArticulationPointsTest {

    static class Input {
        int vtces;
        int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, List<Integer>>> testCases = List.of(
            new TestCase<>(
                "Triangle Connected to Line",
                new Input(5, new int[][]{{0, 1}, {1, 2}, {2, 0}, {1, 3}, {3, 4}}),
                List.of(1, 3)
            ),
            new TestCase<>(
                "4-Node Line Graph",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}}),
                List.of(1, 2)
            ),
            new TestCase<>(
                "Triangle Cycle Without Cut Vertices",
                new Input(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}),
                List.of()
            ),
            new TestCase<>(
                "Single Vertex",
                new Input(1, new int[][]{}),
                List.of()
            ),
            new TestCase<>(
                "Two Vertices Single Edge",
                new Input(2, new int[][]{{0, 1}}),
                List.of()
            ),
            new TestCase<>(
                "Star Graph Center Vertex",
                new Input(4, new int[][]{{0, 1}, {0, 2}, {0, 3}}),
                List.of(0)
            ),
            new TestCase<>(
                "Two Triangles Sharing Single Apex",
                new Input(5, new int[][]{{0, 1}, {1, 2}, {2, 0}, {1, 3}, {3, 4}, {4, 1}}),
                List.of(1)
            ),
            new TestCase<>(
                "Barbell Graph Bridge Endpoints",
                new Input(6, new int[][]{{0, 1}, {1, 2}, {2, 0}, {2, 3}, {3, 4}, {4, 5}, {5, 3}}),
                List.of(2, 3)
            ),
            new TestCase<>(
                "4-Cycle Ring",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}}),
                List.of()
            ),
            new TestCase<>(
                "5-Cycle Ring",
                new Input(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {0, 4}}),
                List.of()
            )
        );

        TestRunner<Input, List<Integer>> runner = new TestRunner<>();
        runner.runTests(
            "Articulation Points",
            testCases,
            input -> ArticulationPoints.solve(input.vtces, input.edges),
            true
        );
    }
}
