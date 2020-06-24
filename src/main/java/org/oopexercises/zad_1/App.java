package org.oopexercises.zad_1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2DParameters = new Point2D(3, 5);

        System.out.println("Point2D Class");
        System.out.println(point2DParameters.getX());
        System.out.println(Arrays.toString(point2DParameters.getXY()));
        System.out.println(point2DParameters.getY());
        point2DParameters.setX(9);
        point2DParameters.setY(4);
        System.out.println(point2DParameters.toString());
        point2DParameters.setXY(7,8);
        System.out.println(point2DParameters.toString());

        System.out.println("\nPoint3D Class");
        Point3D point3D = new Point3D(4, 7,2);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        System.out.println(point3D.toString());
        point3D.setX(9);
        point3D.setY(9);
        point3D.setZ(9);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());
    }
}
