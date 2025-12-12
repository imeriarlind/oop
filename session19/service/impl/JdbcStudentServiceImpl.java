package session19.service.impl;

import session19.model.Gender;
import session19.model.Student;
import session19.repository.ConnectionService;
import session19.service.StudentService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentServiceImpl implements StudentService {

    private Connection connection;

    public JdbcStudentServiceImpl() throws SQLException {
        connection = ConnectionService.getConnection();
    }

    @Override
    public boolean create(Student student) {
        try(PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (id, name, gender) VALUES (?, ?, ?)"))
        {
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getGender().name());
            int row = preparedStatement.executeUpdate();
            connection.commit();
            return row > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Student student) {
        try(PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student set name = ?, gender = ? WHERE id = ?)"))
        {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getGender().name());
            preparedStatement.setInt(3, student.getId());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(int id) {
        try(PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM student WHERE id = ?)"))
        {
            preparedStatement.setInt(1, id);
            int rows = preparedStatement.executeUpdate();
            connection.commit();
            return rows > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findById(int id) {
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, name, gender FROM student WHERE id = ?)"))
        {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return toStudent(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        List <Student> students = new ArrayList<>();
        try(Statement statement = connection.createStatement())
        {
            ResultSet resultSet = statement.executeQuery("SELECT id, name, gender FROM student");
            while(resultSet.next())
            {
                students.add(toStudent(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    private Student toStudent(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        Gender gender = Gender.valueOf(resultSet.getString("gender"));
        return new Student(id, name, gender);
    }
}
