// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RemoveAdjacentDuplicatesInString.dsa;

import java.util.*;
import com.csrgo.util.*;

public class RemoveAdjacentDuplicatesInStringTest {

    public static void main(String[] args) {

        List<TestCase<String, String>> testCases = List.of(
            new TestCase<>(
                "Six Characters Cascade Removal",
                "abbaca",
                "ca"
            ),
            new TestCase<>(
                "Nested Duplicates Removal",
                "azxxzy",
                "ay"
            ),
            new TestCase<>(
                "Single Character String",
                "a",
                "a"
            ),
            new TestCase<>(
                "Two Identical Characters Completely Removed",
                "aa",
                ""
            ),
            new TestCase<>(
                "Three Identical Characters Leaving One",
                "aaa",
                "a"
            ),
            new TestCase<>(
                "Four Identical Characters Even Elimination",
                "aaaa",
                ""
            ),
            new TestCase<>(
                "Palindrome With No Adjacent Duplicates",
                "abacaba",
                "abacaba"
            ),
            new TestCase<>(
                "Classic Mississippi Complete Collapse",
                "mississippi",
                "m"
            ),
            new TestCase<>(
                "Symmetric Cascade Leaving Single Char",
                "cbaabcc",
                "c"
            ),
            new TestCase<>(
                "Distinct Characters Without Any Removal",
                "abcdef",
                "abcdef"
            )
        );

        TestRunner<String, String> runner = new TestRunner<>();

        runner.runTests(
            "Remove Adjacent Duplicates in String",
            testCases,
            input -> RemoveAdjacentDuplicatesInString.solve(input),
            true
        );
    }
}
