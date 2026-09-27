// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.FriendsPairing.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/friends-pairing
public class FriendsPairingDebugTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        FriendsPairingDebug solver = new FriendsPairingDebug();

        runner.addTestCase(new TestCase<>(
            "Standard Three Friends Sample",
            () -> solver.solve(3),
            4L
        ));

        runner.addTestCase(new TestCase<>(
            "Four Friends Cohort",
            () -> solver.solve(4),
            10L
        ));

        runner.addTestCase(new TestCase<>(
            "Zero Population Ground Case",
            () -> solver.solve(0),
            0L
        ));

        runner.addTestCase(new TestCase<>(
            "Isolated Single Participant",
            () -> solver.solve(1),
            1L
        ));

        runner.addTestCase(new TestCase<>(
            "Dual Participant Duo",
            () -> solver.solve(2),
            2L
        ));

        runner.addTestCase(new TestCase<>(
            "Five Friends Assembly",
            () -> solver.solve(5),
            26L
        ));

        runner.addTestCase(new TestCase<>(
            "Six Friends Partition",
            () -> solver.solve(6),
            76L
        ));

        runner.addTestCase(new TestCase<>(
            "Seven Friends Permutations",
            () -> solver.solve(7),
            232L
        ));

        runner.addTestCase(new TestCase<>(
            "Eight Friends Arrangement",
            () -> solver.solve(8),
            764L
        ));

        runner.addTestCase(new TestCase<>(
            "Ten Friends Scaled Assessment",
            () -> solver.solve(10),
            9496L
        ));

        runner.runTests("FriendsPairingDebugTest", false);
    }
}
