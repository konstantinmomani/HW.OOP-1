public class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int wisdom;
    private final int creativity;

    public Ravenclaw(String name, String surname, int magicPower,
                     int transgression, int intelligence, int wisdom, int creativity) {
        super(name, surname, magicPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreativity() {
        return creativity;
    }
}
