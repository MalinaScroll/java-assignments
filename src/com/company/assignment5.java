package com.company;

import java.util.Scanner;

public class assignment5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //assignment 5.1
        System.out.println("Assignment 5.1");
        boolean loop = true;

        while (loop) {

            System.out.println("Fill in your test score, -1 to exit System");
            double grade = scanner.nextDouble();

            if (grade == -1) {
                System.out.println("Good Bye!\n");
                loop = false;
                continue;
            } else {
                System.out.println("Your test result is " + grade);

                if (grade < 5.5) {
                    System.out.println("You did not pass the test, sorry =(\n");

                } else if (grade <= 10) {
                    System.out.println("You passed the test, well done =)\n");

                } else if (grade > 10) {
                    System.out.println("Grades only go to 10, no cheating >=(\n");
                }
            }
        }

        //assignment 5.2
        System.out.println("Assignment 5.2");
        int result = 0;
        for (int i = 1; i < 11; i++) {
            int num1 = (int) (Math.random() * 10 + 1);
            int num2 = (int) (Math.random() * 10 + 1);
            int cAnswer = num1 + num2;

            System.out.println("Question " + i + ", what is " + num1 + " + " + num2 + " ?");
            int iAnswer = scanner.nextInt();
            if (iAnswer == cAnswer) {
                System.out.println("Well done!\n");
                result++;
            } else {
                System.out.println("Too bad\n");
            }
        }
        System.out.println("Your score is " + result + "/10\n");

        //assignment 5.3
        System.out.println("Assignment 5.3");
        System.out.println("Insert a number to show it's table");
        int tableNum = scanner.nextInt();
        System.out.println("This is table of " + tableNum);
        for (int i = 1; i < 11 ; i++) {
            int multiply = i * tableNum;
            System.out.println(i + " x " + tableNum + " = " + multiply);
        }
    }
}
