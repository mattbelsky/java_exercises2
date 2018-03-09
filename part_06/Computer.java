package part_06;

public class Computer {
    private String cpu;
    private int amountRAM; // GB
    private int numPermanentDrives;
    private int amountStorage; // GB
    private int numUSBPorts;
    private boolean hasOpticalDrive;

    public Computer(String cpu, int amountRAM, int amountStorage, int numUSBPorts, boolean hasOpticalDrive) {
        this.cpu = cpu;
        this.amountRAM = amountRAM;
        this.amountStorage = amountStorage;
        this.numUSBPorts = numUSBPorts;
        this.hasOpticalDrive = hasOpticalDrive;
    }

    public Computer(String cpu, int amountRAM, int numPermanentDrives, int amountStorage, int numUSBPorts, boolean hasOpticalDrive) {
        this.cpu = cpu;
        this.amountRAM = amountRAM;
        this.numPermanentDrives = numPermanentDrives;
        this.amountStorage = amountStorage;
        this.numUSBPorts = numUSBPorts;
        this.hasOpticalDrive = hasOpticalDrive;
    }

    public Computer() {}

    public void toggleOnOff() {
    }

    public void readDrive() {
        // Actions that involve reading HDD
        System.out.println("Reading drive from Computer class.");
    }
}
