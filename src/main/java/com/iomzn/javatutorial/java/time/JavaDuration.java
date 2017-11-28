package com.iomzn.javatutorial.java.time;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class JavaDuration {

    public static void main(String[] args) {
        // constant
        Duration c01 = Duration.ZERO;

        // instance
        Duration v01 = Duration.of(1, ChronoUnit.NANOS); // PT0.000000001S
        Duration v02 = Duration.of(1, ChronoUnit.MICROS); // PT0.000001S
        Duration v03 = Duration.of(1, ChronoUnit.MILLIS); // PT0.001S
        Duration v04 = Duration.of(1, ChronoUnit.SECONDS); // PT1S
        Duration v05 = Duration.of(1, ChronoUnit.MINUTES); // PT1M
        Duration v06 = Duration.of(1, ChronoUnit.HOURS); // PT1H
        Duration v07 = Duration.of(1, ChronoUnit.HALF_DAYS); // PT12H
        Duration v08 = Duration.of(1, ChronoUnit.DAYS); // PT24H

    }
}
