package session19.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private Gender gender;

    @Override
    public String toString() {
        return String.format("%d|%s|%s", id, name, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Student other) {
            return id == other.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
