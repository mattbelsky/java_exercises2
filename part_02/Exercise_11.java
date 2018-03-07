
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    // Calculates compound interest and adds it to investment value
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount to invest:");
        double principal = in.nextDouble();
        System.out.println("Enter the interest rate as a decimal:");
        double rate = in.nextDouble();
        System.out.println("Enter the number of years to invest:");
        double years = in.nextDouble();
        int n = 12; // Number of times compounded per year

        double amount = principal * Math.pow((1 + rate / n), n * years);

        System.out.println("Your investment will be worth " + amount + " in " + years + " years.");
    }
}


