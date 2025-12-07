package session10;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(int id, String n) {
        this.id = id;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student st) {
            return id == st.getId();
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%d - %s", id, name);
//        return id+":"+name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
