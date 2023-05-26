package com.kamko.algorithms.easy;

public class PalindromeNumber { // 9
//    Учитывая целое число x, вернуть true, если x является палиндром, и false в противном случае.
    public static void main(String[] args) {
        int x = 123454321;
        System.out.println(isPalindromeMySolution(x));

        System.out.println(isPalindromeBestSolution(x));

        System.out.println(isPalindromeMySolution2(x));
    }

    static boolean isPalindromeMySolution(int x) {
        String string = String.valueOf(x);
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return string.equals(sb.toString());
    }

    static boolean isPalindromeBestSolution(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reverse = 0;
        int num = x;
        while (num > reverse) {
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }
        return num == reverse / 10 || num == reverse;
    }

    static boolean isPalindromeMySolution2(int x) {
        String intString = String.valueOf(x);
        int len = intString.length();
        for (int i = 0; i < len / 2; i++) {
            if (intString.charAt(i) != intString.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
