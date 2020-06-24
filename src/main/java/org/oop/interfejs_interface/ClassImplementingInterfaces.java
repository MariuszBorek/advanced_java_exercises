package org.oop.interfejs_interface;


// definicja klasy, która rozszerza klasę SomeClass i implementuje oba interfejsy
public class ClassImplementingInterfaces extends SomeClass implements SomeInterface, SomeOtherInterface {
    @Override
    public void someMethod() {
        System.out.println("I am interface method implementation");
    }

    @Override
    public void methodFromMyInterfaceMustBeOverride() {
        System.out.println("zaimplementowana z interface'u MyInteface ale w nadpisana w klasie ClassImplementingInterfaces");
    }
}
