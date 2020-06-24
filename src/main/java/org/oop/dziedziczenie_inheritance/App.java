package org.oop.dziedziczenie_inheritance;

import org.oop.dziedziczenie_inheritance.car.SportCar;
import org.oop.dziedziczenie_inheritance.computer.Laptop;

public class App {
    public static void main(String[] args) {
        Laptop asus = new Laptop("intel core i9 3.6 GHz", "32 GB", "GeForce RTX 2070 SUPER", 2400);
        asus.configure();

        System.out.println("\n--------------");
        SportCar sportCar = new SportCar();
        sportCar.drive();

    }
}
