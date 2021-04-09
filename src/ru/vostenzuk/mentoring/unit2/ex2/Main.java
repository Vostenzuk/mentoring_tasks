package ru.vostenzuk.mentoring.unit2.ex2;

/**
 * Задание 2. Наследование
 * Разработайте иерархию канцелярских товаров (достаточно 3 предметов).
 * Создайте “набор новичка“, используя созданную иерархию.
 * Сделать так, чтобы невозможно было создать объект базового класса.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(StarterPack.create());
    }
}
