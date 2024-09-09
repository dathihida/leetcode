package com.leetcode.Day3;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        int index = lengthOfLongestSubstring("pwwkew");
        int index1 = lengthOfLongestSubstring("abcabcbb");
        System.out.println(index);
        System.out.println(index1);
    }

    public static int lengthOfLongestSubstring(String s) {
        // add dk charAt(i) == charAt(j)
//        String s1 = "";
//        for(int i = 0; i < s.length(); i++) {
//            String str = Character.toString(s.charAt(i));
//            if(!s1.contains(str)){
//                s1 = s1 + s.charAt(i);
//            }
//        }
//        System.out.println(s1);
//        return Integer.parseInt(String.valueOf(s1.length()));

        // => p => w
        // w == w => delete string [p, w] => save string [w]
        // => k => e
        // string [w, k, e] ss => w
        // exit w => delete string w => string w, k, e.

        // w= 119, k= 107, e=101
        // x= w-12, x= w-12-6
        // 119 = x
        // 107 = x - 12
        // 101 = x - 12 - 6 = x -18
        // 12 = 119 - 107 => n = 12(buoc nhay)
        // 6 = 107 - 101 => n = 6(buoc nhay)

        // a= 97, b= 98, c= 99
        // a = 97
        // 1 = 98(b) - 97 => n = 1(buoc nhay)
        // 1 = 99(c) - 98 => n = 1(buoc nhay)
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            for(int j = 1; j < s.length(); j++){
                System.out.println(s.charAt(j));
                if(s.charAt(j) - s.charAt(i) == 1){
                    list.add(j);
                }

            }
        }
        System.out.println(list);
        return list.size();
    }
}
