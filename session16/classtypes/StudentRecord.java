package session16.classtypes;

import java.util.Objects;

public record StudentRecord (int id, String name) {
    public StudentRecord {
        if(name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
    }

    @Override
    public String toString() {
        return "%d: %s".formatted(this.id, this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof StudentRecord rec) {
            return id == rec.id;
        }
        return false;
    }
}
