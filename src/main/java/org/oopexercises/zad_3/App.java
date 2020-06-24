package org.oopexercises.zad_3;

public class App {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[10];
        shapes[0] = new Square("red", true, 5);
        shapes[1] = new Square();
        shapes[2] = new Square("purple", true, 2);
        shapes[3] = new Rectangle("yellow", false, 3, 4);
        shapes[4] = new Rectangle();
        shapes[5] = new Rectangle("green", false, 20, 10);
        shapes[6] = new Circle();
        shapes[7] = new Circle("black", true, 6);
        shapes[8] = new Circle();
        shapes[9] = new Circle("white", true, 2);

        System.out.println("\nlista figur");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("\nwypisz kolory figur");
        for (Shape shape : shapes) {
            System.out.println(shape.getColor());
        }

        System.out.println("\nwypisz tylko kwadraty");
        for (Shape sq : shapes) {
            if (sq instanceof Square) {
                System.out.println(sq.toString());
            }
        }

        System.out.println("\nwypisz tylko koła");
        for (Shape cir : shapes) {
            if (cir instanceof Circle) {
                System.out.println(cir.toString());
            }
        }

        System.out.println(shapes[0].getColor());
        System.out.println(shapes[0].isFilled());
        System.out.println(shapes[0].toString());
        System.out.println(shapes[0].getArea());
        System.out.println(shapes[0].getPerimeter());

        System.out.println("metody kwadratu");
        ((Square)shapes[1]).setLength(5);
        ((Square)shapes[1]).setWidth(3);
        System.out.println(shapes[1].getArea());
        System.out.println(shapes[1].getPerimeter());
        System.out.println();
        ((Square)shapes[1]).setWidth(3);
        ((Square)shapes[1]).setLength(5);
        System.out.println(shapes[1].getArea());
        System.out.println(shapes[1].getPerimeter());


    }
}