// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SpreadInfection.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SpreadInfectionDebugTest {

    static class Input {
        final int vtces;
        final int[][] edges;
        final int src;
        final int t;

        Input(int vtces, int[][] edges, int src, int t) {
            this.vtces = vtces;
            this.edges = edges;
            this.src = src;
            this.t = t;
        }
    }

    public static void main(String[] args) {
        int[][] standardEdges = new int[][]{
            {0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {0, 3, 10},
            {3, 4, 10}, {4, 5, 10}, {5, 6, 10}, {4, 6, 10}
        };

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Seven Vertices Three Time Units",
                new Input(7, standardEdges, 6, 3),
                4
            ),
            new TestCase<>(
                "Seven Vertices Single Time Unit Initial",
                new Input(7, standardEdges, 6, 1),
                1
            ),
            new TestCase<>(
                "Seven Vertices Two Time Units Partial Spread",
                new Input(7, standardEdges, 6, 2),
                3
            ),
            new TestCase<>(
                "Seven Vertices Full Epidemic Saturation",
                new Input(7, standardEdges, 6, 10),
                7
            ),
            new TestCase<>(
                "Single Isolated Vertex Indefinite Time",
                new Input(1, new int[][]{}, 0, 5),
                1
            ),
            new TestCase<>(
                "Two Vertices First Unit Bound",
                new Input(2, new int[][]{{0, 1, 1}}, 0, 1),
                1
            ),
            new TestCase<>(
                "Two Vertices Second Unit Spread",
                new Input(2, new int[][]{{0, 1, 1}}, 0, 2),
                2
            ),
            new TestCase<>(
                "Star Topology Centered Outbreak Spread",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}, 0, 2),
                4
            ),
            new TestCase<>(
                "Star Topology Leaf Outbreak Intermediate",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}, 1, 2),
                2
            ),
            new TestCase<>(
                "Star Topology Leaf Outbreak Full Wave",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}, 1, 3),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Spread Infection (DEBUG)",
            testCases,
            input -> SpreadInfectionDebug.solve(input.vtces, input.edges, input.src, input.t),
            false
        );
    }
}
