package org.example;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if(count>2){
            System.out.println("the given number is not a prime number");
        }
        else{
            System.out.println("the given number is  a prime number");
        }
    }

}

