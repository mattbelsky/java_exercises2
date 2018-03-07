package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of feet:");
        double feet = in.nextDouble();
        double meters = feet * 0.305;

        // Alters the output wording depending on whether feet or meters are singular or plural
        if (feet == 1) {
            System.out.println(feet + " foot is " + meters + " meters.");
        }
        else if (meters == 1) {
            System.out.println(feet + " feet is " + meters + " meter.");
        }
        else {
            System.out.println(feet + " feet is " + meters + " meters.");
        }
    }
}