public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] DAYS_OF_THE_MONTH = 
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month must be 1-12");
        }

        if (day <= 0 || (day > DAYS_OF_THE_MONTH[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day out-of-range for month");
        }

        if (month == 2 && day == 29 && !(year % 400 == 0 ||
             (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("Feb 29 not valid for year " + year);
        }

        this.month = month;
        this.day = day;
        this.year = year;   // fixed

        System.out.printf("Date constructor for date is %s%n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);   // fixed
    }
}