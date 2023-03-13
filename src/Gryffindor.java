public class Gryffindor extends Hogwarts {
    private final int honor;
    private final int courage;
    private final int nobility;

    public Gryffindor(String name, String surname, int magicPower, int transgression,
                      int honor, int courage, int nobility) {
        super(name, surname, magicPower, transgression);
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

    @Override
    public String toString() {
        return super.toString() + " "
                + "Honor: " + getHonor() + " "
                + "Courage: " + getCourage() + " "
                + "Nobility: " + getNobility();
    }
    public void printPerson() {
        System.out.println(getName() + " "
                + getSurname() + " "
                + "Magic Power: " + getMagicPower() + " "
                + "Transgression: " + getTransgression() + " "
                + "Honor: " + getHonor() + " "
                + "Courage: " + getCourage() + " "
                + "Nobility: " + getNobility());
    }
    public int featuresValue() {
        return honor + courage + nobility;
    }
    public void compare(Gryffindor student) {
        int sum1 = featuresValue();
        int sum2 = student.featuresValue();
        if (sum1 > sum2) {
            System.out.println(getName() + " " + getSurname() + " лучший Гриффендорец, чем "
                    + student.getName() + " " + student.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффендорец, чем "
                    + getName() + " " + getSurname());
        } else {
            System.out.println("Студенты равны");
        }
    }
}