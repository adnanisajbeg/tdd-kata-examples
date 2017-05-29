package kata.math;

import kata.math.exceptions.IntegerException;
import org.junit.Test;

import static kata.math.SumUtils.sumNumbers;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2017-02-22
 */
public class SumUtils_Test {
    Fixture fixture = new Fixture();

    @Test(expected = IntegerException.class)
    public void sum_when_only_null_is_given() throws IntegerException {
        sumNumbers(null);
    }

    @Test(expected = IntegerException.class)
    public void sum_when_first_value_is_null() throws IntegerException {
        sumNumbers(null, fixture.numberTwo);
    }

    @Test
    public void sum_when_one_value_is_given() throws IntegerException {
        Integer sum = sumNumbers(fixture.numberOne);
        assertThat(sum).isNotNull().isEqualTo(fixture.numberOne);
    }

    @Test
    public void sum_two_numbers() throws IntegerException {
        Integer result = sumNumbers(fixture.numberOne, fixture.numberTwo);
        assertThat(result).isNotNull().isEqualTo(fixture.sumNumberOneWithNumberTwo);
    }

    @Test(expected = IntegerException.class)
    public void sum_three_numbers_where_one_is_null() throws IntegerException {
        sumNumbers(fixture.numberOne, fixture.numberTwo, null);
    }

    @Test
    public void sum_three_numbers() throws IntegerException {
        Integer result = sumNumbers(fixture.numberOne, fixture.numberTwo, fixture.numberThree);
        assertThat(result).isEqualTo(fixture.sumOfThreeNumbers);
    }

    @Test(expected = IntegerException.class)
    public void sum_when_given_null() throws IntegerException {
        sumNumbers(fixture.numberOne, fixture.numberTwo, null);
    }

    private class Fixture {
        private final Integer numberOne;
        private final Integer numberTwo;
        private final Integer numberThree;


        private final Integer sumNumberOneWithNumberTwo;
        private final Integer sumOfThreeNumbers;

        private Fixture() {
            numberOne = 1;
            numberTwo = 2;
            numberThree = 3;

            sumNumberOneWithNumberTwo = 3;
            sumOfThreeNumbers = 6;
        }
    }
}
