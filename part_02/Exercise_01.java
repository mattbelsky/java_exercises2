package part_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Part 2 Exercise 1:
 *      Celsius to Fahrenheit
 *
 *      Write the necessary code to read a degree in Celsius (as a double) from the console
 *      then convert it to fahrenheit and print it to the console.
 *
 *          F = 9 * (C / 5) + 32;
 *
 *      Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        boolean valid = false;

        // Loops until user inputs a valid double
        do {
            try {
                double celsius = in.nextDouble();
                double fahrenheit = 9 * (celsius / 5) + 32;
                System.out.println(celsius + " degrees celsius = " + fahrenheit + " degrees fahrenheit");
                valid = true;
            } catch (InputMismatchException ime) {
                System.out.println("Enter a valid number:");
                in.next();
            }
        }
        while (!valid);
    }
}