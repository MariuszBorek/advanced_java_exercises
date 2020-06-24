package org.oopexercises.zad_3;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(String color, boolean isFiled, double size) {
        super(color, isFiled, size, size);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
