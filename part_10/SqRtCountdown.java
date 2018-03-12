package part_10;

class SqRtCountdown implements Runnable {
    Thread t;

    public SqRtCountdown() {
        t = new Thread(this, "SqRtCountdown");
        t.start();
    }

    public void run() {
        for (double i = 100; i > 0; i--) {
            System.out.println(t.getName() + ": " + Math.sqrt(i));

            // Interrupting this loop to call synchronized method
            if (i == 50.0) {
                synced();
            }
        }
    }

    synchronized private void synced() {
        for (double i = 200; i > 100; i--) {
            System.out.println(t.getName() + " -- SYNCHRONIZED: " + Math.sqrt(i));
        }
    }
}