// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NetworkDelayTime.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class NetworkDelayTimeTest {

    static class Input {
        int[][] times;
        int n;
        int k;

        Input(int[][] times, int n, int k) {
            this.times = times;
            this.n = n;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Branching Network",
                new Input(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2),
                2
            ),
            new TestCase<>(
                "Simple 2-Node Path",
                new Input(new int[][]{{1, 2, 1}}, 2, 1),
                1
            ),
            new TestCase<>(
                "Unreachable Reverse Edge",
                new Input(new int[][]{{1, 2, 1}}, 2, 2),
                -1
            ),
            new TestCase<>(
                "Single Node Network",
                new Input(new int[][]{}, 1, 1),
                0
            ),
            new TestCase<>(
                "Triangle with Shortcut",
                new Input(new int[][]{{1, 2, 1}, {2, 3, 2}, {1, 3, 4}}, 3, 1),
                3
            ),
            new TestCase<>(
                "Bidirectional Cycle with Unequal Weights",
                new Input(new int[][]{{1, 2, 1}, {2, 1, 3}}, 2, 2),
                3
            ),
            new TestCase<>(
                "Partially Disconnected Directed Graph",
                new Input(new int[][]{{1, 2, 1}, {2, 3, 2}, {1, 3, 1}}, 3, 2),
                -1
            ),
            new TestCase<>(
                "Multi-Path Mesh Network",
                new Input(new int[][]{{1, 2, 5}, {1, 3, 2}, {3, 2, 1}, {2, 4, 1}, {3, 4, 6}}, 4, 1),
                4
            ),
            new TestCase<>(
                "5-Node Linear Chain",
                new Input(new int[][]{{1, 2, 10}, {2, 3, 10}, {3, 4, 10}, {4, 5, 10}}, 5, 1),
                40
            ),
            new TestCase<>(
                "3-Node Directed Ring",
                new Input(new int[][]{{1, 2, 1}, {2, 3, 1}, {3, 1, 1}}, 3, 1),
                2
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();
        runner.runTests(
            "Network Delay Time",
            testCases,
            input -> NetworkDelayTime.solve(input.times, input.n, input.k),
            true
        );
    }
}
