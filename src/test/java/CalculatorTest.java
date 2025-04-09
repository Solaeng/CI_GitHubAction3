import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();

        int result = calc.add(3,5);

        assertEquals( 8, result);

    }
}
