package com.questions.array;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringInAnArray {
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[] {"d","b","c","b","c","a"}, 2));
        System.out.println(kthDistinct(new String[]{"aaa", "aa", "a", "aaa"}, 1));
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String str : arr) {
            Integer count = countMap.get(str);
            if (count == null) {
                count = 0;
            }
            countMap.put(str, count + 1);
        }

        if (countMap.size() < k) {
            return "";
        }

        for (String str : arr) {
            if (countMap.get(str) == 1) {
                k--;
            }

            if (k == 0) {
                return str;
            }
        }

        return "";
    }
}
