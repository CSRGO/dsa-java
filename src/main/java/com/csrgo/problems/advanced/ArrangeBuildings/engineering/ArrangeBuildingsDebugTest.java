// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ArrangeBuildings.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ArrangeBuildingsDebugTest {

    public static void main(String[] args) {
        List<TestCase<Integer, Long>> testCases = List.of(
            new TestCase<>("Unit Road Length Minimal Plots", 1, 4L),
            new TestCase<>("Road Length Two Pair of Plots", 2, 9L),
            new TestCase<>("Road Length Three Plots", 3, 25L),
            new TestCase<>("Road Length Four Plots", 4, 64L),
            new TestCase<>("Road Length Five Plots", 5, 169L),
            new TestCase<>("Road Length Six Plots", 6, 441L),
            new TestCase<>("Road Length Seven Plots", 7, 1156L),
            new TestCase<>("Road Length Eight Plots", 8, 3025L),
            new TestCase<>("Road Length Ten Plots", 10, 20736L),
            new TestCase<>("Road Length Fifteen Extended Plots", 15, 2550409L)
        );

        TestRunner<Integer, Long> runner = new TestRunner<>();

        runner.runTests(
            "Arrange Buildings (DEBUG)",
            testCases,
            input -> ArrangeBuildingsDebug.solve(input),
            false
        );
    }
}
