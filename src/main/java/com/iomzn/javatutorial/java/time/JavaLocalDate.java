package com.iomzn.javatutorial.java.time;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class JavaLocalDate {

    public static void main(String[] args) {
        LocalDate v01 = LocalDate.EPOCH; // 1970-01-01
        LocalDate v02 = LocalDate.MAX; // +999999999-12-31
        LocalDate v03 = LocalDate.MIN; // -999999999-01-01
        LocalDate v04 = LocalDate.now();
        LocalDate v05 = LocalDate.now(Clock.systemDefaultZone());
        LocalDate v06 = LocalDate.now(ZoneId.systemDefault());
        LocalDate v07 = LocalDate.of(1991, 2, 25); // 1991-02-25
        LocalDate v08 = LocalDate.of(1991, Month.FEBRUARY, 25); // 1991-02-25
        LocalDate v09 = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDate v10 = LocalDate.ofEpochDay(1); // 1970-01-02
        LocalDate v11 = LocalDate.ofYearDay(1991, 56); // 1991-02-25
        LocalDate v12 = LocalDate.parse("1991-02-25"); // 1991-02-25
        LocalDate v13 = LocalDate.parse("1991年02月25日", DateTimeFormatter.ofPattern("yyyy年MM月dd日")); // 1991-02-25
        LocalDate v14 = LocalDate.from(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(1991, 2, 25); // 1991-02-25

        // plus
        LocalDate p01 = localDate.plusDays(1); // 1991-02-26
        LocalDate p02 = localDate.plusWeeks(1); // 1991-03-04
        LocalDate p03 = localDate.plusMonths(1); // 1991-03-25
        LocalDate p04 = localDate.plusYears(1); // 1992-02-25
        LocalDate p05 = localDate.plus(Period.of(1, 1, 1)); // 1992-03-26
        LocalDate p06 = localDate.plus(1, ChronoUnit.DAYS); // 1991-02-26
        LocalDate p07 = localDate.plus(1, ChronoUnit.WEEKS); // 1991-03-04
        LocalDate p08 = localDate.plus(1, ChronoUnit.MONTHS); // 1991-03-25
        LocalDate p09 = localDate.plus(1, ChronoUnit.YEARS); // 1992-02-25
        LocalDate p10 = localDate.plus(1, ChronoUnit.DECADES); // 2001-02-25
        LocalDate p11 = localDate.plus(1, ChronoUnit.CENTURIES); // 2091-02-25
        LocalDate p12 = localDate.plus(1, ChronoUnit.MILLENNIA); // 2991-02-25

        // minus
        LocalDate m01 = localDate.minusDays(1); // 1991-02-24
        LocalDate m02 = localDate.minusWeeks(1); // 1991-02-18
        LocalDate m03 = localDate.minusMonths(1); // 1991-01-25
        LocalDate m04 = localDate.minusYears(1); // 1990-02-25
        LocalDate m05 = localDate.minus(Period.of(1, 1, 1)); // 1990-01-24
        LocalDate m06 = localDate.minus(1, ChronoUnit.DAYS); // 1991-02-24
        LocalDate m07 = localDate.minus(1, ChronoUnit.WEEKS); // 1991-02-18
        LocalDate m08 = localDate.minus(1, ChronoUnit.MONTHS); // 1991-01-25
        LocalDate m09 = localDate.minus(1, ChronoUnit.YEARS); // 1990-02-25
        LocalDate m10 = localDate.minus(1, ChronoUnit.DECADES); // 1981-02-25
        LocalDate m11 = localDate.minus(1, ChronoUnit.CENTURIES); // 1891-02-25
        LocalDate m12 = localDate.minus(1, ChronoUnit.MILLENNIA); // 0991-02-25

        // with
        LocalDate w01 = localDate.withDayOfMonth(1); // 1991-02-01
        LocalDate w02 = localDate.withDayOfYear(1); // 1991-01-01
        LocalDate w03 = localDate.withMonth(1); // 1991-01-25
        LocalDate w04 = localDate.withYear(1); // 0001-02-25
        localDate.with(Month.OCTOBER);
        localDate.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        ChronoUnit.DAYS.between(localDate, localDate);
    }
}
