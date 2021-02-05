package ru.vostenzuk.mentoring.unit1.ex1;

import java.util.Arrays;

public class WhileDoWhile {

    public static void main(String[] args) {
        int[] array = new int[20];

        // Наполняем массив четными числами
        int i = 0;
        int j = 0;

        while (i < array.length) {
            if (j % 2 == 0) {
                array[i] = j;
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(array));

        // Умножаем каждый второй элемент на предыдущий
        int k = 1;
        do {
            if (k % 2 != 0) {
                array[k] = array[k - 1] * array[k];
            }
            k++;
        } while (k < array.length);

        System.out.println(Arrays.toString(array));
    }
}
