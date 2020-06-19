package org.example;

public class AddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        String number = args[0];
        char[] chars = number.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            sum = sum + Character.getNumericValue(chars[i]);
        }
        System.out.println("sum=" + sum);
    }

}
