package ru.vostenzuk.mentoring.unit2.ex2;

public class Pencil extends AbstractDrawingInstrument {

  public Pencil(String colour, double price) {
    super(colour, price, true);
  }

  @Override
  public void drawDot(double x, double y) {
    System.out
        .printf("Drew a dot on point %f, %f with erasable %s pencil", x, y, super.getColour());
  }

}
