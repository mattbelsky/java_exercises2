package part_01;

/**
 * Part 1 Exercise 6:
 *
 *      Write the necessary code to print out the result of the following:
 *
 *￼         1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 17; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
