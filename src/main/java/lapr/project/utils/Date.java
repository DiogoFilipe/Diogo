package lapr.project.utils;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Represents a date by its year, month and day
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Date implements Comparable<Date>,Serializable{
    /**
     * Date's year
     */
    private int year;
    /**
     * Date's month
     */
    private Month month;
    /**
     * Date's day
     */
    private int day;
    
    /**
     * Default year
     */
    private static final int DEFAULT_YEAR = 1;
    /**
     * Default month
     */
    private static final Month DEFAULT_MONTH = Month.JANUARY;
    /**
     * Default day
     */
    private static final int DEFAULT_DAY = 1;
    
    /**
     * Represents the weekdays
     */
    private static enum Weekday {

        /**
         * Days of the week
         */
        SUNDAY { @Override public String toString() { return "Sunday"; } },
        MONDAY { @Override public String toString() { return "Monday"; } },
        TUESDAY {   @Override public String toString() { return "Tuesday"; } },
        WEDNESDAY {  @Override public String toString() { return "Wednesday"; } },
        THURSDAY {  @Override public String toString() { return "Thursday"; } },
        FRIDAY {   @Override public String toString() { return "Friday"; } },
        SATURDAY {  @Override public String toString() { return "Saturday"; } };

        /**
         * Returns the designation of a weekday of a certain index given as a parameter
         * @param weekdayPosition index of the weekday
         * @return the weekday's designation
         */
        public static String WeekdayDescription(int weekdayPosition) {
            return Weekday.values()[weekdayPosition].toString();
        }
    }

    /**
     * Represents the months of the year
     */
    private static enum Month {

        /**
         * The months of the year
         */
        JANUARY(31) {   @Override public String toString() { return "January"; } }, 
        FEBRUARY(28) { @Override public String toString() { return "February"; } }, 
        MARCH(31) {     @Override public String toString() { return "March"; } },
        APRIL(30) {     @Override public String toString() { return "April"; } }, 
        MAY(31) {      @Override public String toString() { return "May"; } }, 
        JUNE(30) {     @Override public String toString() { return "June"; } }, 
        JULY(31) {     @Override public String toString() { return "July"; } }, 
        AUGUST(31) {    @Override public String toString() { return "August"; } }, 
        SEPTEMBER(30) {  @Override public String toString() { return "September"; } },
        OCTOBER(31) {   @Override public String toString() { return "October"; } }, 
        NOVEMBER(30) {  @Override public String toString() { return "November"; } }, 
        DECEMBER(31) {  @Override public String toString() { return "December"; } };

        /**
         * Number of days of a month
         */
        private int numberOfDays;

        /**
         * Constructs a Month with the number of days given as a parameter
         * @param numberOfDays the numer of days of the month
         */
        private Month(int numberOfDays) {
            this.numberOfDays = numberOfDays;
        }

        /**
         * Returns the days of the month of the year given as a parameter
         * @param year the year of the month
         * @return the number of days of the month of that year
         */
        public int numberOfDays(int year) {
            if (ordinal() == 1 && Date.isBissextileYear(year)) {
                return numberOfDays + 1;
            }
            return numberOfDays;
        }
        
        /**
         * Returns the month which index is given as a parameter
         * @param monthPosition the month's index
         * @return the month of the given index
         */
        public static Month getMonth(int monthPosition) {
            return Month.values()[monthPosition - 1];
        }

    }
    
    /**
     * Constructs an instance of Date giving it a year, a month and a day
     * @param year Date's year
     * @param month Date's month
     * @param day Date's day
     */
    public Date(int year, int month, int day) {
        setDate(year,month,day);
    }
    

    /**
     * Constructs an instance of Date with the same parameters of a Date given as a parameter
     * @param otherDate Date with the parameters to be copied
     */
    public Date(Date otherDate) {
        year = otherDate.year;
        month = otherDate.month;
        day = otherDate.day;
    }

    /**
     * Returns the year of the Date
     * @return year of the Date
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the month of the Date
     * @return month of the Date
     */
    public int getMonth() {
        return month.ordinal()+1;
    }

    /**
     * Returns the day of the Date
     * @return day of the Date
     */
    public int getDay() {
        return day;
    }

    /**
     * Modifies the year, month and day of a Date
     * @param year Date's year
     * @param month Date's month
     * @param day Date's day
     */
    public final void setDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException( + month + "is an invalid month");
        }
        
        if ( day < 1 || day > Month.getMonth(month).numberOfDays(year)) {
            throw new InvalidDayException( year + "/" + month + "/" + day);
        }
        
        this.year=year;
        this.month=Month.getMonth(month);
        this.day=day;
    }

    /**
     * Returns a textual representation of a Date in the following format: day of the week, day, month, year
     * @return characteristics of a Date
     */
    @Override
    public String toString() {
        return String.format("%s, %d of %s %d", weekday(), day, month, year);
    }

    /**
     * Returns the Date in the following format: yyyy/mm/dd
     * @return characteristics of a Date
     */
    public String toYearMonthDayString() {
        return String.format("%04d/%02d/%02d", year, month.ordinal()+1, day);
    }
    
    /**
     * Compares with the object given as a parameter
     * @param otherObject object compared with the Date
     * @return true if the object given is the same as the Date, false if it isn't
     */
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        Date otherDate = (Date) otherObject;
        return year == otherDate.year && month.equals(otherDate.month)
                && day == otherDate.day;
    }

    /**
     * Compares with the object given as a parameter
     * @param otherDate object compared with the Date
     * @return 0 if otherDate is the same as the Date, -1 if otherDate is bigger than Date, 1 if otherDate is smaller than Date
     */
    @Override
    public int compareTo(Date otherDate) {
        return (otherDate.isBigger(this)) ? -1 : (isBigger(otherDate)) ? 1 : 0;
    }

    /**
     * Returns the weekday of Date
     * @return weekday of Date
     */
    public String weekday() {
        int daysTotal = countDays();
        daysTotal = daysTotal % 7;

        return Weekday.WeekdayDescription(daysTotal);
    }


    /**
     * Returns true if Date is bigger than the Date given as a parameter, if it isn't, returns false
     * @param otherDate the other Date used for comparison
     * @return true if Date is bigger than the Date given as a parameter, if it isn't, returns false
     */
    public boolean isBigger(Date otherDate) {
        int daysTotal = countDays();
        int daysTotal1 = otherDate.countDays();

        return daysTotal > daysTotal1;
    }

    /**
     * Returns the difference in number of days between Date and the other Date given as a parameter
     * @param otherDate the other Date used for comparison
     * @return difference in number of days between Date and the other Date given as a parameter
     */
    public int difference(Date otherDate) {
        int daysTotal = countDays();
        int daysTotal1 = otherDate.countDays();

        return Math.abs(daysTotal - daysTotal1);
    }

    /**
     * Returns the difference in number of days between the Date and the Date inserted through its parameters
     * @param year year of the Date used for comparison
     * @param month month of the Date used for comparison
     * @param day day of the Date used for comparison
     * @return the difference in number of days between the Date and the Date inserted through its parameters
     */
    public int difference(int year, int month, int day) {
        int daysTotal = countDays();
        Date otherDate = new Date(year, month, day);
        int daysTotal1 = otherDate.countDays();

        return Math.abs(daysTotal - daysTotal1);
    }

    /**
     * Returns true if the given year is a leap year, false if it isn't
     * @param year the year we want to validate
     * @return true if the given year is a leap year, false if it isn't
     */
    public static boolean isBissextileYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /**
     * Returns the current date of the system
     * @return current date of the system
     */
    public static Date currentDate() {
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1;    // janeiro é representado por 0.
        int day = today.get(Calendar.DAY_OF_MONTH);
        return new Date(year, month, day);
    }

    /**
     * Returns the number of days since the day 1/1/1 until the Date
     * @return number of days since the day 1/1/1 until the Date 
     */
    private int countDays() {
        int daysTotal = 0;

        for (int i = 1; i < year; i++) {
            daysTotal += isBissextileYear(i) ? 366 : 365;
        }
        for (int i = 1; i < month.ordinal()+1; i++) {
            daysTotal += Month.getMonth(i).numberOfDays(year);
        }
        daysTotal += day;

        return daysTotal;
    }
}