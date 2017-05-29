package kata.math;

import kata.math.exceptions.IntegerException;


/**
 * @Author: Adnan Isajbegovic
 * @Created: 2017-02-22
 */
public class SumUtils {
    private SumUtils() {}

    public static Integer sumNumbers(Integer first, Integer... numbers) throws IntegerException {
        if (first == null) throw new IntegerException("Null is given!");

        if (numbers == null || numbers.length == 0) return first;

        Integer sum = first;

        for (Integer value : numbers) {
            if (value == null) throw new IntegerException("Null is given!");
            sum += value;
        }

        return sum;
    }
}
