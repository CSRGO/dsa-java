// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NumberOfProvinces.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class NumberOfProvincesTest {

    static class Input {
        int[][] isConnected;

        Input(int[][] isConnected) {
            this.isConnected = isConnected;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Two Provinces",
                new Input(new int[][]{
                    {1, 1, 0},
                    {1, 1, 0},
                    {0, 0, 1}
                }),
                2
            ),
            new TestCase<>(
                "All Isolated Cities",
                new Input(new int[][]{
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}
                }),
                3
            ),
            new TestCase<>(
                "Single City",
                new Input(new int[][]{
                    {1}
                }),
                1
            ),
            new TestCase<>(
                "Two Connected Cities",
                new Input(new int[][]{
                    {1, 1},
                    {1, 1}
                }),
                1
            ),
            new TestCase<>(
                "Two Isolated Cities",
                new Input(new int[][]{
                    {1, 0},
                    {0, 1}
                }),
                2
            ),
            new TestCase<>(
                "Fully Connected Mesh",
                new Input(new int[][]{
                    {1, 1, 1},
                    {1, 1, 1},
                    {1, 1, 1}
                }),
                1
            ),
            new TestCase<>(
                "Two Separate Pairs of Connected Cities",
                new Input(new int[][]{
                    {1, 1, 0, 0},
                    {1, 1, 0, 0},
                    {0, 0, 1, 1},
                    {0, 0, 1, 1}
                }),
                2
            ),
            new TestCase<>(
                "4-City Linear Chain",
                new Input(new int[][]{
                    {1, 1, 0, 0},
                    {1, 1, 1, 0},
                    {0, 1, 1, 1},
                    {0, 0, 1, 1}
                }),
                1
            ),
            new TestCase<>(
                "Star Topology Centered at City 0",
                new Input(new int[][]{
                    {1, 1, 1, 1},
                    {1, 1, 0, 0},
                    {1, 0, 1, 0},
                    {1, 0, 0, 1}
                }),
                1
            ),
            new TestCase<>(
                "5 Cities Partitioned Into 3 Groups",
                new Input(new int[][]{
                    {1, 1, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 0, 1, 1},
                    {0, 0, 0, 1, 1}
                }),
                3
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();
        runner.runTests(
            "Number of Provinces",
            testCases,
            input -> NumberOfProvinces.solve(input.isConnected),
            true
        );
    }
}
