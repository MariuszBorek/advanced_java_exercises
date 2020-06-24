package org.oop.udemyinterface;

public class App {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.methodFromFirstInterface();
        myClass.methodFromFirstInterfaceWithParameter("cześć");
        System.out.println(myClass.methodFromSecondInterface("no hej!"));

    }

}
