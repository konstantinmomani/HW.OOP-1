public class Slytherin extends Hogwarts {
    private final int trickery;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(int magicPower, int transgression, int trickery,
                     int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgression);
        this.trickery = trickery;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTrickery() {
        return trickery;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

}
