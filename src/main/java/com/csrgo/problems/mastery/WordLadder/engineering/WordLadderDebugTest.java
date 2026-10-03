// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordLadder.engineering;

import java.util.*;
import com.csrgo.util.*;

public class WordLadderDebugTest {

    static class Input {
        final String beginWord;
        final String endWord;
        final String[] wordList;

        Input(String beginWord, String endWord, String[] wordList) {
            this.beginWord = beginWord;
            this.endWord = endWord;
            this.wordList = wordList;
        }

        @Override
        public String toString() {
            return "beginWord=" + beginWord + ", endWord=" + endWord + ", wordList=" + Arrays.toString(wordList);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Five Step Ladder",
                new Input("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}),
                5
            ),
            new TestCase<>(
                "End Word Missing In Dictionary",
                new Input("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}),
                0
            ),
            new TestCase<>(
                "Single Character Direct Step",
                new Input("a", "c", new String[]{"a", "b", "c"}),
                2
            ),
            new TestCase<>(
                "No Intermediate Bridge Word",
                new Input("hot", "dog", new String[]{"hot", "dog"}),
                0
            ),
            new TestCase<>(
                "Three Step Path Intermediate Dot",
                new Input("hot", "dog", new String[]{"hot", "dot", "dog"}),
                3
            ),
            new TestCase<>(
                "Two Step Single Letter Change",
                new Input("lost", "cost", new String[]{"most", "fist", "lost", "cost"}),
                2
            ),
            new TestCase<>(
                "Three Step Ladder Talk To Tail",
                new Input("talk", "tail", new String[]{"talk", "task", "tank", "tall", "tail"}),
                3
            ),
            new TestCase<>(
                "Unreachable Disconnected Word",
                new Input("game", "over", new String[]{"gale", "vale", "vole", "over"}),
                0
            ),
            new TestCase<>(
                "Four Step Branch Red To Tax",
                new Input("red", "tax", new String[]{"ted", "tex", "red", "tax", "tad", "den", "rex", "pee"}),
                4
            ),
            new TestCase<>(
                "Totally Disjoint Vocabularies",
                new Input("sand", "acne", new String[]{"slit", "bunk", "wars", "ping", "viva", "wynn", "sand", "acne"}),
                0
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Word Ladder (Debug)",
            testCases,
            input -> WordLadderDebug.solve(input.beginWord, input.endWord, input.wordList.clone()),
            false
        );
    }
}
