package part_10;

public class AddFive extends Thread {

    public AddFive() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i += 5) {
            System.out.println("AddFive: " + i);
        }
    }
}
