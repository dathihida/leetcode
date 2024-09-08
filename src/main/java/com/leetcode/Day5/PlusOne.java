package com.leetcode.Day5;

import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        plusOne(new int[] { 9,8,7,6,5,4,3,2,1,0 });
        plusOne(new int[] { 9,9 });
        plusOne(new int[] { 9 });
        int numberMin = findNumberMin(new int[]{12, 23, 5, 75, 42});
        System.out.println(numberMin);
        int numberMax = findNumberMax(new int[]{12, 23, 5, 75, 42});
        System.out.println(numberMax);
        int[] sort = sortNumbers(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(Arrays.toString(sort));
    }

    public static int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] == 9){
                System.out.println("1,0");
                return new int[] { 1,0 };
            }

            if(digits[i] == 9 && digits[i-1] == 9) {
                System.out.println("1,0,0");
                return new int[] { 1,0,0 };
            }


            if(digits[i] == 9 && digits[i-1] != 9) {
                digits[i] = 0;
                digits[i-1] = digits[i -1] + 1;
                break;
            }else{
                digits[i] = digits[i] + 1;
                break;
            }
        }
//        int left = 0;
//        int right = digits.length - 1;
//        while(left < right) {
//            int temp1 = digits[left];
//            digits[left] = digits[right];
//            digits[right] = temp1;
//            left++;
//            right--;
//        }
        System.out.println(Arrays.toString(digits));
        return digits;
    }

    public static int findNumberMin(int[] digits) {
        int min = digits[0];
        for(int i = 1; i< digits.length; i++){
            if(digits[i] < min){
                min = digits[i];
            }
        }
        return min;
    }

    public static int findNumberMax(int[] digits) {
        int max = digits[0];
        for(int i = 1; i< digits.length; i++){
            if(digits[i] > max){
                max = digits[i];
            }
        }
        return max;
    }

    public static int[] sortNumbers(int[] numbers) {
        int m = 0;
        int n = numbers.length-1;
        for(int i = 1; i<numbers.length; i++){
            if(numbers[i] > m){
                int temp = numbers[i];
                numbers[m] = numbers[n];
                numbers[n] = temp;
                m++;
                n--;
            }
        }
        return numbers;
    }
}
