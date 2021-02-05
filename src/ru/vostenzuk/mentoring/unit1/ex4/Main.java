package ru.vostenzuk.mentoring.unit1.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Equation equation = new Equation();
        char[] arguments = {'a', 'b', 'c'};

        for (char arg : arguments) {
            System.out.printf("Введите аргумент уравнения %s:\n", arg);
            boolean isCorrectInput = false;

            do {
                try {
                    double argument = scanner.nextDouble();
                    if (arg == 'a') {
                        equation.setA(argument);
                    } else if (arg == 'b') {
                        equation.setB(argument);
                    } else {
                        equation.setC(argument);
                    }
                    isCorrectInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.printf("Аргумент %s должен быть числом.\n", arg);
                    scanner.nextLine();
                }
            } while (!isCorrectInput);
        }

        System.out.println("Решение уравнения:");
        equation.solve().print();
    }
}
