package org.example;

public class UpperCase {
    public static void main(String args[]) {
        if (args.length > 0) {
            char ch = args[0].charAt(0);
            System.out.println("ch="+ch);
            Character st = Character.toUpperCase(ch);
            System.out.println(ch + "------>" + st);
        } else {
            System.out.println("Please enter character to see magic");
        }
    }


}


