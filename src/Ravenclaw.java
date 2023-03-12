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
    public int getIntelligence() { return intelligence; }

    public int getWisdom() { return wisdom; }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Intelligence: " + intelligence + " " +
                "Wisdom: " + wisdom + " " +
                "Creativity: " + creativity;
    }
    public int featuresValue() {
        return intelligence + wisdom + creativity;
    }
    public void compare(Ravenclaw student) {
        int sum1 = featuresValue();
        int sum2 = student.featuresValue();
        if (sum1 > sum2) {
            System.out.println(getName() + " " + getSurname() + " лучший Когтевранец, чем "
                    + student.getName() + " " + student.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем "
                    + getName() + " " + getSurname());
        } else {
            System.out.println("Студенты равны");
        }
    }
}
