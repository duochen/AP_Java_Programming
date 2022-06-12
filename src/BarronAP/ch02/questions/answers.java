/*
    Multiple-Choice Questions on Classes and Objects
 */
package BarronAP.ch02.questions;


public class answers {

    private static void addCentury(MyDate recent, MyDate old)
    {
        old.addYears((100));
        recent = old;
    }

    private static void q2_11() {
        MyDate oldDate = new MyDate(1, 13, 1900);
        MyDate recentDate = null;
        addCentury(recentDate, oldDate);  // The method is not able to replace an object reference.
    }

    public static void main(String[] args) {
        q2_11();
    }
}
