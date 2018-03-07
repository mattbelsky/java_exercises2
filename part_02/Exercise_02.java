package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double length = in.nextDouble();
        double area = 2 * Math.PI * radius * (length + radius); // area = 2 * pi * r * (l + r)
        double volume = Math.PI * Math.pow(radius, 2.0) * length; // volume = pi * r * r * l
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}