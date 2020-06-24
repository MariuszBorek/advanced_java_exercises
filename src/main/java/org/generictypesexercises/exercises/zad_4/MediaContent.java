package org.generictypesexercises.exercises.zad_4;

public abstract class MediaContent {

    String title;

    public MediaContent(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
