package Lap05.ex104;

import java.sql.SQLOutput;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime ( int hour, int minute, int second) {
        setTime( hour, minute,second);
    }
    public void setTime( int hour, int minute, int second) {
        if( hour<0|| hour > 23|| minute <0||minute>59||second<0||second >59) {
            throw new IllegalArgumentException(" Invalid hour, minute, or second");
        }
        this.hour =hour;
        this.minute=minute;
        this.second = second;
    }
    public void setHour( int hour) {
        if(hour<0|| hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }
    public void setMinute( int minute) {
        if (minute <0||minute> 59) {
            throw new IllegalArgumentException("Invaid minute");
        }
        this.minute = minute;
    }
    public void setSecond(int second) {
        if( second < 0 || second > 59) {
            throw new IllegalArgumentException(" Invaid second!");
        }
        this.second= second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;

    }
    public int second() {
        return second;
    }
    public String toString() {
        return String.format( " %02d:%02d:%02d", hour, minute, second );
    }
    public MyTime nextSecond() {
        second++;
        if( second >=60) {
            second = 0;
            nextMinute();
        }
        return this;
    }
    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }
    public MyTime previousSecond() {
        second--;
        if( second < 0) {
            second = 59;
            previousMinute();
        }
       return this;
    }
    public MyTime previousMinute() {
        minute--;
        if( minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }
    public MyTime previousHour() {
        hour--;
        if( hour <0) {
            hour = 23;
        }
        return this;
    }
    public static void main( String[] args) {
        MyTime time = new MyTime (23,59,59);
        System.out.println( "Initial Time: " + time);

        time.nextSecond();
        System.out.println( " Next Second: " +time) ;

        time.previousSecond();
        System.out.println( " Previous Second" +time) ;
    }
}

