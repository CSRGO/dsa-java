// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfOperationsToMakeNetworkConnected.dsa;

import java.util.*;
import com.csrgo.util.*;

public class NumberOfOperationsToMakeNetworkConnectedTest {

    static class Input {
        final int n;
        final int[][] connections;

        Input(int n, int[][] connections) {
            this.n = n;
            this.connections = connections;
        }

        @Override
        public String toString() {
            return "n=" + n + ", connections=" + Arrays.deepToString(connections);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Cycle In 4 Nodes", new Input(4, new int[][]{{0, 1}, {0, 2}, {1, 2}}), 1),
            new TestCase<>("Six Nodes With Redundancies", new Input(6, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}}), 2),
            new TestCase<>("Insufficient Cables", new Input(6, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}}), -1),
            new TestCase<>("Already Connected Tree", new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}}), 0),
            new TestCase<>("Two Isolated Nodes No Cables", new Input(2, new int[][]{}), -1),
            new TestCase<>("Single Node", new Input(1, new int[][]{}), 0),
            new TestCase<>("Five Nodes Star With Extra Cable", new Input(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}}), 1),
            new TestCase<>("Two Disconnected Components Balanced", new Input(6, new int[][]{{0, 1}, {1, 2}, {3, 4}, {4, 5}, {2, 0}}), 1),
            new TestCase<>("Complete Graph K4 Extra Cables", new Input(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3}}), 1),
            new TestCase<>("Seven Nodes Sparse Impossible", new Input(7, new int[][]{{0, 1}, {2, 3}, {4, 5}}), -1)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Number of Operations to Make Network Connected",
            testCases,
            input -> NumberOfOperationsToMakeNetworkConnected.solve(input.n, input.connections),
            true
        );
    }
}
