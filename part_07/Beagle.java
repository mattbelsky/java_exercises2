package part_07;

public class Beagle extends Dog {
    private String variety; // medium, dwarf, etc.
    private String temperament;
    private String senseOfSmell;

    public Beagle(String barkType, String use, String variety) {
        super(barkType, use);
        this.variety = variety;
        temperament = "merry, intelligent, single-minded";
        senseOfSmell = "superior";
    }

    public Beagle(String use, String variety) {
        super(use);
        this.variety = variety;
        temperament = "merry, intelligent, single-minded";
        senseOfSmell = "superior";
    }

    public void howl() {}

    public void reverseSneeze() {}

    public void huntRabbit() {}
}
