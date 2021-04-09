package ru.vostenzuk.mentoring.unit2.ex5;

/**
 * Задание 5. Lambda-выражения
 * 1. Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение.
 * Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true, если переданное число делится без остатка на 13.
 * 2. Написать функциональный интерфейс с методом, который принимает три дробных числа a, b, c и возвращает тоже дробное число.
 * Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант (D = b^2 — 4ac).
 * 3. Написать функциональный интерфейс с методом, который принимает 2 числа и возвращает их сумму.
 * При этом сделать так, чтобы можно было посчитать сумму чисел типа integer + integer, float + float, double + double.
 * Написать реализации такого интерфейса в виде лямбда-выражений для каждого типа возвращаемого значения.
 */
public class Main {

    public static void main(String[] args) {

        DividableByThirteen div13 = (i) -> (i % 13) ==0;

        System.out.println(div13.isDividableByThirteen(13.00));
        System.out.println(div13.isDividableByThirteen(22));

        Discriminant discriminant = (a, b, c) -> Math.pow(b, 2) - (4 * a * c);
        System.out.println(discriminant.calculate(13.15, 12.25, 11.15));

        Sum sumOfInt = (a, b) -> (int) a + (int) b;
        System.out.println(sumOfInt.count(2,3));
        Sum sumOfFloat = (a, b) -> (float) a + (float) b;
        System.out.println(sumOfFloat.count(1.3f, 1.7f));
        Sum sumOfDouble = (a, b) -> (double) a + (double) b;
        System.out.println(sumOfDouble.count(1.9, 0.1));
    }
}
