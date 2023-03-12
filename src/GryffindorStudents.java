import java.util.Random;

public class GryffindorStudents {
    private static Gryffindor[] gryffindors;
    Gryffindor gryffindor;

    public GryffindorStudents() {
        var r = new Random();
        Gryffindor student1 = new Gryffindor("Har", "Pot", r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Gryffindor student2 = new Gryffindor("Hermi", "Gran", r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Gryffindor student3 = new Gryffindor("Ro", "Weas", r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        gryffindors = new Gryffindor[]{student1,student2,student3};
    }

    public void print() {
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println(gryffindor);
        }
    }
    public void featuresSum() {
        int value = 0;
        for (Gryffindor gryffindor : gryffindors) {
            value = gryffindor.getCourage() + gryffindor.getNobility() + gryffindor.getHonor();
            System.out.println(gryffindor.getName() + " has features value: " + value);
        }
    }

    public void best() {
        Gryffindor maxFeatures = null;
        for (Gryffindor student : gryffindors) {
            if(maxFeatures == null || student.featuresValue() > maxFeatures.featuresValue()) {
                maxFeatures = student;
            }
        }
        System.out.println(maxFeatures.getName() + " is the best student!");
    }
}