import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final int x = 10;
    private final int y = 5;
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals("Calculator add failed!", 15, calculator.add(x, y));
    }

    @Test
    public void subtractTest() {
        assertEquals("Calculator subtract failed!", 5, calculator.subtract(x, y));
    }

    @Test
    public void multiplyTest() {
        assertEquals("Calculator multiply failed!", 50, calculator.multiply(x, y));
    }

    @Test
    public void divideTest() {
        assertEquals("Calculator divide failed!", 2, calculator.divide(x, y));

    }
}