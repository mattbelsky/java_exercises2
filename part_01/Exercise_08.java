package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {
    // a = pi * r * r
    // p = 2 * pi * r
    public static void main(String[] args) {
        double radius = 3.14;
        double area = Math.PI * Math.pow(radius, 2.0);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
