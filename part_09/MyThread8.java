package part_09;

class MyThread8 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Construct a new thread.
    MyThread8(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread.

    // So I understand, this is a single thread with two separate synchronized methods in the TickTock class.
    // Why not simply include TickTock methods in this class? Wouldn't it be simpler?
    public void run() {

        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++)
                ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}