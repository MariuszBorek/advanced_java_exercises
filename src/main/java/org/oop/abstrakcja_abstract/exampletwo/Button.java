package org.oop.abstrakcja_abstract.exampletwo;

public abstract class Button {          // klasa zdefiniowana jako abstrakcyjna

    public String getComponent() {      // zwykła, nieabstrakcyjna metoda
        return "Button";
    }

    public abstract void onClick();     // metoda abstrakcyjna, NIE posiada ciała

}
