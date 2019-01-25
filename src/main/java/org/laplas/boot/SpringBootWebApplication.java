package org.laplas.boot;

import org.laplas.boot.property.DefaultPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Main Spring Boot configuration class which bootstraps the application.
 *
 * @author Valentine Shemyako
 * @since January 21, 2019
 */
@EnableConfigurationProperties(value = DefaultPropertySource.class)
@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {

    /**
     * Main application entry point to launch the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    /**
     * Along with {@link SpringBootServletInitializer} class is a step towards
     * creation of a traditional deployable 'war' file.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootWebApplication.class);
    }
}
