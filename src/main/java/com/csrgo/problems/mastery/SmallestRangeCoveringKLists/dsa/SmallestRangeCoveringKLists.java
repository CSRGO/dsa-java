// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SmallestRangeCoveringKLists.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/smallest-range-covering-k-lists/
public class SmallestRangeCoveringKLists {

    public static int[] solve(int[][] nums) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Smallest Range Covering K Lists ====");
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
