package org.oopexercises.zad_3;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        length = 1;
        width = 1;
    }

    public Rectangle(String color, boolean isFiled, double width, double length) {
        super(color, isFiled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return super.toString() + ", length= " + length + ", width= " + width;
    }
}
