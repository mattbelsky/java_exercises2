package part_07;

import part_07.Canine;

public class Fox extends Canine {
    private boolean hasBushyTail;
    private boolean solitary;
    private String genus;

    public Fox(String barkType, String genus) {
        super(false, barkType);
        this.genus = genus;
        hasBushyTail = true;
        solitary = true;
    }

    public void pounce() {} // unique hunting behavior

    public void cacheExcessFood() {}

    public void tryToReachGrapes() {} // from fable about the fox and the grapes
}
