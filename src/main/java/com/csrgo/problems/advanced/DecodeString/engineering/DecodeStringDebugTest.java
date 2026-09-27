// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DecodeString.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DecodeStringDebugTest {

    public static void main(String[] args) {

        List<TestCase<String, String>> testCases = List.of(
            new TestCase<>("Classic Consecutive Blocks", "3[a]2[bc]", "aaabcbc"),
            new TestCase<>("Nested Repeated Blocks", "3[a2[c]]", "accaccacc"),
            new TestCase<>("Leading And Trailing Unencoded Letters", "2[abc]3[cd]ef", "abcabccdcdcdef"),
            new TestCase<>("Single Character Block", "1[a]", "a"),
            new TestCase<>("Multi-digit Repetition Count", "10[a]", "aaaaaaaaaa"),
            new TestCase<>("Triple Nested Expressions", "2[2[2[b]]]", "bbbbbbbb"),
            new TestCase<>("No Encodings Present", "abcdef", "abcdef"),
            new TestCase<>("Alternating Single And Multi Encoded", "2[a]b3[c]", "aabccc"),
            new TestCase<>("Deeply Nested Sibling Expression", "2[a2[b]c]", "abbcabbc"),
            new TestCase<>("Large Nested Repetition", "2[3[a]b]", "aaabaaab")
        );

        TestRunner<String, String> runner = new TestRunner<>();

        runner.runTests(
            "Decode String (DEBUG)",
            testCases,
            input -> DecodeStringDebug.solve(input),
            false
        );
    }
}
