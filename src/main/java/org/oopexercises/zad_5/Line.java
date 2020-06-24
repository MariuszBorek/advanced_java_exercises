package org.oopexercises.zad_5;

import org.oopexercises.zad_1.Point2D;

public class Line {
    private Point2D pointA, pointB;

    public Line(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }


    public Line(float xA, float yA, float xB, float yB) {
        this.pointA = new Point2D(xA, yA);
        this.pointB = new Point2D(xB, yB);
    }

    public Point2D getPointA() {
        return pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }

    public void setX(Point2D pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point2D pointB) {
        this.pointB = pointB;
    }

    public double getLengthLine() {
        return Math.sqrt((Math.pow((getPointB().getX() - getPointA().getX()), 2)) + (Math.pow((getPointB().getY() - getPointA().getY()), 2)));
    }

    public Point2D getMiddlePoint() {
        float xMiddle = (getPointA().getX() + getPointA().getY()) / 2;
        float yMiddle = (getPointB().getX() + getPointB().getY()) / 2;
        Point2D middlePoint = new Point2D(xMiddle, yMiddle);
        return middlePoint;
    }
}
