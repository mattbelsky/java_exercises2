package part_02;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a whole number between 0 & 1,000,000,000:");
        int min = 0;
        int max = 1000000000;
        boolean exception = true;

        // Problem here when I enter an invalid number then, at next prompt, a string. No exception generated.
        while (exception) {
            try {
                int num = in.nextInt();
                if (num < min || num > max) {
                    throw new InputMismatchException();
                }
                int i = min;
                while (i <= max) {
                    if (i == num) {
                        System.out.println("You entered " + num + ".");
                        exception = false;
                        break;
                    }
                }
            } catch (InputMismatchException ime) {
                System.out.println("Enter a valid number.");
                in.next();
            }
        }
    }
}

