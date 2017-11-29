package com.iomzn.javatutorial.java.time;

import java.time.Clock;
import java.time.Instant;

public class JavaInstant {

    public static void main(String[] args) {
        // constant
        Instant c01 = Instant.EPOCH; // 1970-01-01T00:00:00Z
        Instant c02 = Instant.MAX; // +1000000000-12-31T23:59:59.999999999Z
        Instant c03 = Instant.MIN; // -1000000000-01-01T00:00:00Z

        // instance
        Instant v01 = Instant.now();
        Instant v02 = Instant.now(Clock.systemDefaultZone());
        Instant v03 = Instant.ofEpochMilli(1); // 1970-01-01T00:00:00.001Z
        Instant v04 = Instant.ofEpochSecond(1); // 1970-01-01T00:00:01Z
        Instant v05 = Instant.ofEpochSecond(1, 1); // 1970-01-01T00:00:01.000000001Z
        Instant v06 = Instant.parse("1991-02-25T02:25:17.001Z"); // 1991-02-25T02:25:17.001Z

        Instant instant = Instant.ofEpochMilli(1); // 1970-01-01T00:00:00.001Z

    }
}
