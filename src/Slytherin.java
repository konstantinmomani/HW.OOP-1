public class Slytherin extends Hogwarts {
    private final int trickery;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, String surname, int magicPower, int transgression,
                     int trickery, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, magicPower, transgression);
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

    @Override
    public String toString() {
        return super.toString() + " " +
                "Trickery: " + trickery + " " +
                "Determination: " + determination + " " +
                "Ambition: " + ambition + " " +
                "Resourcefulness: " + resourcefulness + " " +
                "ThirstForPower: " + thirstForPower;
    }
    public int featuresValue() {
        return trickery + determination + ambition + resourcefulness + thirstForPower;
    }
    public void compare(Slytherin student) {
        int sum1 = featuresValue();
        int sum2 = student.featuresValue();
        if (sum1 > sum2) {
            System.out.println(getName() + " " + getSurname() + " лучший Слизеринец, чем "
                    + student.getName() + " " + student.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Слизеринец, чем "
                    + getName() + " " + getSurname());
        } else {
            System.out.println("Студенты равны");
        }
    }
}
