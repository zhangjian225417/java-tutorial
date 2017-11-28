package com.iomzn.javatutorial.java.time;

import java.time.Month;

public class JavaMonth {

    public static void main(String[] args) {
        Month v01 = Month.JANUARY;
        Month v02 = Month.FEBRUARY;
        Month v03 = Month.MARCH;
        Month v04 = Month.APRIL;
        Month v05 = Month.MAY;
        Month v06 = Month.JUNE;
        Month v07 = Month.JULY;
        Month v08 = Month.AUGUST;
        Month v09 = Month.SEPTEMBER;
        Month v10 = Month.OCTOBER;
        Month v11 = Month.NOVEMBER;
        Month v12 = Month.DECEMBER;

        Month month = Month.of(2); // FEBRUARY

        // getter
        int monthInt = month.getValue(); // 2
        int lengthIfLeapYear = month.length(true); // 29
        int lengthIfNotLeapYear = month.length(false); // 28
        int maxLength = month.maxLength(); // 29
        int minLength = month.minLength(); // 28

        // plus|minus
        Month p01 = month.plus(1); // MARCH
        Month m01 = month.minus(1); // JANUARY
    }
}
