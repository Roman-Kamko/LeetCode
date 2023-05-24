package com.kamko.algorithms.easy;

import java.util.Arrays;

public class TwoSum { // task 1
    /*Учитывая массив целых чисел nums и целочисленную цель, вернуть индексы двух чисел так,
    чтобы они складывались в цель.
    Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете
    использовать один и тот же элемент дважды.
    Вы можете вернуть ответ в любом порядке.*/
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //my solution
        System.out.println(Arrays.toString(twoSumMySolution(nums, target)));
        //best solution
        System.out.println(Arrays.toString(twoSumBestSolution(nums, target)));
    }

    static int[] twoSumMySolution(int[] nums, int target) {
        int result;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                result = nums[i] + nums[j];
                if (result == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
        // Speed = 84ms, Memory = 43,9MB
    }

    static int[] twoSumBestSolution(int[] nums, int target) {
        int i = 0;
        int j = 1;
        int gap = 1;
        int[] result = new int[2];
        while (true) {
            if (nums[i] == target - nums[j]) {
                result[0] = i;
                result[1] = j;
                //System.gc();
                break;
            } else if (j == nums.length - 1) {
                i = 0;
                gap++;
                j = gap;
            } else {
                i++;
                j++;
            }
        }
        //System.gc();
        return result;
        // Speed = 0ms(2mc with System.gc()), Memory = 43,4MB(42,1MB with System.gc())
    }
}
