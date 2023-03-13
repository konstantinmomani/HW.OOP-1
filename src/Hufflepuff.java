public class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, String surname, int magicPower,
                      int transgression, int diligence, int loyalty, int honesty) {
        super(name, surname, magicPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Diligence: " + diligence + " " +
                "Loyalty: " + loyalty + " " +
                "Honesty: " + honesty;
    }
    public int featuresValue() {
        return diligence + loyalty + honesty;
    }
    public void compare(Hufflepuff student) {
        int sum1 = featuresValue();
        int sum2 = student.featuresValue();
        if (sum1 > sum2) {
            System.out.println(getName() + " " + getSurname() + " лучший Пуффендуец, чем "
                    + student.getName() + " " + student.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Пуффендуец, чем "
                    + getName() + " " + getSurname());
        } else {
            System.out.println("Студенты равны");
        }
    }
}
