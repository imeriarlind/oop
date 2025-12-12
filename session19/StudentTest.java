package session19;

import java.util.List;

import session19.controller.StudentController;
import session19.model.Student;
import session19.service.StudentService;
import session19.service.impl.StudentServiceFactory;

public class StudentTest {
    public static void main(String[] args) {
        try {
            StudentService service = StudentServiceFactory.getStudentService("jpa");
            StudentController studentController = new StudentController(service);
//            studentController.createStudent(new Student(22345, "Filani1", Gender.M));
//            studentController.createStudent(new Student(22346, "Filanja1", Gender.F));
//            studentController.createStudent(new Student(22347, "Dema1", Gender.M));
            List<Student> students = studentController.getAllStudents();
            students.stream().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
