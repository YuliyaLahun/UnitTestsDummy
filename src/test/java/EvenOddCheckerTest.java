import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class EvenOddCheckerTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void messageTestForEvenNumber() {
        final String testString = "Enter an Integer number:\n" +
                "Entered number is even\n";
        provideInput(testString);

        EvenOddChecker.check(20);

        assertEquals(testString, getOutput());
    }

    @Test
    public void messageTestForOddNumber() {
        final String testString = "Enter an Integer number:\n" +
                "Entered number is odd\n";
        provideInput(testString);

        EvenOddChecker.check(21);

        assertEquals(testString, getOutput());
    }

    @Test
    public void checkEvenNumber() {
        assertTrue("", EvenOddChecker.check(20));
    }

    @Test
    public void checkOddNumber() {
        assertFalse("", EvenOddChecker.check(21));
    }
}