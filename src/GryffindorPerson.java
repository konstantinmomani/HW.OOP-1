public class GryffindorPerson extends Gryffindor {
    private final String name;
    private final String surname;

    public GryffindorPerson(String name, String surname, int magicPower, int transgression, int honor,
                            int courage, int nobility) {
        super(magicPower, transgression, honor, courage, nobility);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int featuresValue() {
        int featuresSum = this.getHonor() + this.getCourage() + this.getNobility();
        return featuresSum;
    }

    @Override
    public String toString() {
        return name + " "
                + surname + " "
                + "Magic Power: " + getMagicPower() + " "
                + "Transgression: " + getTransgression() + " "
                + "Honor: " + getHonor() + " "
                + "Courage: " + getCourage() + " "
                + "Nobility: " + getNobility();
    }
    public void printPerson() {
        System.out.println(name + " "
                + surname + " "
                + "Magic Power: " + getMagicPower() + " "
                + "Transgression: " + getTransgression() + " "
                + "Honor: " + getHonor() + " "
                + "Courage: " + getCourage() + " "
                + "Nobility: " + getNobility());
    }
}
