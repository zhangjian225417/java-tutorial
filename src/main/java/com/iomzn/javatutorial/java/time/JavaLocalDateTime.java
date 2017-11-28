package com.iomzn.javatutorial.java.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class JavaLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime v01 = LocalDateTime.MAX; // +999999999-12-31T23:59:59.999999999
        LocalDateTime v02 = LocalDateTime.MIN; // -999999999-01-01T00:00:00
        LocalDateTime v03 = LocalDateTime.now();
        LocalDateTime v04 = LocalDateTime.now(Clock.systemDefaultZone());
        LocalDateTime v05 = LocalDateTime.now(ZoneId.systemDefault());
        LocalDateTime v06 = LocalDateTime.of(1991, 2, 25, 2, 25); // 1991-02-25T02:25
        LocalDateTime v07 = LocalDateTime.of(1991, 2, 25, 2, 25, 17); // 1991-02-25T02:25:17
        LocalDateTime v08 = LocalDateTime.of(1991, 2, 25, 2, 25, 17, 100); // 1991-02-25T02:25:17.000000100
        LocalDateTime v09 = LocalDateTime.of(1991, Month.FEBRUARY, 25, 2, 25); // 1991-02-25T02:25
        LocalDateTime v10 = LocalDateTime.of(1991, Month.FEBRUARY, 25, 2, 25, 17); // 1991-02-25T02:25:17
        LocalDateTime v11 = LocalDateTime.of(1991, Month.FEBRUARY, 25, 2, 25, 17, 100); // 1991-02-25T02:25:17.000000100
        LocalDateTime v12 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDateTime v13 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDateTime v14 = LocalDateTime.ofEpochSecond(1, 1, ZoneOffset.UTC); // 1970-01-01T00:00:01.000000001
        LocalDateTime v15 = LocalDateTime.parse("1991-02-25T02:25:17"); // 1991-02-25T02:25:17
        LocalDateTime v16 = LocalDateTime.parse("1991年02月25日02点25分17秒", DateTimeFormatter.ofPattern("yyyy年MM月dd日HH点mm分ss秒")); // 1991-02-25T02:25:17
    }
}
