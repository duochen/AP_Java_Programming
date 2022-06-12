package chapter11.Exercises;

import java.util.ArrayList;

public class Exercise11_18 {
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> ass = new ArrayList<>();
        for(int i=0;i<s.length();i++)
            ass.add(s.charAt(i));
        return ass;
    }

    public static void main(String[] args) {
        ArrayList<Character> al = toCharacterArray("abc");
        System.out.println(al);
    }
}
