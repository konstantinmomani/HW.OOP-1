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
        Slytherin malfoy = new Slytherin("Draco", "Malfoy", r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101),
                r.nextInt(101),r.nextInt(101));
        Slytherin montague = new Slytherin("Graham", "Montague", r.nextInt(101),
                r.nextInt(101),r.nextInt(101),r.nextInt(101),r.nextInt(101),
                r.nextInt(101),r.nextInt(101));
        Slytherin goyle = new Slytherin("Gregory", "Goyle", r.nextInt(101),
                r.nextInt(101), r.nextInt(101),r.nextInt(101),r.nextInt(101),
                r.nextInt(101), r.nextInt(101));
        Hufflepuff smith = new Hufflepuff("Zacharias", "Smith", r.nextInt(101),
                r.nextInt(101),r.nextInt(101),r.nextInt(101),r.nextInt(101));
        Hufflepuff diggory = new Hufflepuff("Cedric", "Diggory", r.nextInt(101),
                r.nextInt(101),r.nextInt(101),r.nextInt(101),r.nextInt(101));
        Hufflepuff finchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", r.nextInt(101),
                r.nextInt(101),r.nextInt(101),r.nextInt(101),r.nextInt(101));
        Ravenclaw chang = new Ravenclaw("Cho", "Chang", r.nextInt(101),r.nextInt(101),
                r.nextInt(101),r.nextInt(101),r.nextInt(101));
        Ravenclaw patil = new Ravenclaw("Padma", "Patil", r.nextInt(101),r.nextInt(101),
                r.nextInt(101),r.nextInt(101),r.nextInt(101));
        Ravenclaw belby = new Ravenclaw("Marcus", "Belby", r.nextInt(101),r.nextInt(101),
                r.nextInt(101),r.nextInt(101),r.nextInt(101));
        System.out.println(harry);
        harry.printPerson();
        System.out.println(malfoy);
        System.out.println(smith);
        System.out.println(patil);
        harry.compare(granger);
        malfoy.compare(goyle);
        smith.compare(diggory);
        chang.compare(belby);
        harry.compare(finchFletchley);
        weasley.compare(montague);

    }

}