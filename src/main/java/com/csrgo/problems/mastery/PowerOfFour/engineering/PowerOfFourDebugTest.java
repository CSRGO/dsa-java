// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PowerOfFour.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PowerOfFourDebugTest {

    static class Input {
        int n;

        Input(int n) {
            this.n = n;
        }

        @Override
        public String toString() {
            return "n=" + n;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>(
                "Square Of Four Sixteen",
                new Input(16),
                true
            ),
            new TestCase<>(
                "Odd Number Five",
                new Input(5),
                false
            ),
            new TestCase<>(
                "Zeroth Power One",
                new Input(1),
                true
            ),
            new TestCase<>(
                "Zero Boundary Case",
                new Input(0),
                false
            ),
            new TestCase<>(
                "Negative Power Of Four",
                new Input(-16),
                false
            ),
            new TestCase<>(
                "Power Of Two But Not Four Two",
                new Input(2),
                false
            ),
            new TestCase<>(
                "Power Of Two But Not Four Eight",
                new Input(8),
                false
            ),
            new TestCase<>(
                "Cube Of Four Sixty Four",
                new Input(64),
                true
            ),
            new TestCase<>(
                "Large Power Of Four Two To Thirtieth",
                new Input(1073741824),
                true
            ),
            new TestCase<>(
                "Maximum Signed Integer Value",
                new Input(2147483647),
                false
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Power of Four (Debug)",
            testCases,
            input -> PowerOfFourDebug.solve(input.n),
            false
        );
    }
}
