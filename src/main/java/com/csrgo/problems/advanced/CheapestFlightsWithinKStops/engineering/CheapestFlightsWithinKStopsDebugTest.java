// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CheapestFlightsWithinKStops.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class CheapestFlightsWithinKStopsDebugTest {

    static class Input {
        int n;
        int[][] flights;
        int src;
        int dst;
        int k;

        Input(int n, int[][] flights, int src, int dst, int k) {
            this.n = n;
            this.flights = flights;
            this.src = src;
            this.dst = dst;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Optimal 1-Stop Path vs Cheaper 2-Stop Path",
                new Input(4, new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}}, 0, 3, 1),
                700
            ),
            new TestCase<>(
                "Multi-Stop Cheaper Than Direct Flight",
                new Input(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1),
                200
            ),
            new TestCase<>(
                "Zero Stops Forced Direct Flight",
                new Input(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0),
                500
            ),
            new TestCase<>(
                "Impossible with Zero Stops",
                new Input(3, new int[][]{{0, 1, 100}, {1, 2, 100}}, 0, 2, 0),
                -1
            ),
            new TestCase<>(
                "Single Direct Flight",
                new Input(2, new int[][]{{0, 1, 300}}, 0, 1, 0),
                300
            ),
            new TestCase<>(
                "Exactly One Stop Allowed",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 5}, {1, 2, 1}, {2, 3, 1}}, 0, 3, 1),
                6
            ),
            new TestCase<>(
                "Exactly Two Stops Allowed",
                new Input(4, new int[][]{{0, 1, 1}, {0, 2, 5}, {1, 2, 1}, {2, 3, 1}}, 0, 3, 2),
                3
            ),
            new TestCase<>(
                "Destination Unreachable From Source",
                new Input(3, new int[][]{{0, 1, 10}, {1, 2, 20}}, 2, 0, 5),
                -1
            ),
            new TestCase<>(
                "Path Too Long For K Stops",
                new Input(5, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {3, 4, 10}}, 0, 4, 2),
                -1
            ),
            new TestCase<>(
                "Exactly Enough Stops To Reach Destination",
                new Input(5, new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 3, 10}, {3, 4, 10}}, 0, 4, 3),
                40
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();
        runner.runTests(
            "Cheapest Flights Within K Stops (DEBUG)",
            testCases,
            input -> CheapestFlightsWithinKStopsDebug.solve(input.n, input.flights, input.src, input.dst, input.k),
            false
        );
    }
}
