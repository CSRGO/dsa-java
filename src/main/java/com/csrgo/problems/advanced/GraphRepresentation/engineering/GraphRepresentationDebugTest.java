// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GraphRepresentation.engineering;

import java.util.*;
import com.csrgo.util.*;

public class GraphRepresentationDebugTest {

    static class Input {
        final int vtces;
        final int[][] edges;

        Input(int vtces, int[][] edges) {
            this.vtces = vtces;
            this.edges = edges;
        }
    }

    private static String formatAdj(List<List<int[]>> adj) {
        if (adj == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < adj.size(); i = i + 1) {
            sb.append(i).append(":");
            for (int[] e : adj.get(i)) {
                sb.append("(").append(e[0]).append(",").append(e[1]).append(")");
            }
            sb.append(";");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<TestCase<Input, String>> testCases = List.of(
            new TestCase<>(
                "Four Vertices Cycle Graph",
                new Input(4, new int[][]{{0, 1, 10}, {1, 2, 20}, {2, 3, 30}, {0, 3, 40}}),
                "0:(1,10)(3,40);1:(0,10)(2,20);2:(1,20)(3,30);3:(0,40)(2,30);"
            ),
            new TestCase<>(
                "Three Vertices Path",
                new Input(3, new int[][]{{0, 1, 5}, {1, 2, 7}}),
                "0:(1,5);1:(0,5)(2,7);2:(1,7);"
            ),
            new TestCase<>(
                "Single Isolated Vertex",
                new Input(1, new int[][]{}),
                "0:;"
            ),
            new TestCase<>(
                "Two Vertices Single Edge",
                new Input(2, new int[][]{{0, 1, 15}}),
                "0:(1,15);1:(0,15);"
            ),
            new TestCase<>(
                "Disconnected Vertices",
                new Input(3, new int[][]{{0, 1, 10}}),
                "0:(1,10);1:(0,10);2:;"
            ),
            new TestCase<>(
                "Triangle Complete Graph",
                new Input(3, new int[][]{{0, 1, 2}, {1, 2, 3}, {0, 2, 4}}),
                "0:(1,2)(2,4);1:(0,2)(2,3);2:(0,4)(1,3);"
            ),
            new TestCase<>(
                "Star Topology Centered at Zero",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 2}, {0, 3, 3}}),
                "0:(1,1)(2,2)(3,3);1:(0,1);2:(0,2);3:(0,3);"
            ),
            new TestCase<>(
                "Multiple Edges In Non-Sorted Input Order",
                new Input(3, new int[][]{{0, 2, 8}, {0, 1, 4}}),
                "0:(1,4)(2,8);1:(0,4);2:(0,8);"
            ),
            new TestCase<>(
                "Zero Weight Edges",
                new Input(2, new int[][]{{0, 1, 0}}),
                "0:(1,0);1:(0,0);"
            ),
            new TestCase<>(
                "Five Vertices Line Graph",
                new Input(5, new int[][]{{0, 1, 1}, {1, 2, 2}, {2, 3, 3}, {3, 4, 4}}),
                "0:(1,1);1:(0,1)(2,2);2:(1,2)(3,3);3:(2,3)(4,4);4:(3,4);"
            )
        );

        TestRunner<Input, String> runner = new TestRunner<>();

        runner.runTests(
            "Graph Representation (DEBUG)",
            testCases,
            input -> formatAdj(GraphRepresentationDebug.solve(input.vtces, input.edges)),
            false
        );
    }
}
