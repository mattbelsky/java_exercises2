package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of lbs:");
        double lbs = in.nextDouble();
        double kg = lbs * 0.454;

        // Alters the output wording depending on whether lbs is singular or plural.
        // AFAIK, kilograms are always written as "kg".
        if (lbs == 1) {
            System.out.println(lbs + " lb is " + kg + " kg.");
        }
        else {
            System.out.println(lbs + " lbs is " + kg + " kg.");
        }
    }
}