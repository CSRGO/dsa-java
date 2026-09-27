// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HighestFrequencyCharacter.dsa;

import java.util.*;
import com.csrgo.util.*;

public class HighestFrequencyCharacterTest {

    public static void main(String[] args) {
        List<TestCase<String, Character>> testCases = List.of(
            new TestCase<>("Unambiguous Dominant Character", "zmszeqxqq", 'q'),
            new TestCase<>("Multi-way Tie Resolved to First Peak", "abccba", 'a'),
            new TestCase<>("Single Character String", "a", 'a'),
            new TestCase<>("Repeated Single Character", "aaaaa", 'a'),
            new TestCase<>("Word with Clear Dominance", "banana", 'a'),
            new TestCase<>("Word with Consecutive Duplicate", "hello", 'l'),
            new TestCase<>("Multi-way Tie Two Count", "aabbcc", 'a'),
            new TestCase<>("Numeric Characters String", "1122331", '1'),
            new TestCase<>("All Unique Characters Returns First", "ABCDE", 'A'),
            new TestCase<>("Alternating Repeats Returns First Max", "google", 'o')
        );

        TestRunner<String, Character> runner = new TestRunner<>();

        runner.runTests(
            "Highest Frequency Character",
            testCases,
            input -> HighestFrequencyCharacter.solve(input),
            true
        );
    }
}
