package part_09;

// Use wait() and notify() to create a ticking clock.

class TickTock {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {

        /*  Checks clock state
            If state is "ticked"
                Notifies any waiting threads
                Exits method
         */
        if(!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        /*  If state != "ticked" (I understand this as an implicit if)
                Prints "Tick "
                Changes state to "ticked"
                Notifies waiting threads
                Pauses execution while it waits for tock() to execute
         */
        System.out.print("Tick ");

        // Suspends execution for half a second
        try {
            Thread.sleep(500l);
        }
        catch (InterruptedException exc) {
            // Do nothing with exception.
        }

        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run
        try {
            while(!state.equals("tocked"))
                wait(); // wait for tock() to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            //notify(); // notify any waiting threads
            return;
        }

        System.out.println("Tock");

        // Suspends execution for half a second
        try {
            Thread.sleep(500l);
        }
        catch (InterruptedException exc) {
            // Do nothing with exception.
        }

        state = "tocked"; // set the current state to tocked

        notify(); // let tick() run
        try {
            while(!state.equals("ticked"))
                wait(); // wait for tick to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}