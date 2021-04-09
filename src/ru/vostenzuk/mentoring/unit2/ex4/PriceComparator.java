package ru.vostenzuk.mentoring.unit2.ex4;

import ru.vostenzuk.mentoring.unit2.ex2.AbstractDrawingInstrument;

import java.util.Comparator;

public class PriceComparator implements Comparator<AbstractDrawingInstrument> {
    @Override
    public int compare(AbstractDrawingInstrument o1, AbstractDrawingInstrument o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
