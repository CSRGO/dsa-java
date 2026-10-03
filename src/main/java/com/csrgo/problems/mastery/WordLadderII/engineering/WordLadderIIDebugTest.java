// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordLadderII.engineering;

import java.util.*;
import com.csrgo.util.*;

public class WordLadderIIDebugTest {

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

        List<TestCase<Input, List<List<String>>>> testCases = List.of(
            new TestCase<>(
                "Two Shortest Paths Of Length Five",
                new Input("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}),
                List.of(
                    List.of("hit", "hot", "dot", "dog", "cog"),
                    List.of("hit", "hot", "lot", "log", "cog")
                )
            ),
            new TestCase<>(
                "End Word Missing In Dictionary",
                new Input("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}),
                List.of()
            ),
            new TestCase<>(
                "Single Step Direct Transformation",
                new Input("a", "c", new String[]{"a", "b", "c"}),
                List.of(List.of("a", "c"))
            ),
            new TestCase<>(
                "No Intermediate Bridge Word",
                new Input("hot", "dog", new String[]{"hot", "dog"}),
                List.of()
            ),
            new TestCase<>(
                "Single Path Via Intermediate Dot",
                new Input("hot", "dog", new String[]{"hot", "dot", "dog"}),
                List.of(List.of("hot", "dot", "dog"))
            ),
            new TestCase<>(
                "Single Step Cost Replacement",
                new Input("lost", "cost", new String[]{"most", "fist", "lost", "cost"}),
                List.of(List.of("lost", "cost"))
            ),
            new TestCase<>(
                "Talk To Tail Single Optimal Path",
                new Input("talk", "tail", new String[]{"talk", "task", "tank", "tall", "tail"}),
                List.of(List.of("talk", "tall", "tail"))
            ),
            new TestCase<>(
                "Disconnected Target Word",
                new Input("game", "over", new String[]{"gale", "vale", "vole", "over"}),
                List.of()
            ),
            new TestCase<>(
                "Four Word Unique Transformation Chain",
                new Input("red", "tax", new String[]{"ted", "tex", "red", "tax", "tad", "den", "rex", "pee"}),
                List.of(List.of("red", "ted", "tex", "tax"))
            ),
            new TestCase<>(
                "Direct Vowel Mutation Single Path",
                new Input("bat", "bit", new String[]{"bat", "bit", "bet"}),
                List.of(List.of("bat", "bit"))
            )
        );

        TestRunner<Input, List<List<String>>> runner = new TestRunner<>();

        runner.runTests(
            "Word Ladder II (Debug)",
            testCases,
            input -> WordLadderIIDebug.solve(input.beginWord, input.endWord, input.wordList.clone()),
            false
        );
    }
}
