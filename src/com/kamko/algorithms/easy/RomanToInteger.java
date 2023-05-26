package com.kamko.algorithms.easy;

import java.util.Map;

public class RomanToInteger { // 13
    // написать программу, которая конвертирует римские цифры в инт
    public static void main(String[] args) {
        String x = "XIV";

        System.out.println(romanToIntMySolution(x));
        System.out.println(romanToIntBestSolution(x));
    }

    static int romanToIntMySolution(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

    static int romanToIntBestSolution(String s) {
        int result = 0;
        int value = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> value = 1;
                case 'V' -> value = 5;
                case 'X' -> value = 10;
                case 'L' -> value = 50;
                case 'C' -> value = 100;
                case 'D' -> value = 500;
                case 'M' -> value = 1000;
            }
            if (4 * value < result) result -= value;
            else result += value;
        }
        return result;
    }
}
