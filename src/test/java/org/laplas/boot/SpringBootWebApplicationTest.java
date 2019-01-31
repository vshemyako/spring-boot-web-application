package org.laplas.boot;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.laplas.boot.controller.FilmController;
import org.laplas.boot.entity.Film;
import org.laplas.boot.property.RandomPropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Verifies that Spring Boot application context will be picked up properly.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootWebApplicationTest {

    private static final String API_FILM = "http://localhost:%s/film?name={name}";

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private RandomPropertySource propertySource;

    @Test
    public void shouldPickUpContext() {
    }

    /**
     * Integration test using Spring Boot facilities.
     * In particular functionality of {@link FilmController} is being tested.
     */
    @Test
    public void shouldReturnFilm() {
        ResponseEntity<Film> responseEntity = restTemplate.getForEntity(
                String.format(API_FILM, port),
                Film.class,
                Collections.singletonMap("name", "The Godfather")
        );

        Film film = responseEntity.getBody();
        assertThat(film).isNotNull();
        assertThat(film.getName()).isEqualTo("The Godfather");
        assertThat(film.getDirector()).isEqualTo("Francis Ford Coppola");
    }

    @Test
    public void shouldAssignRandomIntValue() {
        assertThat(propertySource.getRandomIntegralNumber()).isNotNull();
    }

    @Test
    public void shouldAssignRandomLongValue() {
        assertThat(propertySource.getRandomBigIntegralNumber()).isNotNull();
    }
}