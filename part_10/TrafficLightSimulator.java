package part_10;

// A computerized traffic light

public class TrafficLightSimulator implements Runnable{
    private Thread thrd; // holds the thread that runs the simulation
    private TrafficLightColor tlc; // holds the traffic light color
    boolean stop = false; // set to true to stop the simulation
    boolean changed = false; // true when the light has changed

    public TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    public TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    // Start up the light.
    public void run() {
        while(!stop) {
            try {
                switch(tlc) {
                    case GREEN:
                        Thread.sleep(TrafficLightColor.GREEN.getDuration()); // green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(TrafficLightColor.YELLOW.getDuration()); // yellow for 2 seconds
                        break;
                    case RED:
                        Thread.sleep(TrafficLightColor.RED.getDuration()); // red for 12 seconds
                        break;
                }
            }
            catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Change color.
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }

        changed = true;
        notify(); // signal that the light has changed
    }

    // Wait until a light change occurs
    synchronized void waitForChange() {
        try {
            while(!changed) {
                wait(); // wait for light to change
            }

            changed = false;
        }
        catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Return current color.
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // Stop the traffic light.
    synchronized void cancel() {
        stop = true;
    }
}
