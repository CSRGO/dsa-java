// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SearchSuggestionsSystem.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SearchSuggestionsSystemTest {

    static class Input {
        final String[] products;
        final String searchWord;

        Input(String[] products, String searchWord) {
            this.products = products;
            this.searchWord = searchWord;
        }

        @Override
        public String toString() {
            return "products=" + Arrays.toString(products) + ", searchWord=" + searchWord;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, List<List<String>>>> testCases = List.of(
            new TestCase<>("Five Products Mouse Search", new Input(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"), List.of(List.of("mobile", "moneypot", "monitor"), List.of("mobile", "moneypot", "monitor"), List.of("mouse", "mousepad"), List.of("mouse", "mousepad"), List.of("mouse", "mousepad"))),
            new TestCase<>("Single Match Havana", new Input(new String[]{"havana"}, "havana"), List.of(List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana"))),
            new TestCase<>("No Matches For Query", new Input(new String[]{"bags", "baggage", "banner", "box", "cloths"}, "bags"), List.of(List.of("baggage", "bags", "banner"), List.of("baggage", "bags", "banner"), List.of("baggage", "bags"), List.of("bags"))),
            new TestCase<>("Completely Mismatched Word", new Input(new String[]{"havana"}, "tatiana"), List.of(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of())),
            new TestCase<>("Three Elements Exact Match", new Input(new String[]{"code", "coder", "coding"}, "cod"), List.of(List.of("code", "coder", "coding"), List.of("code", "coder", "coding"), List.of("code", "coder", "coding"))),
            new TestCase<>("Single Character Search", new Input(new String[]{"apple", "app", "apricot", "banana"}, "a"), List.of(List.of("app", "apple", "apricot"))),
            new TestCase<>("Four Identical Prefix Products", new Input(new String[]{"testa", "testb", "testc", "testd"}, "test"), List.of(List.of("testa", "testb", "testc"), List.of("testa", "testb", "testc"), List.of("testa", "testb", "testc"), List.of("testa", "testb", "testc"))),
            new TestCase<>("Alphabetical Ordering Tiebreaker", new Input(new String[]{"zebra", "ant", "bear"}, "b"), List.of(List.of("bear"))),
            new TestCase<>("Prefix Extends Beyond Products", new Input(new String[]{"cat", "car"}, "catalog"), List.of(List.of("car", "cat"), List.of("car", "cat"), List.of("cat"), List.of(), List.of(), List.of(), List.of())),
            new TestCase<>("Short Two Letter Search", new Input(new String[]{"in", "into", "inside", "inn"}, "in"), List.of(List.of("in", "inn", "inside"), List.of("in", "inn", "inside")))
        );

        TestRunner<Input, List<List<String>>> runner = new TestRunner<>();

        runner.runTests(
            "Search Suggestions System",
            testCases,
            input -> SearchSuggestionsSystem.solve(input.products, input.searchWord),
            true
        );
    }
}
