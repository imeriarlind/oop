package session19.controller;

import session19.model.Student;
import session19.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void createStudent(Student student) {
        studentService.create(student);
    }

    public List<Student> getAllStudents() {
        return studentService.findAll();
    }
}
