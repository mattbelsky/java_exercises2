package part_06;

public class Controller {
    public static void main(String[] args) {
        Computer comp = new Computer();
        Smartphone smrt = new Smartphone();

        Computer compRef = comp;
        compRef.readDrive();

        compRef = smrt;
        smrt.readDrive();
    }
}
