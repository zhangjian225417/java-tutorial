package com.iomzn.javatutorial.java.time;

import java.time.DayOfWeek;

public class JavaDayOfWeek {

    public static void main(String[] args) {
        DayOfWeek v01 = DayOfWeek.MONDAY;
        DayOfWeek v02 = DayOfWeek.TUESDAY;
        DayOfWeek v03 = DayOfWeek.WEDNESDAY;
        DayOfWeek v04 = DayOfWeek.THURSDAY;
        DayOfWeek v05 = DayOfWeek.FRIDAY;
        DayOfWeek v06 = DayOfWeek.SATURDAY;
        DayOfWeek v07 = DayOfWeek.SUNDAY;

        DayOfWeek dayOfWeek = DayOfWeek.of(1); // MONDAY

        // getter
        int dayOfWeekInt = dayOfWeek.getValue(); // 1

        // plus|minus
        DayOfWeek p01 = dayOfWeek.plus(1); // TUESDAY
        DayOfWeek m01 = dayOfWeek.minus(1); // SUNDAY
    }
}
