package ru.vostenzuk.mentoring.unit2.ex2;

public class PencilWithEraser extends Pencil {

    private boolean canErase;

    public PencilWithEraser(String colour, double price) {
        super(colour, price);
        boolean canErase = true;
    }


    public boolean canErase() {
        return canErase;
    }

    public void setCanErase(boolean canErase) {
        this.canErase = canErase;
    }

    @Override
    public void drawDot(double x, double y) {
        System.out.printf("Drew a dot on point %f, %f with erasable %s pencil", x, y, super.getColour());
    }

    public void useEraser(double x, double y) {
        System.out.printf("Used eraser on point %f,%f. It will be erased if erasable.", x, y);
    }

}
