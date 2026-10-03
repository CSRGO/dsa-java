// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RottingOranges.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RottingOrangesDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>("Classic 3x3 Grid", new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}, 4),
            new TestCase<>("Isolated Fresh Orange", new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}, -1),
            new TestCase<>("No Fresh Oranges", new int[][]{{0, 2}}, 0),
            new TestCase<>("Already All Rotten", new int[][]{{2, 2}, {2, 2}}, 0),
            new TestCase<>("All Fresh No Rotten", new int[][]{{1, 1}, {1, 1}}, -1),
            new TestCase<>("Single Rotten In Center", new int[][]{{1, 1, 1}, {1, 2, 1}, {1, 1, 1}}, 2),
            new TestCase<>("Linear Strip", new int[][]{{2, 1, 1, 1, 1}}, 4),
            new TestCase<>("Two Distant Sources", new int[][]{{2, 1, 0, 1, 2}}, 1),
            new TestCase<>("Single Cell Rotten", new int[][]{{2}}, 0),
            new TestCase<>("Single Cell Fresh", new int[][]{{1}}, -1)
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Rotting Oranges (DEBUG)",
            testCases,
            grid -> RottingOrangesDebug.solve(grid),
            false
        );
    }
}
