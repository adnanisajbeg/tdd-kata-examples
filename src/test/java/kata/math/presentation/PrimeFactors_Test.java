package kata.math.presentation;

import org.junit.Test;

import java.util.List;

import static kata.math.presentation.PrimeFactors.generate;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2017-03-10
 */
public class PrimeFactors_Test {
    @Test
    public void test_negative() {
        // When
        List<Integer> primeFactors = generate(-1);

        // Then
        assertThat(primeFactors).isNotNull().isEmpty();
    }
}
