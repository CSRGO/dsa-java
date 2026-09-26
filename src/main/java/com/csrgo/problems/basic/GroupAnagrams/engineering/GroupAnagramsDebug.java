// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.GroupAnagrams.engineering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Problem Link: https://dsa.csrgo.com/problems/group-anagrams/
public class GroupAnagramsDebug {

    // TODO: debug this method to fix it
    public static List<List<String>> solve(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] ca = s.toCharArray();
            // Bug 1: Missing Arrays.sort(ca) leaves characters unsorted, preventing canonical matching

            // Bug 2: Invoking ca.toString() returns array identity string ([C@...) rather than string content
            String key = ca.toString();

            // Bug 3: Overwrites existing bucket rather than appending to accumulated anagram list
            List<String> bucket = new ArrayList<>();
            bucket.add(s);
            map.put(key, bucket);
        }

        return new ArrayList<>(map.values());
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solve(strs);
        System.out.println("Result: " + result);
    }
}
