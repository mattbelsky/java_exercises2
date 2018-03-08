package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class Exercise_02 {
    public static void main(String[] args) {
        int a = 16;
        int b = 27890;
        int product = multiply(a, b);
        double quotient = divide(a, b);
        int sum = product + (int) quotient;
        System.out.println(sum);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return a / b;
    }
}