package org.oop.abstrakcja_abstract.abstakcyjnadziedziczyabstrakcyjna;

public abstract class PerformanceTestTemplate extends TestTemplate { // klasa abstrakcyjna dziedzicząca po klasie abstrakcyjnej
    @Override
    public void run() { // opcjonalnie decydujemy się na definicję metody abstrakcyjnej
        System.out.println("I should run test here");

    }

    // w tej klasie NIE implementujemy getNumberOfIterations (ale możemy to zrobić)

    public abstract double getAverageExecutionTime();

}
