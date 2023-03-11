public class Gryffindor extends Hogwarts {
    private final int honor;
    private final int courage;
    private final int nobility;

    public Gryffindor(int magicPower, int transgression, int honor, int courage, int nobility) {
        super(magicPower, transgression);
        this.honor = honor;
        this.courage = courage;
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public int getNobility() {
        return nobility;
    }
}
