package calculator;
import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calc = new Calculator();

    @Test
    public void squareroot_TruePositive()
    {
        assertEquals ("True Positive - Square root of an Int ", 2, calc.square_root(4), DELTA);
        assertEquals ("True Positive - Square root of an Int ", 4, calc.square_root(16), DELTA);
    }

    @Test
    public void squareroot_FalsePositive()
    {
        assertNotEquals ("False Positive - Square root of an Int ", 3, calc.square_root(7), DELTA);
        assertNotEquals ("False Positive - Square root of an Int ", 5, calc.square_root(49), DELTA);
    }

    @Test
    public void factorial_TruePositive()
    {
        assertEquals ("True Positive - factorial of an Int", 1, calc.factorial(1), DELTA);
        assertEquals ("True Positive - factorial of an Int", 120, calc.factorial(5), DELTA);
    }

    @Test
    public void factorial_FalsePositive()
    {
        assertNotEquals ("False Positive - factorial of an Int", 0, calc.factorial(0), DELTA);
        assertNotEquals ("False Positive - factorial of an Int", 12, calc.factorial(4), DELTA);
    }

    @Test
    public void log_TruePositive()
    {
        assertEquals ("True Positive - logarithm of an Int", 0, calc.log(1), DELTA);
        assertEquals ("True Positive - logarithm of an Int", 2.302585092994046, calc.log(10), DELTA);
    }

    @Test
    public void log_FalsePositive()
    {
        assertNotEquals ("False Positive - logarithm of an Int", 0, calc.log(2), DELTA);
        assertNotEquals ("False Positive - logarithm of an Int", 12, calc.log(4), DELTA);
    }

    @Test
    public void power_TruePositive()
    {
        assertEquals ("True Positive - power of base Int to power Int ", 0, calc.power(0, 1), DELTA);
        assertEquals ("True Positive - power of base Int to power Int ", 100, calc.power(10, 2), DELTA);
    }

    @Test
    public void power_FalsePositive()
    {
        assertNotEquals ("False Positive - power of base Int to power Int ", 0, calc.power(2, 0), DELTA);
        assertNotEquals ("False Positive - power of base Int to power Int ", 12, calc.power(4, 3), DELTA);
    }

    @Test
    public void sample_run(){
        assertNotEquals ("False Positive - power of base Int to power Int ", 0, calc.power(2, 0), DELTA);
        assertNotEquals ("False Positive - power of base Int to power Int ", 12, calc.power(4, 3), DELTA);
        assertEquals ("True Positive - power of base Int to power Int ", 2.302585092994046, calc.log(10), DELTA);
        assertEquals ("True Positive - power of base Int to power Int ", 1, calc.factorial(1), DELTA);
    }
}