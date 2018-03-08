package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class Exercise_02 {
    public static void main(String[] args) {
        int[] nums = new int[2018];

        // Populates the array up to the number 2017
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        // Selects and prints the odd values in nums[]
        for (int i = nums.length - 1; i > 0; i -= 2) {
            System.out.println(nums[i]);
        }
    }
}
