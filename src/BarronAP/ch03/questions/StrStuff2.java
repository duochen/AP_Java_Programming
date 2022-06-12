package BarronAP.ch03.questions;

public class StrStuff2 extends StrStuff1 {
    public void printSub(String str) {
        String s = str.substring(1);
        super.printSub(s);
        System.out.print(s);
    }
}
