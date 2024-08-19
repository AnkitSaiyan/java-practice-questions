package com.questions.maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(898) ? "Yes" : "No");
        System.out.println(isPalindrome(-898) ? "Yes" : "No");
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return  false;
        }

        int rev = 0;
        int temp = x;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == x;
    }
}
