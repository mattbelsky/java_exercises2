package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class Exercise_04 {
    public static void main(String[] args) {
        Integer[] intArray = {0, 2, 4, 8, 16, 32, 64};
        Double[] doubleArray = {7.23, 12983.73, 198.12};
        Long[] longArray = {238748237498723492l, 1973498723987498237l, 9238947293749823l};

        sumArray(intArray);
        sumArray(doubleArray);
        sumArray(longArray);
    }

    public static <T extends Number> void sumArray(T[] array) {
        double sum = 0.0;

        for (T element : array) {
            sum += element.doubleValue();
        }

        /* Is it possible to detect the data type of the input array and cast the sum to that type?
            Object.getClass() returns a hash code value for the class type.
            The following code does not work because the statement inside println() doesn't recognize the class name. */

        String classToString = array.getClass().toString();

        // Isolates the class name
        String className = classToString.substring(
                classToString.lastIndexOf('.') + 1,
                classToString.length() - 1
        );
        //System.out.println((className) sum);

        // This -> System.out.println((array.getClass()) sum); doesn't work either.

        // Look at Javadoc for Class Class<T>
    }
}


