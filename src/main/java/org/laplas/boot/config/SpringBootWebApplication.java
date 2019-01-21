package org.laplas.boot.config;

import org.laplas.boot.controller.WebControllerMarker;
import org.laplas.boot.property.DefaultPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Main Spring Boot configuration class which bootstraps the application.
 *
 * @author Valentine Shemyako
 * @since January 21, 2019
 */
@EnableConfigurationProperties(value = DefaultPropertySource.class)
@SpringBootApplication(scanBasePackageClasses = WebControllerMarker.class)
public class SpringBootWebApplication {

    /**
     * Main application entry point to launch the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
