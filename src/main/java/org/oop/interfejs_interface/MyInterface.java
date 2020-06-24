package org.oop.interfejs_interface;

public interface MyInterface {
    double E = 2.718281828459045235;    // domyślnie zawiera słowa kluczowe - public static final

    void methodFromMyInterfaceMustBeOverride();     // metoda bez zdefiniowanego ciała - domyślnie abstrakcyjna

    static void methodFromMyInterface() {
        System.out.println("tekst z MyInterface");
    }

    static String showText() {   // metoda statyczna, domyślnie posiada modyfikator public
        return "wyświetlono z metody statycznej z interface'u MyInterface";
    }

    static double returnEulerNumber() {
        return E;
    }

    default double returnEulerNumberDefaultMethod() {
        return E;
    }

    default double showMethodReturnEulerNumber() {      // metoda z domyślnym ciałem, można, ale nie trzeba, nadpisywać w implementacji interfejsu
        double e = returnEulerNumber();
        return e;
    }

    default double showNumber() {
        return 234.345;
    }

}
