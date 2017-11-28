package com.iomzn.java.time.deprecated;

import java.time.Instant;
import java.util.Date;

public class JavaDate {

    public static void main(String[] args) {
        Date v01 = new Date(); // UNIX TIMESTAMP: CURRENT
        Date v02 = Date.from(Instant.now()); // UNIX TIMESTAMP: CURRENT
        Date v03 = new Date(100); // UNIX TIMESTAMP: 100

        Date date = new Date(100); // UNIX TIMESTAMP: 100

        long timestamp = date.getTime(); // 100
        date.setTime(1000); // UNIX TIMESTAMP: 1000
        Instant instant = date.toInstant(); // UNIX TIMESTAMP: 1000

        boolean isBefore = date.before(new Date(1001));



        System.out.println(isBefore);








    }
}
