package part_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of minutes:");

        try {
            double min = in.nextDouble();

            // Throws exception if minutes are out of bounds

            /* How do I determine whether nothing was entered within this if statement? I don't want to use a nested
                try catch. Or is it better practice to use the try catch? */
            if (min < 0 || min > 1000000000) {
                throw new InputMismatchException();
            }
            double years = min / (365. * 24 * 60); // year = 365 days * 24 hours * 60 minutes
            double days = min / (24. * 60); // day = 24 hours * 60 minutes
            System.out.println("Years: " + years);
            System.out.println("Days: " + days);
        }
        catch (InputMismatchException ime) {
            System.out.println("Invalid input.");
        }
    }
}


