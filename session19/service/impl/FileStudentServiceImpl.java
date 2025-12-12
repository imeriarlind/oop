package session19.service.impl;

import session19.model.Gender;
import session19.model.Student;
import session19.service.StudentService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;
import java.util.ListIterator;

public class FileStudentServiceImpl implements StudentService {
    String filePath = "C:/gjirafa/oop/src/main/java/students.txt";
    File file;
    public FileStudentServiceImpl() throws IOException {
        file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();
        }
    }

    @Override
    public boolean create(Student student) {
        if(student == null) {
            return false;
        }

        if(findAll().contains(student)) {
            return false;
        }

        writeStudent(student, true);
        return false;
    }

    private void writeStudent(Student student, boolean append) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(file, append));
            out.println(student);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(out != null) {
                out.close();
            }
        }
    }

    @Override
    public void update(Student student) {
        if(student == null) {
            return;
        }
        List<Student> students = findAll();
        int index = students.indexOf(student);
        if(index != -1) {
            students.set(index, student);
        }
        for (int i = 0; i < students.size(); i++) {
            writeStudent(students.get(i), i != 0 );
        }
    }

    @Override
    public boolean delete(int id) {
        Student student = findById(id);
        if(student == null) {
            return false;
        }
        List<Student> students = findAll();
        int index = students.indexOf(student);
        if(index != -1) {
            students.set(index, student);
        }
        for (int i = 0; i < students.size(); i++) {
            writeStudent(students.get(i), i != 0 );
        }
        return true;
    }

    @Override
    public Student findById(int id) {
        List<Student> students = findAll();
        for(Student student : students) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students;

        try {
            students = Files.readAllLines(file.toPath()).stream()
                    .map(s -> s.split("\\|"))
                    .filter(arr -> arr.length == 3)
                    .filter(arr -> isPositiveIntegerRegex(arr[0]))
                    .map(arr -> new Student(Integer.parseInt(arr[0].trim()), arr[1].trim(), Gender.valueOf(arr[2].trim())))
                    .toList();
        }
        catch (IOException ioe)
        {
            System.out.println(ioe.getMessage());
            students = List.of();
        }
        return students;
    }

    private boolean isPositiveIntegerRegex(String str) {
        return str != null && str.trim().matches("^[1-9]\\d*$");
    }
}
