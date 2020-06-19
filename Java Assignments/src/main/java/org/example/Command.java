package org.example;

public class Command {
    public static void main(String[] args) {
        if (args.length != 0) {
            for (int t = 0; t < args.length; t++) {
                System.out.print(args[t]);
                if (t != args.length - 1)// not adding to the last index
                    System.out.print(",");
            }

        } else {
            System.out.println("No values");
        }
    }
}
