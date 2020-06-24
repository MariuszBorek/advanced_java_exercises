package org.oopexercises.zad_5;

import org.oopexercises.zad_1.Point2D;

public class App {
    public static void main(String[] args) {
        Point2D pointA = new Point2D(6, 7);
        Point2D pointB = new Point2D(4, 9);
        Line line = new Line(pointA, pointB);
        System.out.println("length of line = " + line.getLengthLine());
        System.out.println("middle point: " + line.getMiddlePoint());

        System.out.println();

        Line lineSe = new Line(6,7,4,9);
        System.out.println("length of line = " + lineSe.getLengthLine());
        System.out.println("middle point: " + lineSe.getMiddlePoint());


    }
}
