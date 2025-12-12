package session19.service;

import session19.model.Student;

import java.io.IOException;
import java.util.List;

public interface StudentService {
    boolean create(Student student);
    void update(Student student);
    boolean delete(int id);
    Student findById(int id);
    List<Student> findAll();
}
