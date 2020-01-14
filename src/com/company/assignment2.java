package com.company;

import java.util.Scanner;

public class assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //assignment 2.1
        System.out.println("Assignment 2.1");
        System.out.println("Fill in the amount of miles");
        double miles = scanner.nextDouble();
        double kilometres;
        kilometres = miles * 1.6;
        System.out.println("Miles to kilometres = " + kilometres + "km\n");

        //assignment 2.2
        System.out.println("Assignment 2.2");
        System.out.println("How many years old are you?");
        int ageY = scanner.nextInt() * (365 * 24 * 60);
        System.out.println("How many months have to be added?");
        int ageM = scanner.nextInt() * (30 * 24 * 60);
        int minutes = ageM + ageY;
        System.out.println("you're about " + minutes + " minutes old \n");

        //assignment 2.3
        System.out.println("Assignment 2.3");
        System.out.println("Type in starting amount");
        int startAmount = scanner.nextInt();
        System.out.println("Type in interest percentage");
        int interestAmount = scanner.nextInt();
        double interest = interestAmount / 100.0 * startAmount;
        double fullAmount = startAmount + interest;
        System.out.println("your interest is " + interest + " and the total amount is " + fullAmount + "\n");

        //assignment 2.4
        System.out.println("Assignment 2.4");
        System.out.println("Insert a number between 10 and 100");
        int between = scanner.nextInt();
        int between1 = between - 2;
        int between2 = between - 1;
        int between3 = between + 1;
        int between4 = between + 2;
        System.out.println("Your numbers are " + between1 + " - " + between2 + " - " + between + " - " + between3 + " - " + between4 );

        //assignment 2.5
        System.out.println("Assignment 2.5");
        System.out.println("Insert a number between 0 and 1000");
        int number = scanner.nextInt();
        int number3 = number % 10;
        number = number / 10;
        int number2 = number % 10;
        number = number / 10;
        if (number == 0) {
            int multiplied = number2 * number3;
            System.out.println("displaying numbers = " + number + " - " + number2 + " - " + number3);
            System.out.println("all displaying numbers above 0 multiplied = " + multiplied + "\n");
        } else if (number2 == 0) {
            int multiplied = number * number3;
            System.out.println("displaying numbers = " + number + " - " + number2 + " - " + number3);
            System.out.println("all displaying numbers above 0 multiplied = " + multiplied + "\n");
        } else if (number3 == 0) {
            int multiplied = number * number2;
            System.out.println("displaying numbers = " + number + " - " + number2 + " - " + number3);
            System.out.println("all displaying numbers above 0 multiplied = " + multiplied + "\n");
        } else {
            int multiplied = number * number2 * number3;
            System.out.println("displaying numbers = " + number + " - " + number2 + " - " + number3);
            System.out.println("all displaying numbers multiplied = " + multiplied + "\n");
        }
    }
}

