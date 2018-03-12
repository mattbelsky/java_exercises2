package part_11;

import java.util.Scanner;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] nums = {0, 1, 2, 3, 4, 5, 6};

        System.out.println("Enter an integer:");
        int position1 = in.nextInt();
        System.out.println("Enter an integer:");
        int position2 = in.nextInt();

        printArray(nums);
        swapElements(nums, position1, position2);
        printArray(nums);
    }

    public static <T> void swapElements(T[] array, int position1, int position2) {
        try {
            T temp = array[position1];
            array[position1] = array[position2];
            array[position2] = temp;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Invalid positions.");
        }
    }

    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

