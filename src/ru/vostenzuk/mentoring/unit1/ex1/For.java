package ru.vostenzuk.mentoring.unit1.ex1;

import java.util.Arrays;

public class For {

    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            array[i] = array[i] * array[i - 1];
        }

        System.out.println(Arrays.toString(array));
    }
}
