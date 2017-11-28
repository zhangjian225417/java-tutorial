package com.iomzn.java.time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaLocalTime {

    public static void main(String[] args) {
        LocalTime v01 = LocalTime.MIDNIGHT; // 00:00
        LocalTime v02 = LocalTime.NOON; // 12:00
        LocalTime v03 = LocalTime.MAX; // 23:59:59.999999999
        LocalTime v04 = LocalTime.MIN; // 00:00
        LocalTime v05 = LocalTime.now();
        LocalTime v06 = LocalTime.now(Clock.systemDefaultZone());
        LocalTime v07 = LocalTime.now(ZoneId.systemDefault());
        LocalTime v08 = LocalTime.of(2, 25); // 02:25
        LocalTime v09 = LocalTime.of(2, 25, 17); // 02:25:17
        LocalTime v10 = LocalTime.of(2, 25, 17, 100); // 02:25:17.000000100
        LocalTime v11 = LocalTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalTime v12 = LocalTime.ofNanoOfDay(100); // 00:00:00.000000100
        LocalTime v13 = LocalTime.ofSecondOfDay(100); // 00:01:40
        LocalTime v14 = LocalTime.parse("02:25:17"); // 02:25:17
        LocalTime v15 = LocalTime.parse("02点25分17秒", DateTimeFormatter.ofPattern("HH点mm分ss秒")); // 02:25:17
        LocalTime v16 = LocalTime.from(LocalDateTime.now());

        LocalTime localTime = LocalTime.of(2, 25, 17, 100); // 02:25:17.000000100

        // plus
        LocalTime p01 = localTime.plusNanos(1); // 02:25:17.000000101
        LocalTime p02 = localTime.plusSeconds(1); // 02:25:18.000000100
        LocalTime p03 = localTime.plusMinutes(1); // 02:26:17.000000100
        LocalTime p04 = localTime.plusHours(1); // 03:25:17.000000100
        LocalTime p05 = localTime.plus(Duration.ofHours(1)); // 03:25:17.000000100
        LocalTime p06 = localTime.plus(1, ChronoUnit.NANOS); // 02:25:17.000000101
        LocalTime p07 = localTime.plus(1, ChronoUnit.MICROS); // 02:25:17.000001100
        LocalTime p08 = localTime.plus(1, ChronoUnit.MILLIS); // 02:25:17.001000100
        LocalTime p09 = localTime.plus(1, ChronoUnit.SECONDS); // 02:25:18.000000100
        LocalTime p10 = localTime.plus(1, ChronoUnit.MINUTES); // 02:26:17.000000100
        LocalTime p11 = localTime.plus(1, ChronoUnit.HOURS); // 03:25:17.000000100
        LocalTime p12 = localTime.plus(1, ChronoUnit.HALF_DAYS); // 14:25:17.000000100

        // minus
        LocalTime m01 = localTime.minusNanos(1);
        LocalTime m02 = localTime.minusSeconds(1);
        LocalTime m03 = localTime.minusMinutes(1);
        LocalTime m04 = localTime.minusHours(1);










        // minus
        // with

        localTime.truncatedTo(ChronoUnit.SECONDS);










    }
}
