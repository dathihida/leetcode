package com.leetcode.Day4;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("III");
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i<s.length()-1&&map.get(c)<map.get(s.charAt(i+1))){
                sum+=map.get(s.charAt(i+1))-map.get(c);
                i++;
            }
            else{
                sum+=map.get(c);
            }
        }
        return sum;
    }
}
