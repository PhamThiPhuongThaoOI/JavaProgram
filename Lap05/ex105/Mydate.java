package Lap05.ex105;

import java.time.Year;

class MyDate {
    private int year;
    private int month;
    private int day;

    private static final String[] DAYS = {"Sunday" ,"Monday", "Tuesday", "Wednesday","Thursday"," Friday", "Saturday" };
    private static final String[] MONTHS = {"January", " February", " March", " April", "May", "June", " July"," August", "September"," Octorber","November", "December"};
    private  static final int[] DAYS_IN_MONTHS = { 31, 28, 31, 30,31,30, 31,31,30,31,30,31};

    public MyDate( int year, int month, int day) {
        setDate( year, month, day);
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static boolean isValidDate( int year, int month, int day) {
        if(year < 1|| year >9999|| month<1||month>12||day<1)
           return false;

        int maxDays = DAYS_IN_MONTHS[month -1];
        if (month == 2&& isLeapYear(year)) maxDays = 29;

        return day<= maxDays;
    }

    public static int getDayOfWeek( int year, int month, int day) {
        if( month <3) {
            month += 12;
            year--;
        }
        int h = ( day + (( month + 1) *26)/10 + year + year/4 + 6*(year/100) +year/400) %7;
        return h;
    }

    public void setDate ( int year, int month, int day) {
        if( !isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invaid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear( int year) {
        if( year< 1||year>9990) {
            throw new IllegalArgumentException("Invaid year!");
        }
        this.year = year;
    }

    public void setMonth( int month) {
        if( month< 1||month >12) {
            throw new IllegalArgumentException("Invaid month!");
        }
        this.month = month;
    }

    public void setDay( int day) {
        int maxDays = DAYS_IN_MONTHS[month -1];
        if( month ==2 &&isLeapYear(year)) maxDays = 29;

        if( day<1|| day > maxDays) {
            throw new IllegalArgumentException("Invaid day");
        }
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public MyDate nextDay() {
        if ( day == DAYS_IN_MONTHS[month -1]) {
            if( month ==12) {
                year++;
                month=1;
            }else {
                month++;
            }
            day = 1;
        }else {
            day++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if( month ==12) {
            year++;
            month = 1;
        }else {
            month++;
        }
        if ( day> DAYS_IN_MONTHS[month -1]) {
            day = DAYS_IN_MONTHS[month-1];
        }
        return this;
    }
    public MyDate nextYear() {
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        if (day == 1) {
            if (month == 1) {
                year--;
                month = 12;
            } else {
                month--;
            }
            day = DAYS_IN_MONTHS[month - 1];
        } else {
            day--;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            year--;
            month = 12;
        } else {
            month--;
        }
        if (day > DAYS_IN_MONTHS[month - 1]) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %d", DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1); // Tuesday 28 Feb 2012
        System.out.println(date1.nextDay()); // Wednesday 29 Feb 2012
        System.out.println(date1.nextDay()); // Thursday 1 Mar 2012
        System.out.println(date1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(date1.nextYear()); // Monday 1 Apr 2013

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2); // Monday 2 Jan 2012
        System.out.println(date2.previousDay()); // Sunday 1 Jan 2012
        System.out.println(date2.previousDay()); // Saturday 31 Dec 2011
        System.out.println(date2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(date2.previousYear()); // Tuesday 30 Nov 2010

        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3.previousYear()); // Monday 28 Feb 2011
    }




}
