package org.oopexercises.zad_7;

public class App {
    public static void main(String[] args) {

        GeometricObject geometricObject = new Circle(10);

        System.out.println("normal circle:");
        System.out.println(((Circle)geometricObject).getRadius());
        System.out.println("pole koła: " + geometricObject.getArea());
        System.out.println("obw koła: " + geometricObject.getPerimeter());

        System.out.println("\nresized circle:");
        Resizable resizable = new ResizableCircle(10);
        resizable.resize(80);
        System.out.println(((ResizableCircle)resizable).getRadius());
        System.out.println(((ResizableCircle)resizable).getArea());
        System.out.println(((ResizableCircle) resizable).getPerimeter());







    }
}
