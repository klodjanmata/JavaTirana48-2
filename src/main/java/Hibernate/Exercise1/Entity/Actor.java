package Hibernate.Exercise1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "actors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "yearofbirth")
    private int birthday;
    @ManyToMany
    @JoinTable(name = "actors_to_movies",
            joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "id"))
    private List<Movie> movies = new ArrayList<>();

    @Override
    public String toString() {
        return "Author--> " +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", surname: '" + lastName + '\'' +
                ", birthday: " + birthday;
    }
}