// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.FriendsPairing.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/friends-pairing
public class FriendsPairingTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        FriendsPairing solver = new FriendsPairing();

        runner.addTestCase(new TestCase<>(
            "Standard Example 1",
            () -> solver.solve(3),
            4L
        ));

        runner.addTestCase(new TestCase<>(
            "Standard Example 2",
            () -> solver.solve(4),
            10L
        ));

        runner.addTestCase(new TestCase<>(
            "Zero Friends Base",
            () -> solver.solve(0),
            0L
        ));

        runner.addTestCase(new TestCase<>(
            "Single Friend",
            () -> solver.solve(1),
            1L
        ));

        runner.addTestCase(new TestCase<>(
            "Two Friends",
            () -> solver.solve(2),
            2L
        ));

        runner.addTestCase(new TestCase<>(
            "Five Friends Group",
            () -> solver.solve(5),
            26L
        ));

        runner.addTestCase(new TestCase<>(
            "Six Friends Group",
            () -> solver.solve(6),
            76L
        ));

        runner.addTestCase(new TestCase<>(
            "Seven Friends Group",
            () -> solver.solve(7),
            232L
        ));

        runner.addTestCase(new TestCase<>(
            "Eight Friends Group",
            () -> solver.solve(8),
            764L
        ));

        runner.addTestCase(new TestCase<>(
            "Ten Friends Group",
            () -> solver.solve(10),
            9496L
        ));

        runner.runTests("FriendsPairingTest", true);
    }
}
