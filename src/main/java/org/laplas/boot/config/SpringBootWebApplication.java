package org.laplas.boot.config;

import org.laplas.boot.controller.WebControllerMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Spring Boot configuration class which bootstraps the application.
 *
 * @author Valentine Shemyako
 * @since January 21, 2019
 */
@ComponentScan(basePackageClasses = WebControllerMarker.class)
@EnableAutoConfiguration
public class SpringBootWebApplication {

    /**
     * Main application entry point to launch the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class);
    }
}
