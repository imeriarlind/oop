package session10;

public class Faculty {
    private String name;
    private Student [] students;
    private int index;

    public Faculty(String name, int size) {
        this.name = name;
        students = new Student[size];
    }

    public int getCapacity()
    {
        return students.length;
    }

    public int getStudentCount()
    {
        return index;
    }

    public int getVacancies()
    {
        return students.length - index;
    }

    public void enroll(Student student)
    {
        if(student == null)
        {
            System.out.println("Studenti nuk eshte i inicializuar");
        }
        else if (index == students.length)
        {
            System.out.printf("Nuk ka vend per studentin: %s%n",student);
        }
        else if (contains(student))
        {
            System.out.printf("Studenti me id %d veqse eshte regjistruar%n",student.getId());
        }
        else {
            students[index++] = student;
        }
    }

    public void dropout(Student student)
    {
        if(student == null)
        {
            System.out.println("dropout: Studenti nuk eshte i inicializuar");
        }
        else {
            int idx = indexOf(student);
            if(idx == -1)
            {
                System.out.printf("Studenti me id %d nuk gjindet ne kete fakultet%n",student.getId());
            }
            else {
                students[idx] = students[--index];
                students[index] = null;
            }
        }

    }

    private int indexOf(Student student)
    {
        for (int i = 0; i < index; i++) {
            if(students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    private boolean contains(Student student) {
        return indexOf(student) != -1;
//        for (int i = 0; i < index; i++) {
//            if(students[i].equals(student))
//            {
//                return true;
//            }
//        }
//        return false;
    }

    public void print()
    {
        System.out.println(name);
        System.out.println("======================");
        for (int i = 0; i < index; i++) {
            System.out.printf("%d) %s%n", i+1, students[i]);
        }

//        for(Student student : students)
//        {
//            System.out.println(student);
//        }

    }
}
