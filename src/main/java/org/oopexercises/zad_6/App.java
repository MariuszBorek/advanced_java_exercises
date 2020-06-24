package org.oopexercises.zad_6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Movable[] move = new Movable[2];
        move[0] = new MovablePoint();
        move[1] = new MovableCircle();

        ((MovablePoint)move[0]).setxSpeed(1);
        ((MovablePoint)move[0]).setySpeed(1);

        // increase, reduce: x or y
        String button;
        /*
        while(true) {
            button = in.next();
            switch (button) {
                case "w":
                    move[0].moveUp();
                    break;
                case "s":
                    move[0].moveDown();
                    break;
                case "a":
                    move[0].moveLeft();
                    break;
                case "d":
                    move[0].moveRight();
                    break;
                default:
                    return;
            }
            System.out.println("aktualne położenie punktu (" +
                    ((MovablePoint)move[0]).getX() +
                    ", " +
                    ((MovablePoint)move[0]).getY() + ")");
        }
         */

        ((MovableCircle)move[1]).movablePoint.setxSpeed(2);
        ((MovableCircle)move[1]).movablePoint.setySpeed(2);
        ((MovableCircle)move[1]).setRadius(34);

        // increase, reduce: x or y
        while(true) {
            button = in.next();
            switch (button) {
                case "w":
                    move[1].moveUp();
                    break;
                case "s":
                    move[1].moveDown();
                    break;
                case "a":
                    move[1].moveLeft();
                    break;
                case "d":
                    move[1].moveRight();
                    break;
                default:
                    return;
            }
            System.out.println("aktualne położenie punktu okregu (" +
                    ((MovableCircle)move[1]).movablePoint.getX() +
                    ", " +
                    ((MovableCircle)move[1]).movablePoint.getY() +
                    ")" +
                    ", promień = " +
                    ((MovableCircle)move[1]).getRadius());
        }

    }
}
