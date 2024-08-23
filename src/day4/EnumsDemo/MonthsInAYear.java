package day4.EnumsDemo;

public enum MonthsInAYear {
    JANUARY(31, 3),
    FEBRUARY(29,2),
    MARCH(30,4),
    APRIL(31,5),
    MAY(30,7),
    JUNE(30,3),
    JULY(31,1),
    AUGUST(30,2),
    SEPTEMBER(30,4),
    OCTOBER(30,4),
    NOVEMBER(31,6),
    DECEMBER(31,3);

    final Integer daysInAMonth;
    final int holidays;

    MonthsInAYear (Integer daysInAMonth, int holidays) {
        this.daysInAMonth = daysInAMonth;
        this.holidays = holidays;
    }
}
