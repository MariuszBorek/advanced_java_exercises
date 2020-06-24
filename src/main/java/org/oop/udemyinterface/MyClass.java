package org.oop.udemyinterface;

public class MyClass implements FirstInterface, SecondInterface {

    @Override
    public void methodFromFirstInterface() {

    }

    @Override
    public int methodFromFirstInterfaceWithParameter(String str) {
        System.out.println(str);
        return 555;
    }

    @Override
    public String methodFromSecondInterface(String str) {
        return str;
    }
}
