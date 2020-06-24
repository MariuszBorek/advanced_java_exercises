package org.oop.anonimowa_anonymous.examplesecond;

public class UIComponetnts {
    void showComponet() {
        ClickListener buttonClick = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("On button click!");
            }
        };
        buttonClick.onClick();

        ClickListener checkboxClick = () -> System.out.println("On Checkbox click!");
        checkboxClick.onClick();
    }
}
