import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class TestApp extends TestCase{

        App calculator = new App();
        public void testMain() {
        }

    @Test
    public void testFactTruePositive() {
        assertEquals("Factorial of number for True Positive ",1.0,calculator.Factorial(0));
        assertEquals("Factorial of number for True Positive",1.0,calculator.Factorial(1));
        assertEquals("Factorial of number for True Positive",720.0,calculator.Factorial(6));
    }


    public void testFactFalsePositive() {
        assertNotEquals("Factorial of number for False Positive ",0.0,calculator.Factorial(0));
        assertNotEquals("Factorial of number for False Positive",0.0,calculator.Factorial(1));
        assertNotEquals("Factorial of number for False Positive",0.0,calculator.Factorial(6));
    }

    public void testSquareRootTruePositive() {
        assertEquals("Square Root of number for True Positive ",0.0,calculator.SquareRoot(0));
        assertEquals("Square Root of number for True Positive",1.0,calculator.SquareRoot(1));
        assertEquals("Square Root of number for True Positive",4.0,calculator.SquareRoot(16));

    }

    public void testSquareRootFalsePositive() {
        assertNotEquals("Square Root of number for False Positive ",1.0,calculator.SquareRoot(0));
        assertNotEquals("Square Root of number for False Positive",-1.0,calculator.SquareRoot(1));
        assertNotEquals("Square Root of number for False Positive",20.0,calculator.SquareRoot(4));

    }
    public void testLogarithmTruePositive() {
        assertEquals("Logarithm of number for True Positive ",0.0,calculator.NaturalLogarithm(1));
    }

    public void testPowerTruePositive() {
        assertEquals("Power of number for True Positive ",1.0,calculator.Power(0,0));
        assertEquals("Power of number for True Positive",8.0,calculator.Power(2,3));
        assertEquals("Power of number for True Positive",-1.0,calculator.Power(-1,3));
    }

    public void testPowerFalsePositive() {
        assertNotEquals("Power of number for false Positive ",0,calculator.Power(0,0));
        assertNotEquals("Power of number for false Positive",6,calculator.Power(2,3));
        assertNotEquals("Power of number for false Positive",1,calculator.Power(-1,3));
    }


}
