// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BFS.engineering;

import java.util.*;
import com.csrgo.util.*;

public class BFSDebugTest {

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
                "Cycle Graph Level Traversal",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {0, 3, 40}}, 0),
                List.of("0@0", "1@01", "3@03", "2@012")
            ),
            new TestCase<>(
                "Three Vertices Sequential Path",
                new Input(3, new int[][]{{0, 1, 5}, {1, 2, 5}}, 0),
                List.of("0@0", "1@01", "2@012")
            ),
            new TestCase<>(
                "Single Isolated Vertex",
                new Input(1, new int[][]{}, 0),
                List.of("0@0")
            ),
            new TestCase<>(
                "Two Vertices Forward Direction",
                new Input(2, new int[][]{{0, 1, 10}}, 0),
                List.of("0@0", "1@01")
            ),
            new TestCase<>(
                "Two Vertices Reverse Direction",
                new Input(2, new int[][]{{0, 1, 10}}, 1),
                List.of("1@1", "0@10")
            ),
            new TestCase<>(
                "Triangle Graph Dual Neighbors",
                new Input(3, new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}, 0),
                List.of("0@0", "1@01", "2@02")
            ),
            new TestCase<>(
                "Star Topology Traversal From Center",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}, 0),
                List.of("0@0", "1@01", "2@02", "3@03")
            ),
            new TestCase<>(
                "Star Topology Traversal From Leaf",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 1}, {0, 3, 1}}, 1),
                List.of("1@1", "0@10", "2@102", "3@103")
            ),
            new TestCase<>(
                "Disconnected Component Exclusion",
                new Input(4, new int[][]{{0, 1, 1}, {2, 3, 1}}, 0),
                List.of("0@0", "1@01")
            ),
            new TestCase<>(
                "Line Graph Reverse Crawl",
                new Input(4, new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}}, 3),
                List.of("3@3", "2@32", "1@321", "0@3210")
            )
        );

        TestRunner<Input, List<String>> runner = new TestRunner<>();

        runner.runTests(
            "BFS (DEBUG)",
            testCases,
            input -> BFSDebug.solve(input.vtces, input.edges, input.src),
            false
        );
    }
}
