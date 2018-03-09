package part_07;

public class Dog extends Canine {
    private boolean social;
    private boolean playsFetch;
    private String use; // pet, police dog, etc.
    private String genus;
    private String species;

    public Dog(String barkType, String use) {
        super(true, barkType);
        social = true;
        playsFetch = true;
        genus = "Canis";
        species = "lupus";
        this.use = use;
    }

    public Dog(String use) {
        super(true);
        social = true;
        playsFetch = true;
        genus = "Canis";
        species = "lupus";
        this.use = use;
    }

    public void playFetch() {}

    public void begForBellyRub() {}

    public void begForWalk() {}
}
