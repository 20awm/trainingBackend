package day4.EnumsDemo;

public class Main {
    public static void main(String[] args) {
        MonthsInAYear month = MonthsInAYear.APRIL;

        if (month == MonthsInAYear.APRIL) {
            System.out.println(
                    "Bulan depan adalah bulan ramadhan.");
        }

        for (MonthsInAYear months : MonthsInAYear.values()) {
            System.out.println(months);
        }

        System.out.println("Total hari di bulan Januari: " + MonthsInAYear.JANUARY.daysInAMonth);
        System.out.println("Total hari libur di bulan Januari: " + MonthsInAYear.JANUARY.holidays);

        int totalHolidays = 0;

        for (MonthsInAYear holiday : MonthsInAYear.values()) {
            System.out.println(holiday.name() + " memiliki " + holiday.holidays + " hari libur.");
            totalHolidays += holiday.holidays;
        }

        if((MonthsInAYear.JANUARY.daysInAMonth).equals(MonthsInAYear.APRIL.daysInAMonth)) {
            System.out.println("Total days matches");
        } else {
            System.out.println("Total days unmatched");
        }

        System.out.println("Total number of holidays in a year: " + totalHolidays);
    }
}
