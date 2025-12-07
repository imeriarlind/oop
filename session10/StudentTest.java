package session10;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(12345, "Filani");
        System.out.println(s1);
//        System.out.printf("%d: %s%n",s1.getId(),s1.getName());

        Student s2 = new Student(56789, "Filanja");
        System.out.println(s2);
//        System.out.printf("%d: %s%n",s2.getId(),s2.getName());

        Student s3 = new Student(12345, "Dema");
        System.out.println(s2);
//        System.out.printf("%d: %s%n",s2.getId(),s2.getName());

        Student s4 = null;
        System.out.println(s4);

                s1.setName("Filan Fisteku");
        System.out.printf("Pas ndryshimit %d: %s%n",s1.getId(),s1.getName());


        if(s1.equals(s3))
        {
            System.out.println("Dy studentet jane te barabarte");
        }
        else {
            System.out.println("Dy studentet NUK jane te barabarte");
        }

        if(s1.hashCode() == s3.hashCode())
        {
            System.out.println("Dy studentet jane te barabarte me hashcode");
        }
        else
        {
            System.out.println("Dy studentet NUK jane te barabarte me hashcode");
        }
    }
}
