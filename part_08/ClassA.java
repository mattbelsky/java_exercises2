package part_08;

import java.util.*;

public class ClassA extends Throwable {
    public static void main(String[] args) {
        ClassB b = new ClassB();

        try {
            b.throwException();
        }
        catch (Exception e) {
            System.out.println("Exception caught.");
        }
    }
}
