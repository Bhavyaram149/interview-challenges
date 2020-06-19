package org.example;


import java.util.Scanner;

public class Positive {
    static int x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("=================");

        if (x > 0) {
            System.out.println("x is a positive number" + x);
        } else if (x < 0) {
            System.out.println("x is a negative number" + x);
        } else {
            System.out.println("The given number is Zero" + x);
        }
    }
}




