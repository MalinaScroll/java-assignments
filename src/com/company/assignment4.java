package com.company;

import java.util.Scanner;
import java.util.Arrays;

import static java.lang.Character.toLowerCase;

public class assignment4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //assignment 4.1
        System.out.println("Assignment 4.1");
        System.out.println("Please insert a letter");
        char letter = scanner.nextLine().charAt(0);
        int asciiValue = (int) letter;
        System.out.println("The Ascii value of " + letter + " is " + asciiValue + "\n");

        //assignment 4.2
        System.out.println("Assignment 4.2");
        System.out.println("Please insert a character");
        char character = scanner.nextLine().charAt(0);

        if (Character.isLetter(character)) {
            System.out.println(character + " is a letter\n");
        } else if (Character.isDigit(character)) {
            System.out.println(character + " is a digit\n");
        } else {
            System.out.println( character + " is not a letter or digit\n");
        }

        //assignment 4.3
        System.out.println("Assignment 4.3");
        System.out.println("Please insert a letter");
        char letter2 = scanner.nextLine().toLowerCase().charAt(0);

        if (Character.isLetter(letter2)) {
            if (letter2 == 'a' || letter2 == 'e' || letter2 == 'i' || letter2 == 'o' || letter2 == 'u' || letter2 == 'æ' || letter2 == 'å' || letter2 == 'ø')
                System.out.println(letter2 + " is vowel\n");
            else
                System.out.println(letter2 + " is consonant\n");
        } else {
            System.out.println(letter2 + " is not a letter\n");
        }

        //assignment 4.4
        System.out.println("Assignment 4.4");
        System.out.println("Please insert a letter to convert it to old phone number area");
        char phone = scanner.nextLine().toLowerCase().charAt(0);

        if (Character.isLetter(phone)) {
            if (phone == 'a' || phone == 'b' || phone == 'c') {
                System.out.println(phone + " is on number 2\n");

            } else if (phone == 'd' || phone == 'e' || phone == 'f') {
                System.out.println(phone + " is on number 3\n");

            } else if (phone == 'g' || phone == 'h' || phone == 'i') {
                System.out.println(phone + " is on number 4\n");

            } else if (phone == 'j' || phone == 'k' || phone == 'l') {
                System.out.println(phone + " is on number 5\n");

            } else if (phone == 'm' || phone == 'n' || phone == 'o') {
                System.out.println(phone + " is on number 6\n");

            } else if (phone == 'p' || phone == 'q' || phone == 'r' || phone == 's') {
                System.out.println(phone + " is on number 7\n");

            } else if (phone == 't' || phone == 'u' || phone == 'v') {
                System.out.println(phone + " is on number 8\n");

            } else if (phone == 'w' || phone == 'x' || phone == 'y' || phone == 'z') {
                System.out.println(phone + " is on number 9\n");
            }
        } else {
            System.out.println("This is not a valid letter");
        }

        //assignment 4.5
        System.out.println("Assignment 4.5");
        int randomNum = (int) (Math.random() * 26 + 97);
        char asciiChar = (char) randomNum;

        System.out.println("your random letter is " + asciiChar + "\n");

        //assignment 4.6
        System.out.println("Assignment 4.6");
        System.out.println("Insert a word or sentence.");
        String s1 = scanner.nextLine();

        System.out.println("The length of " + s1 + " is " + s1.length());
        System.out.println("The first letter is " + s1.charAt(0));
        System.out.println("The last letter is " + s1.substring(s1.length() - 1) + "\n");

        //assignment 4.7
        System.out.println("Assignment 4.7");
        System.out.println("Insert 3 country names.");

        System.out.println("Land 1");
        String land1 = scanner.nextLine().toUpperCase();
        System.out.println("Land 2");
        String land2 = scanner.nextLine().toUpperCase();
        System.out.println("Land 3");
        String land3 = scanner.nextLine().toUpperCase();

        String[] alpha = {land1, land2, land3};
        Arrays.sort(alpha);
        System.out.println("Now in Alphabet:\n the 1st is " + alpha[0] + " \n the 2nd is " + alpha[1] + " \n the 3rd is " + alpha[2]);
    }
}
