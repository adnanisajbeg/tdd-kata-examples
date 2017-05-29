package kata.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2017-03-09
 */
public class PrimeFactors {
    public static List<Integer> generate(int i) {
        List<Integer> primes = new ArrayList<Integer>(10);

        for (int candidate = 2; i > 1; candidate++) {
            for (; i % candidate == 0; i /= candidate) {
                primes.add(candidate);
            }
        }

        return primes;
    }
}
