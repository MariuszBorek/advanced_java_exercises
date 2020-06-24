package org.oop.abstrakcja_abstract.abstakcyjnadziedziczyabstrakcyjna;

public class App {
    public static void main(String[] args) {
        SortListPerformanceTest sortListPerformanceTest = new SortListPerformanceTest();
        TestTemplate testTemplate = new SortListPerformanceTest();

        sortListPerformanceTest.run();
        sortListPerformanceTest.getNumberOfIterations();
        sortListPerformanceTest.getAverageExecutionTime();

        testTemplate.run();
        testTemplate.getNumberOfIterations();
        ((SortListPerformanceTest)testTemplate).getAverageExecutionTime(); // rzutownaie w dół -> aby dostać się do metod w klasach niżej w hierarchi
    }
}
