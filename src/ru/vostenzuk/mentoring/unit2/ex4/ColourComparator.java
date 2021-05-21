package ru.vostenzuk.mentoring.unit2.ex4;

import ru.vostenzuk.mentoring.unit2.ex2.AbstractDrawingInstrument;

import java.util.Comparator;

public class ColourComparator implements Comparator<AbstractDrawingInstrument> {

  public int compare(AbstractDrawingInstrument o1, AbstractDrawingInstrument o2) {
    return o1.getColour().compareTo(o2.getColour());
  }
}
