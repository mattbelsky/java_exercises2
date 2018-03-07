package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        double birthsPerMin = 60 / 6;
        double deathsPerMin = 60 / 12;
        double immigrantsPerMin = 60 / 40;
        int population = 380123456;
        double minPerYear = 60 * 24 * 365; // 60 min * 24 hrs * 365 days

        // population += (births + immigrants - deaths) * 3
        population += ((birthsPerMin + immigrantsPerMin) * minPerYear - (deathsPerMin * minPerYear)) * 3;
        System.out.println(population);
    }
}