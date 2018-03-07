package part_01;

 /**
 * Part 1 Exercise 4:
 *      Write the necessary code to print the following table to the console:
 *
 *      a   a*2 a*4
 *      1   2   4
 *      ....
 *      4   8   16
 *
 */
public class Exercise_04 {
     public static void main(String[] args) {
         System.out.println("a\ta*2\ta*4");
         for (int i = 1; i <= 4; i++) {
             for (int j = 1; j <= 4; j *= 2) {
                 System.out.print(i * j + "\t");
             }
             System.out.println();
         }
     }
 }

