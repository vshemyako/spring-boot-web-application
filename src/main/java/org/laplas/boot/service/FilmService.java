package org.laplas.boot.service;

import java.util.List;
import org.laplas.boot.entity.Film;
import org.laplas.boot.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Business application layer for management of {@link Film} instances.
 *
 * @author Valentine Shemyako
 * @since January 22, 2019
 */
@Service
public class FilmService {

    private FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    public Film getByName(String name) {
        return filmRepository.findByName(name);
    }

    public void remove(long id) {
        filmRepository.deleteById(id);
    }
}
