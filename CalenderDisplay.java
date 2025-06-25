package methodinjava;

import java.util.Scanner;

public class CalenderDisplay {

    private static final String[] MONTH_NAMES = {
            "", 
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {
            0, 
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static String getMonthName(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            return MONTH_NAMES[monthNumber];
        }
        return "Invalid Month";
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; 
        }
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int q = 1;

        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        return (h + 6) % 7; 
    }


    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfWeek = getFirstDayOfMonth(month, year); 

        if (daysInMonth == -1) {
            System.out.println("Invalid month: " + month);
            return;
        }

        System.out.println("\n      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("    "); 
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDayOfWeek + day) % 7 == 0) { 
                System.out.println();
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (e.g., 2005): ");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}
