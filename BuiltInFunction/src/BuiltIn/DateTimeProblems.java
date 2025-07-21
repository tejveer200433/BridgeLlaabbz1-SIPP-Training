package BuiltIn;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeProblems {

    public static void main(String[] args) {
        // Problem 1: Time Zones and ZonedDateTime
        System.out.println("Problem 1: Time Zones and ZonedDateTime");
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime);

        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime);
        System.out.println();

        // Problem 2: Date Arithmetic
        System.out.println("Problem 2: Date Arithmetic");
        LocalDate initialDate = LocalDate.of(2023, 10, 26);
        System.out.println("Initial Date: " + initialDate);

        LocalDate resultDate = initialDate.plusDays(7)
                                          .plusMonths(1)
                                          .plusYears(2)
                                          .minusWeeks(3);
        System.out.println("Date after additions and subtractions: " + resultDate);
        System.out.println();

        // Problem 3: Date Formatting
        System.out.println("Problem 3: Date Formatting");
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatted Date (dd/MM/yyyy): " + currentDate.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Formatted Date (yyyy-MM-dd): " + currentDate.format(formatter2));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Formatted Date (EEE, MMM dd, yyyy): " + currentDate.format(formatter3));
        System.out.println();

        // Problem 4: Date Comparison
        System.out.println("Problem 4: Date Comparison");
        LocalDate date1 = LocalDate.of(2024, 7, 20);
        LocalDate date2 = LocalDate.of(2024, 7, 25);
        LocalDate date3 = LocalDate.of(2024, 7, 20);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Date 3: " + date3);

        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before Date 2");
        }

        if (date2.isAfter(date1)) {
            System.out.println("Date 2 is after Date 1");
        }

        if (date1.isEqual(date3)) {
            System.out.println("Date 1 is the same as Date 3");
        }
        System.out.println();
    }
}