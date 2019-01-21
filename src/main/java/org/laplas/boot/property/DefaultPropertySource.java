package org.laplas.boot.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Basic properties-holder class to verify workings of {@link ConfigurationProperties} annotation.
 *
 * @author Valentine Shemyako
 * @since January 21, 2019
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "application")
public class DefaultPropertySource {
    private String version;
    private String developer;
}
