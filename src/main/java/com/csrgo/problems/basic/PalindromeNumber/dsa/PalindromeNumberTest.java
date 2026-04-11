// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PalindromeNumber.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PalindromeNumberTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Boolean>> testCases = List.of(
            new TestCase<>("Classic Positive", 121, true),
            new TestCase<>("Negative Number", -121, false),
            new TestCase<>("Not Palindrome", 10, false),
            new TestCase<>("Zero Case", 0, true),
            new TestCase<>("Large Palindrome", 1234321, true),
            new TestCase<>("Large Non-Palindrome", 1234567, false),
            new TestCase<>("Single Digit", 7, true),
            new TestCase<>("Even Digits", 4224, true),
            new TestCase<>("Trailing Zeros", 100, false),
            new TestCase<>("Almost Palindrome", 1212, false)
        );

        TestRunner<Integer, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Palindrome Number",
            testCases,
            input -> PalindromeNumber.solve(input), 
            true 
        );
    }
}
