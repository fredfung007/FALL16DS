package com.CS102.recitation1;

/**
 * Created by Fred Fung on 9/6/2016.
 */
public class StringTestOut {

    public static void main(String[] args) {
        String s = "Hello World, Fred!";

        System.out.println(s);
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,3));
        System.out.println(s.length());
        System.out.println(s.concat(" Hello Again!"));
        System.out.println(s+" Hello Again!");
        System.out.println(s.charAt(4));
        System.out.println(s.contains("Wor"));
        System.out.println(s.contains("p"));
        String [ ] splits = s.split(" ");
        for (String split : splits) {
            System.out.println(split);
        }
        System.out.println(s.replaceAll(".l.","NEW"));
        System.out.println(s.matches(".*[wW]orld.*"));
        System.out.println(s);
    }
}
