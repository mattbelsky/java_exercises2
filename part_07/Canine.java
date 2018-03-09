package part_07;

public class Canine implements CanineInterface {
    private boolean hasCanineTeeth;
    private boolean wagsTailWhenHappy;
    private boolean commonlyDomesticated;
    private String barkType; // shrill, deep, etc.
    private String subFamily;

    public Canine(boolean commonlyDomesticated, String barkType) {
        hasCanineTeeth = true;
        wagsTailWhenHappy = true;
        this.commonlyDomesticated = commonlyDomesticated;
        this.barkType = barkType;
        this.subFamily = "Caninae";
    }

    public Canine(boolean commonlyDomesticated) {
        hasCanineTeeth = true;
        wagsTailWhenHappy = true;
        this.commonlyDomesticated = commonlyDomesticated;
        this.barkType = barkType;
        this.subFamily = "Caninae";
    }

    public void bite() {
        System.out.println("Bite");
    }

    public void bark() {
        System.out.println("Bark");
    }

    public void wagTail() {
        System.out.println("Wags tail");
    }
}
