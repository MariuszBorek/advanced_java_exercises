package org.oop.kompozycja_composition;

public class App {
    public static void main(String[] args) {

        Processor processorIntel = new Processor("intel core i9 3.6 GHz", 4);
        Ram ramKingston = new Ram("Kingston", 8000);

        Computer computer = new Computer(processorIntel, ramKingston);
        computer.run();
        System.out.println(computer.toString());
    }
}
