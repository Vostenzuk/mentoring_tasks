package ru.vostenzuk.mentoring.unit2.ex2;

public abstract class AbstractDrawingInstrument {

    private String colour;
    private double price;
    private boolean erasable;

    public AbstractDrawingInstrument(String colour, double price, boolean erasable) {
        this.colour = colour;
        this.price = price;
        this.erasable = erasable;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isErasable() {
        return erasable;
    }

    public void setErasable(boolean erasable) {
        this.erasable = erasable;
    }

    public abstract void drawDot(double x, double y);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", erasable=" + erasable +
                '}';
    }
}
