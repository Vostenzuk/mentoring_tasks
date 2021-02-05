package ru.vostenzuk.mentoring.unit1.ex3;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int[][] twoDimensionalArray = new int[5][8];

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = rand.nextInt(100);
            }
        }

        int[][] resultArray = new int[5][2];

        for (int row = 0; row < twoDimensionalArray.length; row++) {
            int smallest, biggest;
            smallest = biggest = twoDimensionalArray[row][0];

            for (int value : twoDimensionalArray[row]) {
                smallest = Math.min(value, smallest);
                biggest = Math.max(value, biggest);
            }
            resultArray[row][0] = smallest;
            resultArray[row][1] = biggest;
        }

        System.out.println(Arrays.deepToString(twoDimensionalArray));
        System.out.println(Arrays.deepToString(resultArray));
    }
}
