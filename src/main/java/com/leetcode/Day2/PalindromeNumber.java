package com.leetcode.Day2;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 10;
        int x1 = x/10;
        int x2 = x%10;
        System.out.println(x1 +" "+ x2);
        isPalindrome(10);
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
