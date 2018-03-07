package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        double distance = 12; // km
        double time = 30.5; // minutes
        double MPH = kmToMi(distance) / minToHrs(time); // Calls conversion methods and outputs runner's speed in MPH
        System.out.println(MPH);
    }

    // Converts kilometers to miles
    public static double kmToMi(double km) {
        return km * 0.6;
    }

    // Converts minutes to hours
    public static double minToHrs(double min) {
        return min / 60;
    }
}