package org.generictypesexercises.exercises.zad_4;

import java.util.List;

public class Library<T extends MediaContent> {

    List<T> library;

    public Library(List<T> library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Library: " + library;
    }
}
