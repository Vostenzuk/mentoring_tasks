package ru.vostenzuk.mentoring.unit2.ex2;

public class Pen extends AbstractDrawingInstrument {

    public Pen(String colour, double price) {
        super(colour, price, false);
    }

    @Override
    public void drawDot(double x, double y) {
        System.out.printf("Drew a dot on point %f, %f with non-erasable %s pen", x, y, super.getColour());
    }
}
