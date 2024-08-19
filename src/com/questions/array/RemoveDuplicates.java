package com.questions.array;

// Array is sorted

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            unique.add(nums[i]);
        }

        int i = 0;
        for (Integer item : unique) {
            nums[i++] = item;
        }

        return unique.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println(k);
        System.out.println(Arrays.toString(arr));
    }
}
