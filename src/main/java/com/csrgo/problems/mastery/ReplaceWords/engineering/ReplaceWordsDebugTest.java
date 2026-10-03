// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReplaceWords.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ReplaceWordsDebugTest {

    static class Input {
        final List<String> dictionary;
        final String sentence;

        Input(List<String> dictionary, String sentence) {
            this.dictionary = dictionary;
            this.sentence = sentence;
        }

        @Override
        public String toString() {
            return "dict=" + dictionary + ", sentence=\"" + sentence + "\"";
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, String>> testCases = List.of(
            new TestCase<>("Classic Prefix Replacement", new Input(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"), "the cat was rat by the bat"),
            new TestCase<>("Single Letter Roots", new Input(List.of("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"), "a a b c"),
            new TestCase<>("No Matching Roots", new Input(List.of("dog", "wolf"), "the cat jumped over the fence"), "the cat jumped over the fence"),
            new TestCase<>("Overlapping Roots Shortest Priority", new Input(List.of("c", "ca", "cat"), "cattle caterpillars cater"), "c c c"),
            new TestCase<>("Exact Match Words", new Input(List.of("car", "plane"), "car plane bike"), "car plane bike"),
            new TestCase<>("Single Word In Sentence", new Input(List.of("pre", "post"), "prefix"), "pre"),
            new TestCase<>("Empty Dictionary", new Input(List.of(), "unchanged sentence test"), "unchanged sentence test"),
            new TestCase<>("Substrings That Are Not Prefixes", new Input(List.of("ing", "ed"), "walking jumped playing"), "walking jumped playing"),
            new TestCase<>("Multiple Identical Roots Different Words", new Input(List.of("un"), "unhappy unusual undo redo"), "un un un redo"),
            new TestCase<>("Long Sentence Complex Roots", new Input(List.of("micro", "tele", "inter"), "microscope telephone international computer"), "micro tele inter computer")
        );

        TestRunner<Input, String> runner = new TestRunner<>();

        runner.runTests(
            "Replace Words (DEBUG)",
            testCases,
            input -> ReplaceWordsDebug.solve(input.dictionary, input.sentence),
            false
        );
    }
}
