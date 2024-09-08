package com.leetcode.Day4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String last = strs[strs.length-1];
        System.out.println(first);
        System.out.println(last);
        int min_length = Math.min(first.length(),last.length());
        System.out.println(min_length);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<min_length;i++){
            System.out.println(first.charAt(i));
            System.out.println(last.charAt(i));
            if(first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt(i));
                System.out.println(first.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}
