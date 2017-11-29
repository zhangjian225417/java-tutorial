package com.iomzn.javatutorial.java.time;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class JavaDuration {

    public static void main(String[] args) {
        // constant
        Duration c01 = Duration.ZERO; // PT0S

        // instance
        Duration v01 = Duration.ofNanos(1); // PT0.000000001S
        Duration v02 = Duration.ofMillis(1); // PT0.001S
        Duration v03 = Duration.ofSeconds(1); // PT1S
        Duration v04 = Duration.ofSeconds(1, 1); // PT1.000000001S
        Duration v05 = Duration.ofMinutes(1); // PT1M
        Duration v06 = Duration.ofHours(1); // PT1H
        Duration v07 = Duration.ofDays(1); // PT24H
        Duration v08 = Duration.of(1, ChronoUnit.NANOS); // PT0.000000001S
        Duration v09 = Duration.of(1, ChronoUnit.MICROS); // PT0.000001S
        Duration v10 = Duration.of(1, ChronoUnit.MILLIS); // PT0.001S
        Duration v11 = Duration.of(1, ChronoUnit.SECONDS); // PT1S
        Duration v12 = Duration.of(1, ChronoUnit.MINUTES); // PT1M
        Duration v13 = Duration.of(1, ChronoUnit.HOURS); // PT1H
        Duration v14 = Duration.of(1, ChronoUnit.HALF_DAYS); // PT12H
        Duration v15 = Duration.of(1, ChronoUnit.DAYS); // PT24H
        Duration v16 = Duration.parse("PT1H1M1.000000001S"); // PT1H1M1.000000001S

        Duration duration = Duration.ofSeconds(86461, 1); // PT24H1M1.000000001S

        // getter
        int nano = duration.getNano(); // 1
        long seconds = duration.getSeconds(); // 86461

        // convert
        long toNanos = duration.toNanos(); // 86461000000001
        long toMillis = duration.toMillis(); // 86461000
        long toSeconds = duration.toSeconds(); // 86461
        long toMinutes = duration.toMinutes(); // 1441
        long toHours = duration.toHours(); // 24
        long toDays = duration.toDays(); // 1

        int toNanosPart = duration.toNanosPart(); // 1
        int toMillisPart = duration.toMillisPart(); // 0
        int toSecondsPart = duration.toSecondsPart(); // 1
        int toMinutesPart = duration.toMinutesPart(); // 1
        int toHoursPart = duration.toHoursPart(); // 0
        long toDaysPart = duration.toDaysPart(); // 1

        // plus|minus
        Duration p01 = duration.plus(Duration.ZERO); // PT24H1M1.000000001S
        Duration p02 = duration.plusNanos(1); // PT24H1M1.000000002S
        Duration p03 = duration.plusMillis(1); // PT24H1M1.001000001S
        Duration p04 = duration.plusSeconds(1); // PT24H1M2.000000001S
        Duration p05 = duration.plusMinutes(1); // PT24H2M1.000000001S
        Duration p06 = duration.plusHours(1); // PT25H1M1.000000001S
        Duration p07 = duration.plusDays(1); // PT48H1M1.000000001S
        Duration p08 = duration.plus(1, ChronoUnit.NANOS); // PT24H1M1.000000002S
        Duration p09 = duration.plus(1, ChronoUnit.MICROS); // PT24H1M1.000001001S
        Duration p10 = duration.plus(1, ChronoUnit.MILLIS); // PT24H1M1.001000001S
        Duration p11 = duration.plus(1, ChronoUnit.SECONDS); // PT24H1M2.000000001S
        Duration p12 = duration.plus(1, ChronoUnit.MINUTES); // PT24H2M1.000000001S
        Duration p13 = duration.plus(1, ChronoUnit.HOURS); // PT25H1M1.000000001S
        Duration p14 = duration.plus(1, ChronoUnit.HALF_DAYS); // PT36H1M1.000000001S
        Duration p15 = duration.plus(1, ChronoUnit.DAYS); // PT48H1M1.000000001S

        // with
        Duration w01 = duration.withNanos(1); // PT24H1M1.000000001S
        Duration w02 = duration.withSeconds(1); // PT1.000000001S

        // truncate
        Duration t01 = duration.truncatedTo(ChronoUnit.NANOS); // PT24H1M1.000000001S
        Duration t02 = duration.truncatedTo(ChronoUnit.MICROS); // PT24H1M1S
        Duration t03 = duration.truncatedTo(ChronoUnit.MILLIS); // PT24H1M1S
        Duration t04 = duration.truncatedTo(ChronoUnit.SECONDS); // PT24H1M1S
        Duration t05 = duration.truncatedTo(ChronoUnit.MINUTES); // PT24H1M
        Duration t06 = duration.truncatedTo(ChronoUnit.HOURS); // PT24H
        Duration t07 = duration.truncatedTo(ChronoUnit.HALF_DAYS); // PT24H
        Duration t08 = duration.truncatedTo(ChronoUnit.DAYS); // PT24H

        System.out.println(c01);
    }
}
