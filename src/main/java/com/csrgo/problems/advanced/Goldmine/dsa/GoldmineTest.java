// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Goldmine.dsa;

import java.util.*;
import com.csrgo.util.*;

public class GoldmineTest {

    public static void main(String[] args) {
        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>("Classic Three By Three Mine", new int[][]{{1, 3, 3}, {2, 1, 4}, {0, 6, 4}}, 12),
            new TestCase<>("Four By Four Stepped Mine", new int[][]{{1, 3, 1, 5}, {2, 2, 4, 1}, {5, 0, 2, 3}, {0, 6, 1, 2}}, 16),
            new TestCase<>("Single Cell Mine", new int[][]{{10}}, 10),
            new TestCase<>("Single Row Lateral Drift", new int[][]{{1, 2, 3}}, 6),
            new TestCase<>("Single Column Extraction", new int[][]{{1}, {5}, {3}}, 5),
            new TestCase<>("All Zeros Barren Mine", new int[][]{{0, 0}, {0, 0}}, 0),
            new TestCase<>("Diagonal Vein Alignment", new int[][]{{1, 0, 0}, {0, 2, 0}, {0, 0, 3}}, 6),
            new TestCase<>("Opposite Corner Deposits", new int[][]{{5, 0, 0}, {0, 0, 0}, {0, 0, 5}}, 5),
            new TestCase<>("Forked Pathway Rich Nodes", new int[][]{{1, 10, 1}, {2, 1, 2}, {1, 10, 1}}, 14),
            new TestCase<>("Steep Gradient Descent", new int[][]{{6, 4, 2}, {5, 3, 1}, {7, 8, 9}}, 24)
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Goldmine",
            testCases,
            input -> Goldmine.solve(input),
            true
        );
    }
}
