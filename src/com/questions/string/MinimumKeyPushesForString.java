/*
    Program to map english alphabets in a keypad phone in such a way that for the given string
    we will have to do minimum presses. Sample KeyPad

    1      2      3
         (abc)  (def)
    4      5      3
  (ghi)  (jkl)  (mno)
    7      8      9
  (pqr)  (stuv) (wxyz)
    *      0      #

    We can only assign 2 to 9
*/
package com.questions.string;

import java.util.*;

public class MinimumKeyPushesForString {
    public static void main(String[] args) {
        System.out.println(minimumPushes("abcdefghijklmnopqrstuvwx"));
    }

    private static int minimumPushes(String word) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        String[] w = new String[] { "sa", "as"};
        System.out.println(w[0].charAt(1));

        // calculating count
        for (char c : word.toCharArray()) {
             countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(countMap.values());
        // Sorting by their count to assign most repeated letters first
        counts.sort(Collections.reverseOrder());

        int cost = 0;
        int index = 0;
        // Since max 8 keys can be assigned, so using division to find the position of the letter
        for (int count : counts) {
            cost += count * ((index++ / 8) + 1);
        }

        return cost;
    }
}
