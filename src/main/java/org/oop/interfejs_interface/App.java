package org.oop.interfejs_interface;

public class App {
    public static void main(String[] args) {
        ClassImplementingInterfaces classImplementingInterfaces = new ClassImplementingInterfaces();
        classImplementingInterfaces.someMethod();

        double someNumber = classImplementingInterfaces.showNumber();
        System.out.println(someNumber);

        double numberE = classImplementingInterfaces.returnEulerNumberDefaultMethod();
        System.out.println("number e from MyInterface default method = " + numberE);

        classImplementingInterfaces.methodFromMyInterfaceMustBeOverride();

        double numberEFromMethod = classImplementingInterfaces.showMethodReturnEulerNumber();
        System.out.println("metoda statyczna z MyInterface, która zwraca liczbe Eulera została wywoałana w default'owej metodzie z tej samej klasy MyInterface. e = " + numberEFromMethod);

        System.out.println("\n----zastosowanie polimorfizmu----");
        MyInterface classImplementingInterfacesSecond = new ClassImplementingInterfaces();

        classImplementingInterfacesSecond.methodFromMyInterfaceMustBeOverride();
        classImplementingInterfacesSecond.returnEulerNumberDefaultMethod();
        classImplementingInterfacesSecond.showMethodReturnEulerNumber();
        classImplementingInterfacesSecond.showNumber();



    }
}
