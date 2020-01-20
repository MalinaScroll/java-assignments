package com.company;

import java.util.Scanner;

public class assignment6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        int multiply;
        int number;


//        //assignment 6.1
//        System.out.println("Assignment 6.1");
//        printSentence();
//        System.out.println("\n");
//
//
//        //assignment 6.2
//        System.out.println("Assignment 6.2");
//        System.out.println("What would you like to print?");
//        userInput = scanner.nextLine();
//        printSentence(userInput);
//        System.out.println("\n");
//
//
//        //assignment 6.3
//        System.out.println("Assignment 6.3");
//        int random1 = (int) (Math.random() * 25 + 1);
//        int random2 = (int) (Math.random() * 25 + 1);
//        multiply = calculateMultiply(random1, random2);
//        System.out.println(random1 + " and " + random2 + " multiplied is: " + multiply + "\n");
//
//
//        //assignment 6.4
//        System.out.println("Assignment 6.4");
//        System.out.print("Insert number 1 for multiplying: ");
//        int userNum1 = scanner.nextInt();
//        System.out.print("Insert number 2 for multiplying: ");
//        int userNum2 = scanner.nextInt();
//        multiply = calculateMultiply(userNum1, userNum2);
//        System.out.println(userNum1 + " and " + userNum2 + " multiplied is: " + multiply + "\n");
//
//
//        //assignment 6.5
//        System.out.println("Assignment 6.5");
//        System.out.print("What number do you wanna know the weekday of? ");
//        number = scanner.nextInt();
//        String day = decideDay(number);
//        System.out.println("number " + number + " is for the day " + day + "\n");


        //assignment 6.6
        System.out.println("Assignment 6.6");
        System.out.print("Please insert a number: ");
        number = scanner.nextInt();
        boolean isEven = isEvenNumber(number);

        if (isEven) {
            System.out.println("The number " + number + " is an even number\n");
        } else {
            System.out.println("The number " + number + " is not an even number\n");
        }
    }

    public static void printSentence() {
        System.out.println("Hello World!");
    }

    public static void printSentence(String sentence) {
        System.out.println(sentence);

    }

    public static int calculateMultiply(int number1, int number2) {
        int multiply = number1 * number2;
        return multiply;
    }

    public static String decideDay(int daynumber) {
        String[] days = {"Invalid", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (daynumber <= 8 && daynumber >= 1) {
            return "Invalid";
        } else {
            return days[daynumber];
        }
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
