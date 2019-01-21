package org.laplas.boot.controller;

import java.util.List;
import org.laplas.boot.property.DefaultPropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple web-controller to verify that Spring Boot application is bootstrapped.
 *
 * @author Valentine Shemyako
 * @since January 21, 2019
 */
@RestController
public class BootstrapController {

    private DefaultPropertySource propertySource;

    @Autowired
    public BootstrapController(DefaultPropertySource propertySource) {
        this.propertySource = propertySource;
    }

    @GetMapping(value = "/bootstrap")
    public String bootstrap() {
        return "Spring Boot application has been successfully bootstrapped";
    }

    @GetMapping(value = "/version")
    public String version() {
        return propertySource.getVersion();
    }

    @GetMapping(value = "/developer")
    public String developer() {
        return propertySource.getDeveloper();
    }

    @GetMapping(value = "/technologies")
    public List<String> technologies() {
        return propertySource.getTechnologies();
    }
}
