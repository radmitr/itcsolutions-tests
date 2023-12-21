package ru.radmitr.itcsolutions.tests.level2.task1;

import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        String sorted = new String(chars);
        return Integer.parseInt(sorted);
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }
}
