// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ReverseANumber.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ReverseANumberTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Integer>> testCases = List.of(
            new TestCase<>("Single Digit", 7, 7),
            new TestCase<>("Two Digits", 42, 24),
            new TestCase<>("Three Digits", 123, 321),
            new TestCase<>("Trailing Zeros", 500, 5),
            new TestCase<>("Large Number", 987654321, 123456789),
            new TestCase<>("Zero Case", 0, 0),
            new TestCase<>("Palindromic Number", 121, 121),
            new TestCase<>("Power of 10", 1000, 1),
            new TestCase<>("Random Number", 54321, 12345),
            new TestCase<>("Maximum Range Item", 1000000000, 1)
        );

        TestRunner<Integer, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Reverse a Number",
            testCases,
            input -> ReverseANumber.solve(input), 
            true 
        );
    }
}
