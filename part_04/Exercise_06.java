package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

class QueueController {
    public static void main(String[] args) {
        int sizeQueue = 101;
        Queue myQueue = new Queue(sizeQueue);

        // Fills the queue's array.
        for (int i = 0; i < sizeQueue; i++) {
            myQueue.put(i);
        }

        // Displays every other number of the array.
        for (int i = 0; i < sizeQueue; i++) {
            int element = myQueue.get();

            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
    }
}

class Queue {
    private int[] nums;
    private int putLoc, getLoc;

    public Queue(int size) {
        nums = new int[size];
        putLoc = getLoc = 0;
    }

    public void put(int x) {
        if (putLoc == nums.length) {
            System.out.println("Queue is full.");
            return;
        }
        nums[putLoc++] = x;

    }

    public int get() {
        if (getLoc == putLoc) {
            System.out.println("Queue is empty.");
            return 0;
        }
        return nums[getLoc++];
    }
}