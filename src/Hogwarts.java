public class Hogwarts {
    private final String name;
    private final String surname;
    private final int magicPower;
    private final int transgression;

    public Hogwarts(String name, String surname, int magicPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + "Magic Power: " + magicPower + " " + " Transgression: " + transgression;
    }
    public void compare(Hogwarts student) {
        if (magicPower > student.magicPower) {
            System.out.println(name + " " + surname + " обладает большей силой магии, чем "
                    + student.getName() + " " + student.getSurname());
        } else if (student.magicPower > magicPower) {
            System.out.println(student.getName() + " " + student.getSurname() + " обладает большей силой магии, чем "
                    + name + " " + surname);
        } else {
            System.out.println("Сила магии равная");
        }
        if (transgression > student.transgression) {
            System.out.println(name + " " + surname + " обладает большей трансгрессией, чем "
                    + student.getName() + " " + student.getSurname());
        } else if (student.transgression > transgression) {
            System.out.println(student.getName() + " " + student.getSurname() + " обладает большей трансгрессией, чем "
                    + name + " " + surname);
        } else {
            System.out.println("Трансгрессия равная");
        }
    }
}
