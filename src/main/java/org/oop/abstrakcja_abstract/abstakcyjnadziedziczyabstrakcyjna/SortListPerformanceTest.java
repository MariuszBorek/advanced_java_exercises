package org.oop.abstrakcja_abstract.abstakcyjnadziedziczyabstrakcyjna;

public class SortListPerformanceTest extends PerformanceTestTemplate { // definicja klasy nieabstrakcyjnej

    @Override // wymagane - metoda abstrakcyjna nieposiadająca implementacji w hierarchii dziedziczenia
    public double getAverageExecutionTime() {
        return 5.0;
    }

    @Override // wymagane - metoda abstrakcyjna nieposiadająca implementacji w hierarchii dziedziczenia
    protected int getNumberOfIterations() {
        return 3;
    }
}
