public class Hogwarts {
    private final int magicPower;
    private final int transgression;

    public Hogwarts(int magicPower, int transgression) {
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }
}
