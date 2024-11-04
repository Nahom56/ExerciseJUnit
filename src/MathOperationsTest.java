import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    @Test
    public void testSubtractionPositiveResult() {
        int minuend = 10;
        int subtrahend = 5;
        int expected = 5;
        int result = MathOperations.subtraction(minuend, subtrahend);

        // Inform the user about the test being run
        System.out.println("Testing subtraction with positive result: 10 - 5 should equal 5.");
        assertEquals(expected, result, "Subtraction result was incorrect");
    }

    @Test
    public void testSubtractionNegativeResult() {
        int minuend = 5;
        int subtrahend = 10;
        int expected = -5;
        int result = MathOperations.subtraction(minuend, subtrahend);

        // Inform the user about the test being run
        System.out.println("Testing subtraction with negative result: 5 - 10 should equal -5.");
        assertEquals(expected, result, "Subtraction result was incorrect");
    }

    @Test
    public void testMultiplicationPositiveNumbers() {
        int multiplier = 4;
        int multiplicand = 5;
        int expected = 20;
        int result = MathOperations.multiplication(multiplier, multiplicand);

        // Inform the user about the test being run
        System.out.println("Testing multiplication with positive numbers: 4 * 5 should equal 20.");
        assertEquals(expected, result, "Multiplication result was incorrect");
    }

    @Test
    public void testMultiplicationWithZero() {
        int multiplier = 0;
        int multiplicand = 5;
        int expected = 0;
        int result = MathOperations.multiplication(multiplier, multiplicand);

        // Inform the user about the test being run
        System.out.println("Testing multiplication with zero: 0 * 5 should equal 0.");
        assertEquals(expected, result, "Multiplication result was incorrect");
    }
}