package org.oopexercises.zad_6;

public class MovableCircle implements Movable {

    private double radius;
    MovablePoint movablePoint = new MovablePoint();

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setMovablePoint(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
//        movablePoint.setY(movablePoint.getY() + movablePoint.getySpeed());
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
//        movablePoint.setY(movablePoint.getY() - movablePoint.getySpeed());
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
//        movablePoint.setX(movablePoint.getX() - movablePoint.getxSpeed());
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
//        movablePoint.setX(movablePoint.getX() + movablePoint.getxSpeed());
    }
}
