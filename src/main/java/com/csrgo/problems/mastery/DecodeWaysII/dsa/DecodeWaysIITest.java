// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DecodeWaysII.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DecodeWaysIITest {

    static class Input {
        final String s;

        Input(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "s=\"" + s + "\"";
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Single Wildcard Character",
                new Input("*"),
                9
            ),
            new TestCase<>(
                "One Followed By Wildcard",
                new Input("1*"),
                18
            ),
            new TestCase<>(
                "Two Followed By Wildcard",
                new Input("2*"),
                15
            ),
            new TestCase<>(
                "Two Consecutive Wildcards",
                new Input("**"),
                96
            ),
            new TestCase<>(
                "Leading Zero Impossible To Decode",
                new Input("0"),
                0
            ),
            new TestCase<>(
                "Zero With Digit Leading Zero Impossible",
                new Input("06"),
                0
            ),
            new TestCase<>(
                "Exact Match Ten",
                new Input("10"),
                1
            ),
            new TestCase<>(
                "Three Fixed Digits Above Twenty Six",
                new Input("283"),
                1
            ),
            new TestCase<>(
                "Three Characters Double Wildcard Chain",
                new Input("*1*"),
                180
            ),
            new TestCase<>(
                "Seven Followed By Wildcard Single Groupings Only",
                new Input("7*"),
                9
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Decode Ways II",
            testCases,
            input -> DecodeWaysII.solve(input.s),
            true
        );
    }
}
