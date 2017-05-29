package kata.math;

import org.junit.Test;

import java.util.List;

import static kata.math.PrimeFactors.generate;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2017-03-09
 */
public class PrimeFactors_Test {

    @Test
    public void test_zero() {
        // When
        List<Integer> primeFactors = generate(0);

        // Then
        assertThat(primeFactors).isNotNull().isEmpty();
    }

    @Test
    public void test_negative() {
        // When
        List<Integer> primeFactors = generate(-1);

        // Then
        assertThat(primeFactors).isNotNull().isEmpty();
    }

    @Test
    public void test_one() {
        // When
        List<Integer> primeFactors = generate(1);

        // Then
        assertThat(primeFactors).isNotNull().isEmpty();
    }

    @Test
    public void test_two() {
        // When
        List<Integer> primeFactors = generate(2);

        // Then
        assertThat(primeFactors).containsExactly(2);
    }

    @Test
    public void test_three() {
        // When
        List<Integer> primeFactors = generate(3);

        // Then
        assertThat(primeFactors).containsExactly(3);
    }

    @Test
    public void test_four() {
        // When
        List<Integer> primeFactors = generate(4);

        // Then
        assertThat(primeFactors).containsExactly(2, 2);
    }

    @Test
    public void test_five() {
        // When
        List<Integer> primeFactors = generate(5);

        // Then
        assertThat(primeFactors).containsExactly(5);
    }

    @Test
    public void test_six() {
        // When
        List<Integer> primeFactors = generate(6);

        // Then
        assertThat(primeFactors).containsExactly(2, 3);
    }

    @Test
    public void test_eight() {
        // When
        List<Integer> primeFactors = generate(8);

        // Then
        assertThat(primeFactors).containsExactly(2, 2, 2);
    }

    @Test
    public void test_large() {
        // When
        List<Integer> primeFactors = generate(660);

        // Then
        assertThat(primeFactors).containsExactly(2, 2, 3, 5, 11);
    }
}
