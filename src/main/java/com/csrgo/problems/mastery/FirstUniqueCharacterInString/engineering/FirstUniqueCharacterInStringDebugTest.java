// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FirstUniqueCharacterInString.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FirstUniqueCharacterInStringDebugTest {

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
                "First Character Unique",
                new Input("leetcode"),
                0
            ),
            new TestCase<>(
                "Middle Character Unique",
                new Input("loveleetcode"),
                2
            ),
            new TestCase<>(
                "No Unique Character Exists",
                new Input("aabb"),
                -1
            ),
            new TestCase<>(
                "Single Character String",
                new Input("z"),
                0
            ),
            new TestCase<>(
                "Unique Character At End",
                new Input("aab"),
                2
            ),
            new TestCase<>(
                "Unique Character At Start With Duplicates Following",
                new Input("baa"),
                0
            ),
            new TestCase<>(
                "All Unique Characters Distinct String",
                new Input("abcdefg"),
                0
            ),
            new TestCase<>(
                "Unique Character At Final Position",
                new Input("dddccdbba"),
                8
            ),
            new TestCase<>(
                "Multiple Repeating Chars With One Trailing Unique",
                new Input("abacabad"),
                7
            ),
            new TestCase<>(
                "All Characters Identical",
                new Input("aaaaaa"),
                -1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "First Unique Character in String (DEBUG)",
            testCases,
            input -> FirstUniqueCharacterInStringDebug.solve(input.s),
            false
        );
    }
}
