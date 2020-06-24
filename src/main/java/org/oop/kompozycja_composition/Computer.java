package org.oop.kompozycja_composition;

public class Computer {
    private Processor processor;
    private Ram ram;

    public Computer(Processor processor, Ram ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public void run() {
        System.out.println("running");
    }

    @Override
    public String toString() {
        return "Computer: " + processor + ", " + ram;
    }
}
