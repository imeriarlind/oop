package session19.service.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.NoResultException;
import session19.entity.StudentData;
import session19.exception.StudentException;
import session19.model.Student;
import session19.service.StudentService;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class JpaStudentServiceImpl implements StudentService
{
    private SessionFactory sessionFactory;

    public JpaStudentServiceImpl() {
        try {
            sessionFactory = new Configuration()
                    .configure("session19/hibernate.cfg.xml")
                    .addAnnotatedClass(StudentData.class)
                    .buildSessionFactory();
        } catch (HibernateException e) {
            throw new StudentException(e);
        }
    }

    @Override
    public boolean create(Student student) {
        try (Session session = sessionFactory.openSession()) {
            StudentData studentData = toStudentData(student);
            Transaction trx = session.beginTransaction();
            session.persist(studentData);
            trx.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }

    }

    @Override
    public void update(Student student) {
        try (Session session = sessionFactory.openSession()) {
            StudentData studentData = toStudentData(student);
            Transaction trx = session.beginTransaction();
            session.merge(studentData);
            trx.commit();
        } catch (HibernateException e) {
            throw new StudentException(e);
        }
    }

    @Override
    public boolean delete(int id) {
        try (Session session = sessionFactory.openSession()) {
            StudentData studentData = session.createNamedQuery("StudentData.findById", StudentData.class)
                    .setParameter("id", id)
                    .getSingleResult();
            if (Objects.nonNull(studentData)) {
                Transaction trx = session.beginTransaction();
                session.remove(studentData);
                trx.commit();
                return true;
            }
            return false;
        } catch (NoResultException nre) {
            return false;
        } catch (HibernateException e) {
            throw new StudentException(e);
        }
    }

    @Override
    public Student findById(int id) {
        Student student;
        try (Session session = sessionFactory.openSession()) {
            StudentData studentData = session.createNamedQuery("StudentData.findById", StudentData.class)
                    .setParameter("id", id)
                    .getSingleResult();
            student = fromStudentData(studentData);
        }
        catch (NoResultException nre) {
            student = null;
        }
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList;
        try (Session session = sessionFactory.openSession()) {
            List<StudentData> resultList = session.createQuery("SELECT s FROM StudentData s", StudentData.class)
                    .getResultList();
            studentList = fromStudentData(resultList);
        }
        return studentList;
    }

    public Student fromStudentData(StudentData studentData) {
        return new Student(studentData.getId(), studentData.getName(), studentData.getGender());
    }

    public StudentData toStudentData(Student student) {
        return new StudentData(student.getId(), student.getName(), student.getGender());
    }

    public List<Student> fromStudentData(List<StudentData> students) throws StudentException {
        return students.stream().map(this::fromStudentData).toList();
    }
}
