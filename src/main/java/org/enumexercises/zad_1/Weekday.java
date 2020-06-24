package org.enumexercises.zad_1;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;  // this odnośi się do obiektu(zawarości)
    }

    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    String whichIsGreaterSecondMethod(Weekday weekday) {
        if(this.ordinal() < this.ordinal()) {
            return "before " + weekday;
        }
            return "after " + weekday;
    }
    /*
    String whichIsGreater(Weekday weekday) {
        int comparison = compareTo(weekday);
        if(comparison < 0) {
            return "before " + weekday;
        } else if (comparison > 0) {
            return "after " + weekday;
        }
        return "it is the same day";
    }
     */

}
