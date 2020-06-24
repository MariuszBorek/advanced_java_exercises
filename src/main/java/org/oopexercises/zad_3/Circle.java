package org.oopexercises.zad_3;

public class Circle extends Shape {
    private float radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(String color, boolean isFiled, float radius) {
        super(color, isFiled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius= " + radius;
    }
}
