package part_11;

/**
 * Modify your Queue Class so that it is completely generic
 */

class Queue<T> {
    private T[] vals;
    private int putLoc, getLoc;

    public Queue(T[] vals) {
        this.vals = vals; // T cannot be instantiated directly because it is merely a placeholder for a type.
        putLoc = getLoc = 0;
    }

    public void put(T x) {
        if (putLoc == vals.length) {
            System.out.println("Queue is full.");
            return;
        }
        vals[putLoc++] = x;
    }

    public T get() {
        if (getLoc == putLoc) {
            System.out.println("Queue is empty.");
            return null;
        }
        return vals[getLoc++];
    }
}