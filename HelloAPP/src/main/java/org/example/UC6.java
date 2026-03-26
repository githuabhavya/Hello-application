package org.example;

public class UC6 {
    public static void main(String[] args) {

        // Case when no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name);
                nameBuilder.append(", ");
            }

            // Remove trailing ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}
