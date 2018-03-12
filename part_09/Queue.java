package part_09;

class Queue {
    private int[] nums;
    private int putLoc, getLoc;

    public Queue(int size) {
        nums = new int[size];
        putLoc = getLoc = 0;
    }

    synchronized void put(int x) {
        if (putLoc == nums.length) {
            System.out.println("Queue is full.");
            return;
        }
        nums[putLoc++] = x;

    }

    synchronized int get() {
        if (getLoc == putLoc) {
            System.out.println("Queue is empty.");
            return 0;
        }
        return nums[getLoc++];
    }
}
