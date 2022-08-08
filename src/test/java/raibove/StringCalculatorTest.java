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
}
