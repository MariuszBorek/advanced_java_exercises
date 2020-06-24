package org.oopexercises.zad_7;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void resize(int percent) {
        setRadius(getRadius() * (percent / 100d));
    }
}
