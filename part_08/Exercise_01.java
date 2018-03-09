package part_08;

/* Write a class with at least one method that uses a try/catch statement. Make sure the catch block is executed, ie
generate an error and catch it in the catch block. */

import java.util.InputMismatchException;

public class Exercise_01 {
    public static void main(String[] args) {
        try {
            throw new InputMismatchException();
        }
        catch (InputMismatchException ime) {
            System.out.println("Exception caught!");
        }
    }
}
