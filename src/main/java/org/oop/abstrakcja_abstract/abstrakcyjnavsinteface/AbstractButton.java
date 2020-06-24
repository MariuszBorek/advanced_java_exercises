package org.oop.abstrakcja_abstract.abstrakcyjnavsinteface;

public abstract class AbstractButton implements ComponentClickListener {
    public static final String TAG = "Button";

    String componentName;

    String getComponentName() {
        return componentName;
    }

    abstract void click();
}
