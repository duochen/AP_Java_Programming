package BarronAP.ch02.questions;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {}
    public MyDate() {}

    public int month() { return 2; }

    public int day() { return 23; }

    public int year() { return 2022; }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public void addYears(int n) {}
}
