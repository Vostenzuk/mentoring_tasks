package ru.vostenzuk.mentoring.unit1.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] arguments = {'a', 'b', 'h'};
        double[] argumentValues = new double[3];

        boolean correctInput = false;
        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Введите значение аргумента %s:\n", arguments[i]);
            do {
                try {
                    argumentValues[i] = in.nextDouble();
                    correctInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Нужно ввести число.");
                    in.nextLine();
                }
            } while (!correctInput);
        }

        System.out.printf("Отрезок: %f, %f\n", argumentValues[0], argumentValues[1]);
        System.out.printf("Шаг: %f\n", argumentValues[2]);

        double a = argumentValues[0];
        double b = argumentValues[1];
        double h = argumentValues[2];

        double x = a;

        System.out.println("_______________________");
        System.out.println("|Значение X|Значение Y|");
        System.out.println("-----------------------");
        while (x <= b) {
            double y = Math.tan(2 * x) - 3;
            System.out.format("|%10g|%10g|\n", x, y);
            //            System.out.printf("|%.3f     |%.3f    |\n", x, y);
            x += h;
        }
        System.out.println("-----------------------");
    }
}
