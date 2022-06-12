/*
    Multiple-Choice Questions on Program Design and Analysis
 */
package BarronAP.ch05.questions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class answers {
    private static void q5_05() {
        int winner = (int) (Math.random() * 50) + 1;
        System.out.println(winner);
    }

    private static void q5_07() {
        Integer k = new Integer(8);
        Integer m = new Integer(4);

        if (k == m) {

        }

        if (k.intValue() == m.intValue()) {

        }

/*        if ((k.intValue()).equals(m.intValue())) {

        }*/
    }

    private static void q5_08() {
        Object intObj = new Integer(9);
        System.out.println(intObj);
    }

    private static void q5_11() {
        String line = "Some more silly stuff on strings!";
        int x = line.indexOf("m");
        String str = line.substring(10, 15) + line.substring(25, 25 + x);
        System.out.println(str);
    }

    private static void q5_09() {
        String fullName = "Jimmy Carroll";
        int k = fullName.indexOf(" ");
        String lastName = fullName.substring(k+1);
        System.out.println(lastName);
        lastName = fullName.substring(k+1, fullName.length());
        System.out.println(lastName);
    }

    private static void q5_10() {
        String s = "dog";
        String ayString = "ay";
        String pigString;

        pigString = s.substring(1, s.length()) + s.substring(0,1) + ayString;
        System.out.println(pigString);
    }

    public static void main(String[] args) {
        q5_05();
        q5_08();
        q5_09();
        q5_10();
    }
}
