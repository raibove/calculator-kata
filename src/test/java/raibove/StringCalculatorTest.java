package raibove;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    void shouldReturnSumOfStringNumbers(){
        StringCalculator stringCalculator = new StringCalculator();
        String numbers = "";

        int expectedSum = 0;
        int actualSum = stringCalculator.add(numbers);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldReturnOneAsSumWhenStringIsOne(){
        StringCalculator stringCalculator = new StringCalculator();
        String numbers = "1";

        int expectedSum = 1;
        int actualSum = stringCalculator.add(numbers);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldReturnThreeAsSumWhenStringIsOneAndTwo(){
        StringCalculator stringCalculator = new StringCalculator();
        String numbers = "1,2";

        int expectedSum = 3;
        int actualSum = stringCalculator.add(numbers);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldReturnSixAsSumWhenStringIsOneTwoAndThree(){
        StringCalculator stringCalculator = new StringCalculator();
        String numbers = "1,2,3";

        int expectedSum = 6;
        int actualSum = stringCalculator.add(numbers);

        assertEquals(expectedSum, actualSum);
    }
}
