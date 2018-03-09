package part_06;

public class Iphone extends Smartphone {
    private String version;
    private String os;

    public Iphone(String cpu, int amountRAM, int amountStorage, int numUSBPorts, boolean hasOpticalDrive,
                  double screenSize, int batteryCapacity, boolean isIphone, double mainCameraMegaPixels,
                  String version, String os) {
        super(cpu, amountRAM, amountStorage, numUSBPorts, hasOpticalDrive, // to be passed grandparent class
              screenSize, batteryCapacity, isIphone, mainCameraMegaPixels); // passed to parent class
        this.version = version;
        this.os = os;
    }

    public Iphone() {
        super();
    }
}
