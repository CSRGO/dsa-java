// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PowerOfTwo.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PowerOfTwoTest {

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
                "Base Case One",
                new Input(1),
                true
            ),
            new TestCase<>(
                "Small Power Sixteen",
                new Input(16),
                true
            ),
            new TestCase<>(
                "Odd Number Three",
                new Input(3),
                false
            ),
            new TestCase<>(
                "Zero Boundary Case",
                new Input(0),
                false
            ),
            new TestCase<>(
                "Negative Power Of Two Negative Sixteen",
                new Input(-16),
                false
            ),
            new TestCase<>(
                "Large Power Two To Thirtieth",
                new Input(1073741824),
                true
            ),
            new TestCase<>(
                "One Less Than Power Of Two",
                new Input(536870911),
                false
            ),
            new TestCase<>(
                "Minimum Integer Value",
                new Input(-2147483648),
                false
            ),
            new TestCase<>(
                "Small Power Two",
                new Input(2),
                true
            ),
            new TestCase<>(
                "Composite Even Non Power Six",
                new Input(6),
                false
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Power of Two",
            testCases,
            input -> PowerOfTwo.solve(input.n),
            true
        );
    }
}
