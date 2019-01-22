package org.laplas.boot.repository;

import org.laplas.boot.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Instant Spring data repository to manage {@link Film} entities.
 *
 * @author Valentine Shemyako
 * @since January 22, 2019
 */
public interface FilmRepository extends JpaRepository<Film, Long> {
    Film findByName(String name);
}
