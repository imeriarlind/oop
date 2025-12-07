package session10;

public class FacultyTest {
    public static void main(String[] args) {
        Faculty life = new Faculty("Life", 3);

        Student st = null;
        life.enroll(st);

        Student st1 = new Student(12345, "Filani");
        life.enroll(st1);

        Student st2 = new Student(56789, "Filanja");
        life.enroll(st2);

        Student st3 = new Student(12345, "Dema"); // NUK e shton
        life.enroll(st3);

        Student st4 = new Student(78789, "Demalija");
        life.enroll(st4);

        Student st5 = new Student(45789, "John");
        life.enroll(st5);

        life.print();
        System.out.printf("Kapaciteti: %d, numri i studenteve: %d dhe vende te lira: %d%n",
                life.getCapacity(), life.getStudentCount(), life.getVacancies());

        life.dropout(st2);
        System.out.println("-------------------");
        life.print();
        System.out.printf("Kapaciteti: %d, numri i studenteve: %d dhe vende te lira: %d%n",
                life.getCapacity(), life.getStudentCount(), life.getVacancies());
    }
}
