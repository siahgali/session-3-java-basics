package com.keep.calm.enjoy.java.f.date.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExercise {
    public static void main(String[] args) {
        instantExample();
        dateFormatterExample();
    }

    static void instantExample() {
        String futureInstantString = "2050-01-01T12:00:00.00Z";
        String pastInstantString = "2000-01-01T12:00:00.00Z";

        System.out.println("**************************************");
        System.out.println("Instant comparison");
        System.out.println();
        System.out.println("Comparing: " + futureInstantString);
        Instant futureInstant = Instant.parse(futureInstantString);
        checkRelationship(futureInstant);

        System.out.println();
        System.out.println("Comparing: " + pastInstantString);
        Instant pastInstant = Instant.parse(pastInstantString);
        checkRelationship(pastInstant);
        System.out.println("**************************************");
        System.out.println();

    }

    static void checkRelationship(Instant otherInstant) {
        Instant nowInstant = Instant.now();
        if(otherInstant.compareTo(nowInstant) > 0)
            System.out.println("Instant is in the future");
        else if(otherInstant.compareTo(nowInstant) < 0)
            System.out.println("Instant is in the past");
        else
            System.out.println("Instant is now");
    }

    private static void dateFormatterExample() {
        System.out.println("**************************************");
        System.out.println("Date formatting");
        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println("Today in default format: " + today);

        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("Today in US format: " + today.format(usDateFormat));

        LocalDate yesterday = LocalDate.now().minusDays(1);
        String yesterdayUs = yesterday.format(usDateFormat);

        System.out.println();

        String dateStringInUSFormat = "07-04-2022";
        LocalDate dateFromUSFormat = LocalDate.parse(dateStringInUSFormat, usDateFormat);
        System.out.println("Date string value: \"" + dateStringInUSFormat + "\"");
        System.out.println("  ... parsed in US format then displayed in default format: " + dateFromUSFormat);

        System.out.println("**************************************");
        System.out.println();

        Instant nowUtc = Instant.now();
        ZoneId asiaSingapore = ZoneId.of("Asia/Singapore");
        ZonedDateTime nowAsiaSingapore = ZonedDateTime.ofInstant(nowUtc, asiaSingapore);

        System.out.println( nowAsiaSingapore.getHour() + ":"  + nowAsiaSingapore.getMinute());

    }
}
