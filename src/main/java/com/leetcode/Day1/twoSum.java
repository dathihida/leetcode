package com.leetcode.Day1;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    // int[] nums = [1,2,3,4];
    // int target = 3;
    // => output = [0,1] = 3 = target
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        twoSum t = new twoSum();
        t.twoSum(nums, 4);
    }

//    Way 1 --> Brute force -->O(n2)
//    simply check if ith element is making a pair with any of the other element on
//    the right side
//
//    Way 2-->Using Two Pointer approach-->O(n log n )
//    time complexity is nlogn because in this approach,
//    the array will be first sorted and then , two pointer approach will be used
//
//    Way 3-->Using HashMap -->O(n)
//    keep on storing the elements that we reach ,
//    also keep on check if target-element is already present in the hashmap or not ,
//    if it is , then we found a pair

    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for(int j = 0;j < nums.length; i++){
//                if(nums[i] + nums[j] == target){
//                    System.out.println(i + " + " + j);
//                    return new int[] {i, j};
//                }
//            }
//        }
//        int[] seen =nums;
//        for (int i = 0; i < nums.length; i++) {
//            int n = nums[i];
//            int k = target - n;
//            if(k == seen[i]){
//                System.out.println(seen[k]);
//                return new int[] { seen[k], i };
//            }
//            seen[n] = i;
//        }
//        return null;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return null;
    }

}
