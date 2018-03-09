package part_06;

public class Smartphone extends Computer {
    private double screenSize; // inches
    private int batteryCapacity; // mAh
    private boolean isIphone;
    private double mainCameraMegaPixels;

    public Smartphone(String cpu, int amountRAM, int amountStorage, int numUSBPorts, boolean hasOpticalDrive,
                      double screenSize, int batteryCapacity, boolean isIphone, double mainCameraMegaPixels) {
        super(cpu, amountRAM, amountStorage, numUSBPorts, hasOpticalDrive);
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.isIphone = isIphone;
        this.mainCameraMegaPixels = mainCameraMegaPixels;
    }

    public Smartphone(String cpu, int amountRAM, int numPermanentDrives, int amountStorage, int numUSBPorts, boolean hasOpticalDrive,
                      double screenSize, int batteryCapacity, boolean isIphone, double mainCameraMegaPixels) {
        super(cpu, amountRAM, numPermanentDrives, amountStorage, numUSBPorts, hasOpticalDrive);
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.isIphone = isIphone;
        this.mainCameraMegaPixels = mainCameraMegaPixels;
    }

    public Smartphone() {
        super();
    }

    public void toggleOnOff() {
        super.toggleOnOff();
    }

    @Override
    public void readDrive() {
        // Actions involving reading a SSD
        System.out.println("Reading drive from Smartphone class.");
    }
}
