// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GetCommonElementsII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/get-common-elements-ii/
public class GetCommonElementsIIDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] a1, int[] a2) {
        if (a1 == null || a2 == null || a1.length == 0 || a2.length == 0) {
            return null;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < a1.length - 1; i = i + 1) {
            int count = freq.getOrDefault(a1[i], 0) + 1;
            freq.put(a1[i], count);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a2.length; i = i + 1) {
            int count = freq.getOrDefault(a2[i], 0);
            if (count > 0) {
                list.add(a2[i]);
                freq.put(a2[i], count);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i = i + 1) {
            result[i] = list.get(i);
        }
        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Get Common Elements II (Debug) ====");
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < n1; i = i + 1) {
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < n2; i = i + 1) {
            a2[i] = sc.nextInt();
        }

        int[] result = solve(a1, a2);

        System.out.println("------------------------");
        System.out.println("Common Elements: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
