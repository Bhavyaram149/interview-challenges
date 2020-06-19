package org.example;

public class EvenNumbersCheck {
    public static  void main(String[] args){
        for(int j=23; j<=57;j++){
            if(j%2==0){
                System.out.println("The given number is even" +j);
            }
            else{
                System.out.println("The given number is odd"+j);
            }
        }
    }
}
