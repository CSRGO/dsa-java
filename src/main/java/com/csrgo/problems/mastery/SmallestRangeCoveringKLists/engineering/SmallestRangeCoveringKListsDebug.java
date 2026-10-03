// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SmallestRangeCoveringKLists.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/smallest-range-covering-k-lists/
public class SmallestRangeCoveringKListsDebug {

    static class Element {
        int val;
        int listIndex;
        int elemIndex;

        Element(int val, int listIndex, int elemIndex) {
            this.val = val;
            this.listIndex = listIndex;
            this.elemIndex = elemIndex;
        }
    }

    // TODO: debug this method to fix it
    public static int[] solve(int[][] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        PriorityQueue<Element> pq = new PriorityQueue<>(new Comparator<Element>() {
            @Override
            public int compare(Element a, Element b) {
                return Integer.compare(b.val, a.val);
            }
        });

        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i = i + 1) {
            pq.offer(new Element(nums[i][0], i, 0));
            currentMax = Math.max(currentMax, nums[i][0]);
        }

        int startRange = -1000000;
        int endRange = 1000000;

        while (pq.size() == nums.length) {
            Element curr = pq.poll();

            if (curr.elemIndex + 1 < nums[curr.listIndex].length) {
                int nextVal = nums[curr.listIndex][curr.elemIndex + 1];
                currentMax = Math.max(currentMax, nextVal);
                pq.offer(new Element(nextVal, curr.listIndex, curr.elemIndex + 1));
            }

            if (currentMax - curr.val > endRange - startRange) {
                startRange = curr.val;
                endRange = currentMax;
            }
        }

        return new int[]{startRange, endRange};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Smallest Range Covering K Lists Debug ====");
        System.out.print("Enter number of lists k: ");
        int k = Integer.parseInt(sc.nextLine().trim());

        int[][] nums = new int[k][];
        for (int i = 0; i < k; i = i + 1) {
            System.out.print("Enter elements for list " + (i + 1) + " (space-separated sorted integers): ");
            String[] tokens = sc.nextLine().trim().split("\\s+");
            nums[i] = new int[tokens.length];
            for (int j = 0; j < tokens.length; j = j + 1) {
                nums[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        int[] range = solve(nums);
        System.out.println("Smallest Range: " + Arrays.toString(range));
    }
}
