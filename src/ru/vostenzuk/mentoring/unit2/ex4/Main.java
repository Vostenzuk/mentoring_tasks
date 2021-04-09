package ru.vostenzuk.mentoring.unit2.ex4;

import ru.vostenzuk.mentoring.unit2.ex2.AbstractDrawingInstrument;
import ru.vostenzuk.mentoring.unit2.ex2.Pen;
import ru.vostenzuk.mentoring.unit2.ex2.StarterPack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Задание 4. Сортировка
 * Используйте “набор новичка“, созданные в задании 2 (или любую другую коллекцию объектов);
 * отсортируйте вещи в этом наборе:
 * по стоимости,
 * по наименованию,
 * по стоимости и наименованию.
 */
public class Main {

    public static void main(String[] args) {
        StarterPack starterPack = StarterPack.create();
        List<AbstractDrawingInstrument> instruments = new ArrayList<>(starterPack.getItems());

        System.out.println("Before sorting: " + instruments);
        instruments.sort(Comparator.comparing(AbstractDrawingInstrument::getPrice));
        System.out.println("After sorting by price: " + instruments);

        instruments.sort(Comparator.comparing(AbstractDrawingInstrument::getColour));
        System.out.println("Sorted by colour: " + instruments);


        instruments.add(new Pen("red", 10.0)); // item with same price to test sorting by colour after price

        instruments.sort(Comparator.comparing(AbstractDrawingInstrument::getPrice).thenComparing(AbstractDrawingInstrument::getColour));
        System.out.println("Sorted by price and then colour: " + instruments);
    }
}
