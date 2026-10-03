// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfEnclaves.engineering;

import java.util.*;
import com.csrgo.util.*;

public class NumberOfEnclavesDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>("Classic 4x4 Grid", new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}, 3),
            new TestCase<>("All Boundary Connected", new int[][]{{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}}, 0),
            new TestCase<>("Single Enclave Center", new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}, 1),
            new TestCase<>("No Land Present", new int[][]{{0, 0}, {0, 0}}, 0),
            new TestCase<>("All Land No Sea", new int[][]{{1, 1}, {1, 1}}, 0),
            new TestCase<>("Two Separate Enclaves", new int[][]{{0, 0, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 0}}, 2),
            new TestCase<>("L Shaped Enclave", new int[][]{{0, 0, 0, 0}, {0, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}, 3),
            new TestCase<>("Boundary Only Land", new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}, 0),
            new TestCase<>("Single Cell Enclosed", new int[][]{{0, 0, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}}, 1),
            new TestCase<>("Corner Touches Are Sea", new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0)
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Number of Enclaves (DEBUG)",
            testCases,
            grid -> NumberOfEnclavesDebug.solve(grid),
            false
        );
    }
}
