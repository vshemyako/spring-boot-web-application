package org.laplas.boot.config;

import org.laplas.boot.controller.WebLayerMarker;
import org.laplas.boot.entity.EntityMarker;
import org.laplas.boot.property.DefaultPropertySource;
import org.laplas.boot.repository.DaoLayerMarker;
import org.laplas.boot.service.BusinessLayerMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Spring Boot configuration class which bootstraps the application.
 *
 * @author Valentine Shemyako
 * @since January 21, 2019
 */
@EntityScan(basePackageClasses = EntityMarker.class)
@EnableJpaRepositories(basePackageClasses = DaoLayerMarker.class)
@EnableConfigurationProperties(value = DefaultPropertySource.class)
@SpringBootApplication(scanBasePackageClasses = {WebLayerMarker.class, BusinessLayerMarker.class})
public class SpringBootWebApplication {

    /**
     * Main application entry point to launch the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
