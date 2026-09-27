// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AlienDictionary.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class AlienDictionaryDebugTest {

    static class Input {
        String[] words;

        Input(String[] words) {
            this.words = words;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, String>> testCases = List.of(
            new TestCase<>(
                "Standard Five-Letter Language",
                new Input(new String[]{"wrt", "wrf", "er", "ett", "rftt"}),
                "wertf"
            ),
            new TestCase<>(
                "Simple Two-Letter Ordering",
                new Input(new String[]{"z", "x"}),
                "zx"
            ),
            new TestCase<>(
                "Direct Cycle Between Two Letters",
                new Input(new String[]{"z", "x", "z"}),
                ""
            ),
            new TestCase<>(
                "Invalid Prefix Condition",
                new Input(new String[]{"abc", "ab"}),
                ""
            ),
            new TestCase<>(
                "Single Word Single Character",
                new Input(new String[]{"z"}),
                "z"
            ),
            new TestCase<>(
                "Duplicate Identical Words",
                new Input(new String[]{"z", "z"}),
                "z"
            ),
            new TestCase<>(
                "Multi-Branch Dependency DAG",
                new Input(new String[]{"baa", "abcd", "abca", "cab", "cad"}),
                "bdac"
            ),
            new TestCase<>(
                "Chain of Single-Letter Words",
                new Input(new String[]{"a", "b", "c"}),
                "abc"
            ),
            new TestCase<>(
                "Three-Character Linear Language",
                new Input(new String[]{"caa", "aaa", "aab"}),
                "cab"
            ),
            new TestCase<>(
                "Three-Letter Circular Dependency",
                new Input(new String[]{"ab", "bc", "ca", "ab"}),
                ""
            )
        );

        TestRunner<Input, String> runner = new TestRunner<>();
        runner.runTests(
            "Alien Dictionary (DEBUG)",
            testCases,
            input -> AlienDictionaryDebug.solve(input.words),
            false
        );
    }
}
