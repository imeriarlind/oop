package session19.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import session19.model.Gender;

@Entity
@Table(name = "STUDENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
    @NamedQuery(name = "StudentData.findById", query = "SELECT s FROM StudentData s WHERE s.id = :id"),
    @NamedQuery(name = "StudentData.findAll", query = "SELECT s FROM StudentData s")
})
public class StudentData {
  @Id
  private int id;
  @Column
  private String name;

  @Enumerated(value = EnumType.STRING)
  private Gender gender;
}
