package org.enumexercises.zad_1;

public class App {
    public static void main(String[] args) {

        System.out.println(Weekday.MONDAY.whichIsGreaterSecondMethod(Weekday.FRIDAY));
        System.out.println(Weekday.SATURDAY.whichIsGreaterSecondMethod(Weekday.FRIDAY));
        System.out.println(Weekday.FRIDAY.whichIsGreaterSecondMethod(Weekday.FRIDAY));

        System.out.println("---------------------");
        System.out.println(Weekday.MONDAY.isWeekDay());
        System.out.println(Weekday.SUNDAY.isWeekDay());

        System.out.println("---------------------");
        System.out.println(Weekday.FRIDAY.isHoliday());
        System.out.println(Weekday.SATURDAY.isHoliday());

    }

}
