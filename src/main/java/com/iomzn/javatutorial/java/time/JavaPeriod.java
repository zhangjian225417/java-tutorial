package com.iomzn.javatutorial.java.time;

import java.time.Period;

public class JavaPeriod {

    public static void main(String[] args) {
        // constant
        Period c01 = Period.ZERO; // P0D

        // instance
        Period v01 = Period.of(1, 1, 1); // P1Y1M1D
        Period v02 = Period.ofDays(1); // P1D
        Period v03 = Period.ofWeeks(1); // P7D
        Period v04 = Period.ofMonths(1); // P1M
        Period v05 = Period.ofYears(1); // P1Y
        Period v06 = Period.parse("P1Y1M1D"); // P1Y1M1D

        Period period = Period.of(1, 1, 1); // P1Y1M1D

        // plus|minus
        Period p01 = period.plus(Period.ZERO); // P1Y1M1D
        Period p02 = period.plusDays(1); // P1Y1M2D
        Period p03 = period.plusMonths(1); // P1Y2M1D
        Period p04 = period.plusYears(1); // P2Y1M1D

        // with
        Period w01 = period.withDays(1); // P1Y1M1D
        Period w02 = period.withMonths(1); // P1Y1M1D
        Period w03 = period.withYears(1); // P1Y1M1D






        System.out.println(w03);

    }
}
