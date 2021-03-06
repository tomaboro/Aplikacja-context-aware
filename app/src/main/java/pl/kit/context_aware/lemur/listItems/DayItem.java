package pl.kit.context_aware.lemur.listItems;

import java.util.LinkedList;

/**
 * Created by Tomek on 2017-04-24.
 */

public class DayItem {
    private int day;
    private int month;
    private int year;

    public DayItem(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }


    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
