// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PathWithMaximumProbability.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PathWithMaximumProbabilityDebugTest {

    static class Input {
        final int n;
        final int[][] edges;
        final double[] succProb;
        final int startNode;
        final int endNode;

        Input(int n, int[][] edges, double[] succProb, int startNode, int endNode) {
            this.n = n;
            this.edges = edges;
            this.succProb = succProb;
            this.startNode = startNode;
            this.endNode = endNode;
        }

        @Override
        public String toString() {
            return "n=" + n
                + ", edges=" + Arrays.deepToString(edges)
                + ", succProb=" + Arrays.toString(succProb)
                + ", start=" + startNode
                + ", end=" + endNode;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Double>> testCases = List.of(
            new TestCase<>(
                "Three Nodes Two Paths Indirect Wins",
                new Input(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2),
                0.25
            ),
            new TestCase<>(
                "Three Nodes Direct Path Wins",
                new Input(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.3}, 0, 2),
                0.3
            ),
            new TestCase<>(
                "Disconnected Graph No Path",
                new Input(3, new int[][]{{0, 1}}, new double[]{0.5}, 0, 2),
                0.0
            ),
            new TestCase<>(
                "Start Node Equals End Node",
                new Input(2, new int[][]{{0, 1}}, new double[]{0.5}, 0, 0),
                1.0
            ),
            new TestCase<>(
                "Single Edge Graph",
                new Input(2, new int[][]{{0, 1}}, new double[]{0.75}, 0, 1),
                0.75
            ),
            new TestCase<>(
                "Three Hop Linear Path Better Than Direct Edge",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}, {0, 3}}, new double[]{0.9, 0.9, 0.9, 0.5}, 0, 3),
                0.729
            ),
            new TestCase<>(
                "Multiple Parallel Paths To Destination",
                new Input(5, new int[][]{{0, 1}, {1, 4}, {0, 2}, {2, 4}, {0, 3}, {3, 4}}, new double[]{0.4, 0.5, 0.6, 0.5, 0.8, 0.2}, 0, 4),
                0.3
            ),
            new TestCase<>(
                "Cycle In Graph With Branch To End",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 0}, {2, 3}}, new double[]{0.8, 0.8, 0.8, 0.5}, 0, 3),
                0.32
            ),
            new TestCase<>(
                "Large Isolated Component",
                new Input(6, new int[][]{{0, 1}, {1, 2}, {3, 4}, {4, 5}}, new double[]{0.5, 0.5, 0.8, 0.8}, 0, 5),
                0.0
            ),
            new TestCase<>(
                "Star Graph Through Central Hub",
                new Input(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}}, new double[]{0.1, 0.2, 0.5, 0.8}, 1, 4),
                0.08
            )
        );

        TestRunner<Input, Double> runner = new TestRunner<>();

        runner.runTests(
            "Path with Maximum Probability Debug",
            testCases,
            input -> PathWithMaximumProbabilityDebug.solve(input.n, deepCopy(input.edges), input.succProb.clone(), input.startNode, input.endNode),
            false
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
