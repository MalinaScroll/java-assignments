package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class assignment7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        //assignment 7.1
//        System.out.println("Assignment 7.1");
//        int[] numbers = new int[100];
//        int counter = 0;
//
//        System.out.print("Which method would you like to see (1 or 2) : ");
//        int method = scanner.nextInt();
//
//        if (method == 1) {
//            //method 1
//            System.out.println("\nThis is method 1 :\n");
//            for (int i = 0; i < numbers.length; i++) {
//                int random = (int) (Math.random() * 6 + 1);
//                numbers[i] = random;
//            }
//
//            for (int number : numbers) {
//                System.out.print(number + " ");
//                counter++;
//                if (counter == 10) {
//                    counter = 0;
//                    System.out.println();
//                }
//            }
//            System.out.println("\n");
//
//        } else if (method == 2) {
//            //method 2
//            System.out.println("\nThis is method 2 :\n");
//            for (int number : numbers) {
//                int random = (int) (Math.random() * 6 + 1);
//                number = random;
//                System.out.print(number + " ");
//                counter++;
//                if (counter % 10 == 0) {
//                    counter = 0;
//                    System.out.println();
//                }
//            }
//            System.out.println("\n");
//        } else {
//            System.out.println(method + " is an invalid method");
//            System.exit(-1);
//        }


        //assignment 7.2
        System.out.println("Assignment 7.2\n");
        System.out.print("Choose a number, this will be the amount of numbers your array will have : ");
        int input = scanner.nextInt();

        if (input > 15) {
            System.out.println("Number is too large, reducing to 15");
            input = 15;

        } else if (input < 3) {
            System.out.println("Number is too small, increasing to 3");
            input = 3;
        }

        int[] array1 = new int[input];
        int[] array2 = new int[input];

        System.out.print("Please insert " + input + " numbers ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        int length = array1.length;
        int rev = length;
        for (int value : array1) {
            array2[rev - 1] = value;
            rev = rev - 1;
        }

        System.out.println("Your array is : " + Arrays.toString(array1) + " which consists of " + input + " numbers");
        System.out.println("Reversed it is : " + Arrays.toString(array2) + " which consists of " + input + " numbers");
    }
}
