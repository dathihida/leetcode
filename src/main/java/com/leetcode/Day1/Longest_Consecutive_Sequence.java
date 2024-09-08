package com.leetcode.Day1;

import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(arr.length);
        Longest_Consecutive_Sequence obj = new Longest_Consecutive_Sequence();
        obj.longestConsecutive(arr);
    }

    // 100, 4, 200, 1, 3, 2
    // 100 > 4
    // index = 100;
    //
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        return nums.length;
    }
}
