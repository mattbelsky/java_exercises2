package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {
        int[] nums = new int[200];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}