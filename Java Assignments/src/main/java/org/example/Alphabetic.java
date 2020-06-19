package org.example;


public class Alphabetic {

    public static void main(String[] args) {
        char[] ch = {'d', 'a'};
        int first = ch[0];
        System.out.println(first);
        int second = ch[1];
        System.out.println(second);
        if (ch[0] > ch[1]) {
            System.out.println(ch[1] + "" + ch[0]);
        }
    }
}
