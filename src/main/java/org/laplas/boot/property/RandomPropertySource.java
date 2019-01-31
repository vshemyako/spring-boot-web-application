package org.laplas.boot.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.stereotype.Component;

/**
 * Test class which verifies functionality of {@link RandomValuePropertySource}
 */
@Component
@Getter
@Setter
public class RandomPropertySource {
    @Value("${integral.value.small}")
    private int randomIntegralNumber;
    @Value("${integral.value.big}")
    private long randomBigIntegralNumber;
}
