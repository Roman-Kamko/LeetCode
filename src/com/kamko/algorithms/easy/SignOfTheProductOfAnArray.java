package com.kamko.algorithms.easy;

public class SignOfTheProductOfAnArray{ // task 1822
    /*Существует функция signFunc(x), которая возвращает:
    1, если х положителен.
    -1, если x отрицательно.
    0, если х равен 0.
    Вам дан целочисленный массив nums.
    Пусть продукт будет произведением всех значений в массиве nums.*/
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        //my solution
        System.out.println(arraySignMySolution(nums));
        //best solution
        System.out.println(arraySignBestSolution(nums));
    }

    static int arraySignMySolution(int[] nums) {
        int counter = 0;
        for (int anInt : nums) {
            if (anInt == 0) {
                return 0;
            }
            if (anInt < 0) {
                counter++;
            }
        }
        if (counter % 2 == 0) {
            return 1;
        }
        return -1;
    }
    //speed: 0ms, memory: 42.4MB

    static int arraySignBestSolution(int[] nums) {
        int len = nums.length;
        int sign = 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                sign *= -1;
            }
        }
        return sign;
        //speed: 0ms, memory: 41.7MB
    }
}
