// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestRepeatingCharacterReplacement.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LongestRepeatingCharacterReplacementDebugTest {

    static class Input {
        final String s;
        final int k;

        Input(String s, int k) {
            this.s = s;
            this.k = k;
        }

        @Override
        public String toString() {
            return "s=\"" + s + "\", k=" + k;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Alternating AB Pairs With Two Replacements",
                new Input("ABAB", 2),
                4
            ),
            new TestCase<>(
                "Multiple A and B Blocks With One Replacement",
                new Input("AABABBA", 1),
                4
            ),
            new TestCase<>(
                "All Identical Characters No Changes Needed",
                new Input("AAAA", 2),
                4
            ),
            new TestCase<>(
                "Distinct Characters With Zero Replacements",
                new Input("ABCD", 0),
                1
            ),
            new TestCase<>(
                "Five Distinct Characters With Two Replacements",
                new Input("ABCDE", 2),
                3
            ),
            new TestCase<>(
                "Single Character String",
                new Input("A", 0),
                1
            ),
            new TestCase<>(
                "Existing Consecutive Block Zero Replacements",
                new Input("ABAA", 0),
                2
            ),
            new TestCase<>(
                "Central Uniform Block With Flanking Opposites",
                new Input("BAAAB", 2),
                5
            ),
            new TestCase<>(
                "Three Repeating Characters With One Opposite",
                new Input("ABBB", 2),
                4
            ),
            new TestCase<>(
                "Five Letters Mixed Two Replacements Yield Entire Length",
                new Input("KRRHK", 2),
                5
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Longest Repeating Character Replacement (DEBUG)",
            testCases,
            input -> LongestRepeatingCharacterReplacementDebug.solve(input.s, input.k),
            false
        );
    }
}
