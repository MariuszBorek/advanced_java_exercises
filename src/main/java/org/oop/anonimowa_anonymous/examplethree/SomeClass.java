package org.oop.anonimowa_anonymous.examplethree;

public class SomeClass {
    void showComponentsV2() {
        // implementacja klasy anonimowej
        ClickListener buttonClick = new ClickListener() {

            private String name; // pole w klasie anonimowej
            private static final String BUTTON_CLICK_MESSAGE = "On Button click";

            public void sayHello() { // implementacja metody w klasie anonimowej
                System.out.println("I am new method in anonymous class");
            }

            @Override
            public void onClick() {
                sayHello();
                System.out.println(BUTTON_CLICK_MESSAGE);
                System.out.println(name);
            }
        };
    }
}
