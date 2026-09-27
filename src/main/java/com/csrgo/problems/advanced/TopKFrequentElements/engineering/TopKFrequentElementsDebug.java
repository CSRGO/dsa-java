// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TopKFrequentElements.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/top-k-frequent-elements/
public class TopKFrequentElementsDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i = i + 1) {
            int count = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], count);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));

        for (int key : map.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i = i + 1) {
            result[i] = minHeap.poll();
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Top K Frequent Elements (Debug) ====");
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = solve(nums, k);

        System.out.println("------------------------");
        System.out.println("Top K Frequent: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
