public class Main {
    public static void main(String[] args) {
        GryffindorPerson[] students = new GryffindorPerson[]{
                new GryffindorPerson("Harry", "Potter", 30, 15,
                        60, 70, 85),
                new GryffindorPerson("Hermione", "Granger", 15, 10,
                        50, 65, 90),
                new GryffindorPerson("Ron", "Weasley", 10, 45,
                        55, 80, 75)
        };

        best(students);
    }
    public static void best(GryffindorPerson[] students) {
        GryffindorPerson maxFeatures = null;
        for (GryffindorPerson student : students) {
            if(maxFeatures == null || student.featuresValue() > maxFeatures.featuresValue()) {
                maxFeatures = student;
            }
        }
        System.out.println(maxFeatures.getName());
    }
}