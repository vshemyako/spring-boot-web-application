package org.laplas.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * A motion picture.
 *
 * @author Valentine Shemyako
 * @since January 22, 2019
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String director;
    private String name;

    public Film(String director, String name) {
        this.director = director;
        this.name = name;
    }
}
