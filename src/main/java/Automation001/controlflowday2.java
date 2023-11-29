package Automation001;

import java.util.Random;
import java.util.Scanner;

public class controlflowday2 {
    public static void main(String[] args) {

        // nested for loop
        // int is 2 intis less and = to 3 (increment up to 3).. theloop makes iy repeat

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + " " + j);

            }

        }
        // print i: int value and chrracter based on int val positioning
        String message = "Hi";
        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            System.out.println("i: " + i + ": " + character);

        }

        // while loop   i is 0 while i is less than or equal ro 5 - increment value by one.
        // start from 0 and incement up to 5
        // scanner takes your input and scans against it- quit once done

        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter positive;");
            number = scanner.nextInt();
        }
        while (number <= 0);
        System.out.println("this is positive;" + number);

       // Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("menu");
            System.out.println("0 1");
            System.out.println("o 2");
            System.out.println("quit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("menu 1");
                    break;
                case 2:
                    System.out.println("menu 2");
                    break;
                case 3:
                    System.out.println("menu 3");
                    break;
                default:
                    System.out.println("NO");

            }
        }
        while (choice != 4);

        // random

        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1;
        int guess;
        int attempts = 0;

        do {
            System.out.println("1-10");
            guess = scanner.nextInt();
            attempts++;

            if (guess != targetNumber) {
                System.out.println("try again");
            }

        } while (guess != targetNumber);
            System.out.println("yess" + attempts);

        // print i: int value and chrracter based on int val positioning
        String str = "Hi";
        for(char character : str.toCharArray()){
            System.out.println("character");

        }

    }
    }







