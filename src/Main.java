import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var r = new Random();
        Gryffindor harry = new Gryffindor("Harry", "Potter", r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Gryffindor granger = new Gryffindor("Hermione", "Granger", r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Gryffindor weasley = new Gryffindor("Ron", "Weasley", r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        System.out.println(harry);
        harry.printPerson();
        harry.compare(granger);
        harry.compare(weasley);

    }

}