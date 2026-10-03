// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestWordInDictionary.dsa;

import java.util.*;
import com.csrgo.util.*;

public class LongestWordInDictionaryTest {

    static class Input {
        final String[] words;

        Input(String[] words) {
            this.words = words;
        }

        @Override
        public String toString() {
            return "words=" + Arrays.toString(words);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, String>> testCases = List.of(
            new TestCase<>("Chain Building World", new Input(new String[]{"w","wo","wor","worl","world"}), "world"),
            new TestCase<>("Tiebreaker Apple Over Apply", new Input(new String[]{"a","banana","app","appl","ap","apply","apple"}), "apple"),
            new TestCase<>("Single Character Word", new Input(new String[]{"z"}), "z"),
            new TestCase<>("No Buildable Words", new Input(new String[]{"xyz", "ab"}), ""),
            new TestCase<>("Prefix Missing In Chain", new Input(new String[]{"m", "mo", "mous", "mouse"}), "mo"),
            new TestCase<>("Multiple Equal Length Candidates", new Input(new String[]{"b", "ba", "c", "ca"}), "ba"),
            new TestCase<>("Non-Sequential Input Array", new Input(new String[]{"yo", "ew", "fc", "zrc", "yodn", "fcm", "q", "f", "l", "fcmr"}), "fcmr"),
            new TestCase<>("Single Letter Multiple Options", new Input(new String[]{"e", "d", "c", "b", "a"}), "a"),
            new TestCase<>("Deep Linear Progression", new Input(new String[]{"t", "ti", "tig", "tige", "tiger"}), "tiger"),
            new TestCase<>("Forking Branch Prefixes", new Input(new String[]{"p", "pa", "pan", "pant", "pants", "part"}), "pants")
        );

        TestRunner<Input, String> runner = new TestRunner<>();

        runner.runTests(
            "Longest Word in Dictionary",
            testCases,
            input -> LongestWordInDictionary.solve(input.words),
            true
        );
    }
}
