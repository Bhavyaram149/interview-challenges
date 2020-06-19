package org.example;

public class PrimeNumberCheck {
    public static  void main(String[] args) {
        for (int k = 10; k <= 99; k++) {

            int count = 0;
            for (int j = 1; j <= k; j++) {
                if (k % j == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("the given number is not a prime number" +k);
            } else {
                System.out.println("the given number is  a prime number" +k);
            }
        }
    }
}
