package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of miles to drive:");
        int distance = in.nextInt(); // miles
        System.out.println("Enter the car's fuel economy in miles per gallon:");
        int mpg = in.nextInt(); // miles per gallon
        System.out.println("Enter the average price of fuel in the area you will be driving in:");
        double priceFuel = in.nextDouble(); // price per gallon in USD

        double tripCost = distance * (1. / mpg) * priceFuel; // cost = miles * (1 / (miles/gallon) * ($ / gallon)

        System.out.println("$" + tripCost);
    }
}