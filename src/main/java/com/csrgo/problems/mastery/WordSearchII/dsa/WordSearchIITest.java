// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WordSearchII.dsa;

import java.util.*;
import com.csrgo.util.*;

public class WordSearchIITest {

    static class Input {
        final char[][] board;
        final String[] words;

        Input(char[][] board, String[] words) {
            this.board = board;
            this.words = words;
        }

        @Override
        public String toString() {
            return "board=" + Arrays.deepToString(board) + ", words=" + Arrays.toString(words);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, List<String>>> testCases = List.of(
            new TestCase<>("Classic 4x4 Board", new Input(new char[][]{{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}}, new String[]{"oath","pea","eat","rain"}), List.of("eat", "oath")),
            new TestCase<>("No Valid Words On 2x2", new Input(new char[][]{{'a','b'},{'c','d'}}, new String[]{"abcb"}), List.of()),
            new TestCase<>("Single Cell Match", new Input(new char[][]{{'a'}}, new String[]{"a"}), List.of("a")),
            new TestCase<>("Single Cell No Match", new Input(new char[][]{{'a'}}, new String[]{"b"}), List.of()),
            new TestCase<>("All Words Present", new Input(new char[][]{{'a','b'},{'a','a'}}, new String[]{"aba","baa","bab","aa","aaa"}), List.of("aa", "aaa", "aba", "baa")),
            new TestCase<>("Linear Horizontal Word", new Input(new char[][]{{'c','a','t'}}, new String[]{"cat", "car"}), List.of("cat")),
            new TestCase<>("Linear Vertical Word", new Input(new char[][]{{'d'},{'o'},{'g'}}, new String[]{"dog", "god"}), List.of("dog", "god")),
            new TestCase<>("Corner Wrap Around", new Input(new char[][]{{'a','b'},{'d','c'}}, new String[]{"abcd", "cda"}), List.of("abcd", "cda")),
            new TestCase<>("Duplicate Letters Required", new Input(new char[][]{{'a','a'},{'a','a'}}, new String[]{"aaaaa"}), List.of()),
            new TestCase<>("Non-Overlapping Words", new Input(new char[][]{{'a','b','c'},{'d','e','f'}}, new String[]{"ad", "cf", "be"}), List.of("ad", "be", "cf"))
        );

        TestRunner<Input, List<String>> runner = new TestRunner<>();

        runner.runTests(
            "Word Search II",
            testCases,
            input -> WordSearchII.solve(input.board, input.words),
            true
        );
    }
}
