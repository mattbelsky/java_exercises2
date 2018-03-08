package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        // use the && operator to see if the user's number is divisible by both 4 and 7
        if (num % 4 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by 4 and 7.");
        }

        // use the || operator to see if the user's number is divisible by 4 or 7
        if (num % 4 == 0 || num % 7 == 0) {
            System.out.println(num + " is divisible by either 4 or 7. Or maybe both -- who knows?");
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if (num % 4 == 0 ^ num % 7 == 0) {
            System.out.println(num + " is divisible by either 4 or 7 but not both.");
        }

        // print out the results

    }
}


