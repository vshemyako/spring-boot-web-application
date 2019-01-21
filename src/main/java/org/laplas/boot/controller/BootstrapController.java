package org.laplas.boot.controller;

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

    @GetMapping(value = "/bootstrap")
    public String bootstrap() {
        return "Spring Boot application has been successfully bootstrapped";
    }
}
