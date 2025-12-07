package session16.classtypes;

public class StudentRecordTest {
    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord(112345, "Filani");
        StudentRecord studentRecord2 = new StudentRecord(112346, "Filanja");
        StudentRecord studentRecord3 = new StudentRecord(112345, "Dema");
        System.out.println(studentRecord+" hash: "+studentRecord.hashCode());
        System.out.println(studentRecord2+" hash: "+studentRecord2.hashCode());
        System.out.println(studentRecord3+" hash: "+studentRecord3.hashCode());

        if(studentRecord.equals(studentRecord3)) {
            System.out.println("Student records are the same");
        }
        else {
            System.out.println("Student records are NOT the same");
        }
    }
}
