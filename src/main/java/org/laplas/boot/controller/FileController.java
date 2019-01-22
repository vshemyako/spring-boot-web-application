package org.laplas.boot.controller;

import java.util.List;
import org.laplas.boot.entity.Film;
import org.laplas.boot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/film")
public class FileController {

    private FilmService filmService;

    @Autowired
    public FileController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public Film name(@RequestParam(value = "name") String name) {
        return filmService.getByName(name);
    }

    @GetMapping(value = "/list")
    public List<Film> list() {
        return filmService.getAll();
    }

    @DeleteMapping
    public void remove(@RequestParam(value = "id") long id) {
        filmService.remove(id);
    }
}
