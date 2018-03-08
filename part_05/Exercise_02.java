package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class ViolinController {
    public static void main(String[] args) {
        Violin myViolin = new Violin();

        // Displays properties, showing that instance variables HAVE NOT yet been initialized manually
        displayProperties(myViolin);

        // Initializing myViolin's instance variables by passing object to initViolin.
        initViolin(myViolin);

        // Displays properties, showing that instance variables HAVE been initialized.
        displayProperties(myViolin);
    }

    // Initializes the Violin object's instance variables.
    public static void initViolin(Violin mv) {
        mv.setMake("Stradivarius");
        mv.setNumStrings(4);
        mv.setAcoustic(true);
        tune(mv);
    }

    // Tunes the violin.
    public static void tune(Violin mv) {
        if (!mv.isInTune()) {
            mv.setInTune(true);
        }
    }

    // Demonstrating that myViolin's instance variables are not initialized.
    public static void displayProperties(Violin mv) {
        System.out.println("Make:\t\t\t\t" + mv.getMake());
        System.out.println("Number of strings:\t" + mv.getNumStrings());
        System.out.println("Is it acoustic?\t\t" + mv.isAcoustic());
        System.out.println("Is it in tune?\t\t" + mv.isInTune());
        System.out.println();
    }
}

class Violin {
    private String make;
    private int numStrings;
    private boolean isAcoustic;
    private boolean inTune;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public boolean isAcoustic() {
        return isAcoustic;
    }

    public void setAcoustic(boolean acoustic) {
        isAcoustic = acoustic;
    }

    public boolean isInTune() {
        return inTune;
    }

    public void setInTune(boolean inTune) {
        this.inTune = inTune;
    }
}