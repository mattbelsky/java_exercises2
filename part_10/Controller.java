package part_10;

public class Controller {
    public static void main(String[] args) throws InterruptedException {

        SqRtCountdown countdown = new SqRtCountdown();
        countdown.t.setPriority(Thread.MAX_PRIORITY);

        AddFive plusFive = new AddFive();
        plusFive.join(2000l);

        for (double i = 1; i < 100; i++) {
            System.out.println("CountUP: " + Math.sqrt(i));
        }
    }
}