package org.oop.anonimowa_anonymous.examplesecond;

public class App {
    public static void main(String[] args) {
        System.out.println("---wyswietlono z metody---");
        UIComponetnts uiComponetnts = new UIComponetnts();
        uiComponetnts.showComponet();

        System.out.println("\n---wyswietlono z main---");
        ClickListener click = () -> System.out.println("Click!");
        click.onClick();
    }
}
