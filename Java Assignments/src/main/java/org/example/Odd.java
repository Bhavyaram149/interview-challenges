package org.example;

import java.util.Scanner;

public class Odd {

    public static void main(String []args){

        Scanner sc =new Scanner(System.in);
        int y=sc.nextInt();
        if(y%2==0){
            System.out.println("The given number is even" +y);
        }
        else{
            System.out.println("the given number is odd");
        }
    }
}
