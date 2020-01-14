package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class assignment3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //assignment 3.1
        System.out.println("Assignment 3.1");

        int number1 = (int) (Math.random() * 100 + 1);
        int number2 = (int) (Math.random() * 100 + 1);

        int cAnswer = number1 + number2;

        System.out.println("How much is " + number1 + " + " + number2 + " ? ");

        int iAnswer = scanner.nextInt();

        if (iAnswer == cAnswer){
            System.out.println("Your answer is " + iAnswer + ", which is correct!");
            System.out.println("Well done! \n");
        } else {
            System.out.println("Your answer is " + iAnswer + ", which is not correct!");
            System.out.println("Better luck next time! \n");
        }

        //assignment 3.2
        System.out.println("Assignment 3.2");

        int number3 = (int) (Math.random() * 10 + 1);
        int number4 = (int) (Math.random() * 10 + 1);
        int number5 = (int) (Math.random() * 10 + 1);

        int cAnswer2 = number3 * number4 * number5;

        System.out.println("How much is " + number3 + " * " + number4 + " * " + number5 + " ? ");

        int iAnswer2 = scanner.nextInt();
        if (iAnswer2 == cAnswer2){
            System.out.println("Your answer is " + iAnswer2 + ", which is correct!");
            System.out.println("Well done! \n");
        } else {
            System.out.println("Your answer is " + iAnswer2 + ", which is not correct!");
            System.out.println("Better luck next time! \n");
        }

        //assignment 3.3
        System.out.println("Assignment 3.3");
        int mNumber = (int) (Math.random() * 12 + 1);
        String month = "Unknown";
        switch (mNumber) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
        }
        System.out.println("The number is " + mNumber + ", which is the month " + month + "\n");

        //assignment 3.4
        System.out.println("Assignment 3.4");
        System.out.println("What day in Numbers is it today (Monday = 1, Sunday = 7)");
        int dayNow = scanner.nextInt();
        System.out.println("How many days in advance do you wanna know the day of?");
        int dayAdv = scanner.nextInt();
        int result = dayNow + dayAdv;
        result %= 7;
        if (result == 0) {
            result += 7;
        }
        String dayNowRes = "Unknown";
        String dayRes = "Unknown";
        switch (dayNow) {
            case 1: dayNowRes = "Monday"; break;
            case 2: dayNowRes = "Tuesday"; break;
            case 3: dayNowRes = "Wednesday"; break;
            case 4: dayNowRes = "Thursday"; break;
            case 5: dayNowRes = "Friday"; break;
            case 6: dayNowRes = "Saturday"; break;
            case 7: dayNowRes = "Sunday"; break;
        }
        switch (result) {
            case 1: dayRes = "Monday"; break;
            case 2: dayRes = "Tuesday"; break;
            case 3: dayRes = "Wednesday"; break;
            case 4: dayRes = "Thursday"; break;
            case 5: dayRes = "Friday"; break;
            case 6: dayRes = "Saturday"; break;
            case 7: dayRes = "Sunday"; break;
        }

        System.out.println("Today is " + dayNowRes + " and " + dayAdv + " days away is " + dayRes + "\n");

        //assignment 3.5
        System.out.println("Assignment 3.5");
        System.out.println("Please insert weight in kilos");
        double weight = scanner.nextDouble();
        System.out.println("Please insert height in metres");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi <= 18.5) {
            System.out.println("Your BMI is " + bmi);
            System.out.println("You are underweight\n");
        } else if (bmi <= 25) {
            System.out.println("Your BMI is " + bmi);
            System.out.println("You are normal weight\n");
        } else if (bmi <= 30) {
            System.out.println("Your BMI is " + bmi);
            System.out.println("You are overweight\n");
        } else if (bmi >= 30) {
            System.out.println("Your BMI is " + bmi);
            System.out.println("You are very overweight\n");
        }

        //assignment 3.6
        System.out.println("Assignment 3.6");
        System.out.println("Insert 7 numbers to be sorted");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int[] numbers = {num1, num2, num3, num4, num5, num6, num7};
        Arrays.sort(numbers);
        System.out.println("The Numbers have been sorted: " + numbers[0] + " - " + numbers[1] + " - " + numbers[2] + " - " + numbers[3] + " - " + numbers[4] + " - " + numbers[5] + " - " + numbers[6]);
    }
}
